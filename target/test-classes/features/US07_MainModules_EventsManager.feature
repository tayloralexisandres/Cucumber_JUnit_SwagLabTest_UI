
@PRG4-98 @tay
Feature: Dashboard functionality
  User Story :
  As an Event manager, I want to have access to different modules


  @PRG4-98 @tay
  Scenario:Positive login scenario for Event Manager and verify they have access to 15 modules
    Given user is on the ERP app login page
    When user for events enters below correct credentials

      | username | eventscrmmanager10@info.com |
      | password | eventscrmmanager            |
    And user clicks login button

    Then user sees 15 modules
    Then user should have access to modules
