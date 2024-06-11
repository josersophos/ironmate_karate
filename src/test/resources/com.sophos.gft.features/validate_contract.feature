Feature: Yo como automatizador requiero
  aprender a hacer pruebas
  usando KArate framework

  Background: Set Settings
    * url 'https://gorest.co.in/'
    * def userContract = read('../com.sophos.gft.contracts/contract_user.json')
    * def badUserContract = read('../com.sophos.gft.contracts/bad_contract_user.json')


  Scenario: Validate Contract
    Given path '/public/v2/users/6958770'
    * def token = { Authorization: 'Bearer 6541758c8b9a5d00b7280c5a9ba2dfa65888ef2b4ffee6dd4fb8d493ff10b0e1'}
    * headers token
    When method get
    Then status 200
    * match $ == userContract


  Scenario: Validate Bad Contract
    Given path '/public/v2/users/6958770'
    * def token = { Authorization: 'Bearer 6541758c8b9a5d00b7280c5a9ba2dfa65888ef2b4ffee6dd4fb8d493ff10b0e1'}
    * headers token
    When method get
    Then status 200
    * match $ == badUserContract

