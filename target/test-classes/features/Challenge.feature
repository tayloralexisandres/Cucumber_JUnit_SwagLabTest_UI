Feature: Login functionality
@API
  Scenario: As a new user I should be able to login
    When User sends a post request to create
  And user captures staus code, userId, usesrname and books information
  Then verify status code and verify username and userId is not null
    And user enters "taytayyea" and "eXamplE#1234"
    Then user should have access to webpage
