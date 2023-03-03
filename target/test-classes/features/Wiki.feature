@wiki
Feature: Wikipedia search functionality
  Agile story: As a user,
  when I am on the Wikipedia search page, I should be able to search anything and see relevant results.


  Scenario: search title verification
    Given User is on the Wikipedia page
    When  User enters "Steve Jobs" in the search box
    Then User should see "Steve Jobs" in the title


  Scenario: search header verification
    Given User is on the Wikipedia page
    When  User enters "Steve Jobs" in the search box
    Then User should see "Steve Jobs" in the header


  Scenario: search image verification
    Given User is on the Wikipedia page
    When  User enters "Steve Jobs" in the search box
    Then User should see "Steve Jobs" in the image header

  @Scenario1
  Scenario Outline: Wikipedia search functionality with scenario outline
    Given User is on the Wikipedia page
    When  User enters "<searchValue>" in the search box
    Then User should see "<expectedTitle>" in the title
    Then User should see "<expectedMainHeader>" in the header
    Then User should see "<expectedImageHeader>" in the image header

    Examples: search values we are gonna use in this scenario outline
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs          |
      | Mary Barra      | Mary Barra      | Mary Barra         | Mary Barra          |
      | Rosalind Brewer | Rosalind Brewer | Rosalind Brewer    | Rosalind Brewer     |




