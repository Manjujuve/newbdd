Feature: API Operations

  Scenario: GET request to retrieve data
  
    Given I have API endpoint "https://reqres.in/"
    When I send a GET request
    Then the response status code should be 200

