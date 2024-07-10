Feature: To verify google search engine

  @First
  Scenario: Validate google search engine using valid keyword
    Given I Open Google
    When I Search "Bank Republik Indonesia" on search bar
    Then I see "Home - Bank BRI" keyword in search results
    And I quit browser