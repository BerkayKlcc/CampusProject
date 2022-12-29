Feature:Departments Fuctionality
  Background:
    Given Navigate to campus
    When Enter username and password click login button
    Then User should login successfully

  Scenario: Add Departments
    And Navigate to Departments
      | setup |
      | school_setup |
      | departments  |

    And Click on the element in the Departments
      | addButton |

    And User sending the key in Departments
      | nameInput | Group_4 |
      | code      | 1234     |

    And Click on the element in the Departments
      | saveButton |

    And Success message should be displayed

    And Click on the element in the Departments
      | editButton |

    And User sending the key in Departments
      | nameInput | Group_04 |

    And Click on the element in the Departments
      | saveButton |

    And Success message should be displayed

    And Click on the element in the Departments
      | deleteButton  |
      | deleteDialogBtn |

    Then Success message should be displayed

