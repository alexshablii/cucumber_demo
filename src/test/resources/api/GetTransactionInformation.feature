Feature: Get a Transaction's Information
  Searches for a specific transaction based on the given ID, then lists data on that transaction.

  Scenario: Get a transaction's info
    Given a transaction Id
    When the GET request is made
    Then the status is 200
    And the payment method is "VISA"