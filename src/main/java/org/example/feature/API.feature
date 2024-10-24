Feature: Testing open API

  Scenario: Validate open API response
    Given I hit "https://reqres.in" to "Get user"
    And The response contains "janet"