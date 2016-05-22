package stepdefs;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.Client;
import pages.Address;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by Kate on 09/05/2016.
 */


public class ff {
    @BeforeClass
    /*
    public static void setUp() {
        FixtureFactoryLoader.loadTemplates("br.com.six2six.template");
    }
     */
    public static void setUp() {
        ClientTemplateLoader clientTemplateLoader = new ClientTemplateLoader();
        clientTemplateLoader.load();
        FixtureFactoryLoader.loadTemplates("pages");
    }

    @Test
    public void fixtureClient() {
        Client client = Fixture.from(Client.class).gimme("valid");
        assertNotNull("Client should not be null", client);
        assertNotNull("Address should not be null", client.getAddress());

        Calendar expectedAge = Calendar.getInstance();
        expectedAge.add(Calendar.YEAR, -18);
        String expectedStringBirthday = new SimpleDateFormat("dd/MM/yyyy").format(expectedAge.getTime());
        assertEquals("client birthday should be 18 years ago", expectedAge.get(Calendar.YEAR), client.getBirthday().get(Calendar.YEAR));
        assertEquals(expectedStringBirthday, client.getBirthdayAsString());
    }

    @Test
    public void fixtureAddress() {
        Address address = Fixture.from(Address.class).gimme("valid-augusta");
        assertNotNull("Address should not be null", address.getId());
        assertEquals("Augusta Street", address.getStreet());
    }

    @Test
    public void fixtureClientList() {
        List<Client> clients = Fixture.from(Client.class).gimme(5, "valid");

        assertNotNull("Client list should not be null", clients);
        assertFalse("Client list should not be empty", clients.isEmpty());
        assertEquals("Client list size should be 5", clients.size(), 5);

        for (Client client : clients) {
            assertNotNull("Client should not be null", client);
            assertNotNull("Address should not be null", client.getAddress());
        }
    }

    @Test
    public void fixtureClientWithOverridedProperty() {
        Client client = Fixture.from(Client.class).gimme("valid", new Rule() {
            {
                add("name", "Fixture Factory");
            }
        });

        assertEquals("Fixture Factory", client.getName());
    }

    @Test
    public void fixtureClientListWithOverridedProperty() {
        List<Client> clients = Fixture.from(Client.class).gimme(5, "valid", new Rule() {
            {
                add("name", "Joseph");
                add("email", "joseph@fixturefactory.org");
            }
        });

        assertEquals("Client list size should be 5", clients.size(), 5);
        for (Client client : clients) {
            assertEquals("Joseph", client.getName());
            assertEquals("joseph@fixturefactory.org", client.getEmail());
        }
    }

    @Test
    public void shouldCreateClientWithAddressEqualToNull() {
        Client client = Fixture.from(Client.class).gimme("valid-noaddress");

        assertNotNull(client.getId());
        assertNull(client.getAddress());
    }


}
