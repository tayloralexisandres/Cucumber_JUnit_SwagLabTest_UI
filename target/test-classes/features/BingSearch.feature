Feature: Bing Search functionality
  Agile story: As a user, when I am on the Bing search page,
  I should be able to search anything and see relevant results.

  Background:
    Given User is on the bing home page


  Scenario: Search result title verification
    When User enters orange in Bing search box
    Then  User should see orange is in the title

  @DDT
  Scenario: Search result title verification
   # Given User is on the bing home page
    When User enters "banana split" in Bing search box
    Then  User should see "banana split" is in the title

