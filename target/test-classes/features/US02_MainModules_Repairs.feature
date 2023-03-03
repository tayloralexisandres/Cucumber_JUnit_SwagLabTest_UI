Feature: ERP modules functionality
  User Story :
  As a POS & sales manager, I want to access the Repairs page.
@US2
  Scenario: Verify there are 6 columns to see the repair orders on the Repairs page when the POS is logged in

    Given user is on the ERP app login page
    When user for events enters below correct credentials

      | username | posmanager5@info.com |
      | password | posmanager           |



    And user clicks login button
    Then user should see their name on dashboard
    Then user clicks to repairs
    Then user sees 6 columns displayed in repairs
@US2
  Scenario: Verify there are 6 columns to see the repair orders on the Repairs page when the salesmanager is logged in

    Given user is on the ERP app login page
    When user for events enters below correct credentials


      | username | salesmanager10@info.com |
      | password | salesmanager            |




    And user clicks login button
    Then user should see their name on dashboard
    Then user clicks to repairs
    Then user sees six columns displayed in repairs