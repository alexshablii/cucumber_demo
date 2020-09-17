Feature: Generate an Ephemeral Token
  This route assumes you have generated an api key within your production OR sandbox OMNI account.

  Scenario: Generate a token using a valid key
    Given a valid api key
    When a GET request is made
    Then the response status is 200
    And the response body contains "token"
