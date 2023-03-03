Feature: Google Search functionality
  Agile story: As a user, when I am on the Google search page, I should be able to search anything and see relevant results.


  Background:
    Given  User is on the Google search page


  Scenario: Search page default title verification
   # When User is on the Google search page
    Then User should see title is Google


  Scenario: Search result title verification

    When User enters apple in search box
    Then User should see title is apple – Google Search



  Scenario: Google testing data table
    Then User should be able to search for following:
      | Java         |
      | Selenium     |
      | Cucumber     |
      | SDET         |
      | Wooden Spoon |