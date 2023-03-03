Feature: Etsy search functionality
  Agile story: User should be able to search any keyword

@smoke
  Scenario: Etsy title verification
    Given user is on etsy home page
    Then user should see title is as expected
    #-Etsy - Shop for handmade, vintage, custom, and unique gifts for
    #everyone

  Scenario: Etsy Search Functionality Title verification(without parameterization)
    Given user is on etsy home page
    When user types Wooden Spoon in the search box
    When user click to Etsy search button
    Then user sees Wooden Spoon in the title
  @runetsy
 Scenario: Etsy Search Functionality Title verification(with parameterization)
    Given user is on etsy home page
    When user types "Wooden Spoon" in the search box
    When user click to Etsy search button
    Then user sees "Wooden" in the title
