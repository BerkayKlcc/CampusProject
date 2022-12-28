Feature:BankAccounts Functionality

  Background:
    Given Navigate to campus
    When Enter username and password click login button
    Then User should login successfully

  Scenario: Create BankAccounts
    And Click on the element in left nav
      | setupOne     |
      | parameters   |
      | bankAccounts |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | gulB11 |
      | ibanInput | BA11   |

    And Click on the element in the Dialog
      | currency1   |
      | currencyUSD |


    And User sending the keys in Dialog content
      | integrationCodeBA | BA111 |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed


  Scenario: Edit Bank Accounts
    And Click on the element in left nav
      | setupOne     |
      | parameters   |
      | bankAccounts |


    And User search before edit item from Dialog content
      | searchInput | gulB11 |


    And User edit item from Dialog content
      | nameInput | gul1 |

    Then Success message should be displayed


  Scenario: Delete Bank Accounts
    And Click on the element in left nav
      | setupOne     |
      | parameters   |
      | bankAccounts |


    And User delete item from Dialog
      | gul1 |

    Then Success message should be displayed