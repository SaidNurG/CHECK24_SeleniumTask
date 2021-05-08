Feature: REST-API Test Task

  @api
  Scenario: Send get requests
    Given send GET request baseURI
      | 200007 |
      | abcd   |
      | 5456   |
    Then verify status code, body, headers