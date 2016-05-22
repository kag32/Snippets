Feature: Administrator search for courses
  Scenario: As an administrator I want to be able to search for courses by
    course title, course type, course code, current / all and to choose whether the
    results are sorted by title or course start date.

    Given I have navigated to the Courses search tab
    When I enter the search terms
    And click on the course search button
    Then I see a paginated list of matching course results
    And can drill down to course detail level

