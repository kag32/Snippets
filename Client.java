package pages;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Kate on 09/05/2016.
 */
public class Client implements Serializable {

    private static final long serialVersionUID = 6875996936038420202L;

    private Long id;
    private String name;
    private String nickname;
    private String email;
    private Calendar birthday;
    private String birthdayAsString;
    private Address address;

    private Client() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
       //this.birthdayAsString = dateFormat();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public String getBirthdayAsString() {
        birthdayAsString = new SimpleDateFormat("dd/MM/yyyy").format(this.birthday.getTime());
        return birthdayAsString;
    }
    public void setBirthdayAsString(String birthdayAsString) {
        this.birthdayAsString = birthdayAsString;
    }

    @Override
    public String toString() {
        return "Client [address=" + address + ", birthday=" + birthday + ", email=" + email + ", id=" + id + ", name=" + name + ", nickname=" + nickname + "]";
    }

}
