Feature: Validating Place API's
  Scenario: Verify if place is being successfully added using addPlaceAPI
    Given Add Place Payload
    When User calls "addPlace" with POST crud method request
    Then The API call is success with status code 200
    And status in response body is "OK"
    And scope in response body is "APP"