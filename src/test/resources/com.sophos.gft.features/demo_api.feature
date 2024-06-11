Feature: Yo como automatizador requiero
  aprender a hacer pruebas
  usando KArate framework

  Background: Set Settings
    * url 'https://gorest.co.in/'

  Scenario: Execute Get
    Given path '/public/v2/users/6958770'
    * def token = { Authorization: 'Bearer 6541758c8b9a5d00b7280c5a9ba2dfa65888ef2b4ffee6dd4fb8d493ff10b0e1'}
    * headers token
    When method get
    Then status 200
    * def expected = {"id":6958770,"name":"John Doe","email":"john_Doe@15ce.com","gender":"male","status":"active"}
    * def response = $
    * match $ == expected
