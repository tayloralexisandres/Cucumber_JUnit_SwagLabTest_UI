
@espn@ui
Feature: Navigate to espn.com
  Scenario: Lets go baby
  Given user is on the website
  When user hoovers over NFL
  And user navigates to standings
  Then user should see all teams in alphabetical order

