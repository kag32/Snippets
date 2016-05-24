Feature: Paged results
  Scenario: Verify paged results
    Given I have navigated to a page
    When I click on results page link
    And I click on next page link
    And I click on next page link
    And I click on next page link
    And I click on next page link
    And I click on next page link
    And I click on previous page link
    And I click on next page link
    And I click on last page link
    And I click on page "1" link
    Then I am taken to the corresponding results page
