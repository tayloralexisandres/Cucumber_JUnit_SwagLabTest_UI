Feature:
  User Story :
  As a POS & sales manager, I should be able to get correct information on the Sales page.

  @reha
  Scenario: Verify there are 6 columns to see the quotations on the Sales page when the POS
    Given user is on the ERP app login page
    When user for events enters below correct credentials
      | username | posmanager5@info.com |
      | password | posmanager           |
    And user clicks login button
    Then user should see their name on dashboard
    Then user clicks to sales
    Then user sees 6 coulmns and 1 checkbox

  @reha
  Scenario: Verify there are 6 columns to see the quotations on the Sales page when the sales manager
    Given user is on the ERP app login page
    When user for events enters below correct credentials
      | username | salesmanager10@info.com |
      | password | salesmanager            |
    And user clicks login button
    Then user should see their name on dashboard
    Then user clicks to sales
    Then user sees 6 coulmns and 1 checkbox


