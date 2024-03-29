Feature: User
  As an admin
  I want to see list of user
  So that I can create new user

  Scenario: GET - As admin I have be able to get detail user
    Given I set GET api endpoint
    When I send GET HTTP request
    Then I receive HTTP response code 200
    And I receive valid data for detail user

  Scenario: POST - As admin I have be able to create new user
    Given I set POST api endpoint
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for new user

  Scenario: PUT - As admin I have be able to update existing new user
    Given I set PUT api endpoint
    When I send PUT HTTP request
    Then I receive HTTP response code 200
    And I receive valid data for update user

  Scenario: DELETE - As admin I have be able to delete existing user
    Given I set DELETE api endpoint
    When I send DELETE HTTP request
    Then I receive HTTP response code 204