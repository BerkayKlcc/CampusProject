Feature:Position Categories Functionality

  Background:
    Given Navigate to campus
    When Enter username and password click login button
    Then User should login successfully

  Scenario: Create Position Categories
    And  Navigate to Position Categories
      | humanResource_1    |
      | setup_1            |
      | positionCategory_1 |

    And Click on the element in the Position Categories
      | addButton |

    And User sending the key in Position Categories
      | nameInput | Group_4|

    And Click on the element in the Position Categories
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Position Categories
    And  Navigate to Position Categories
      | humanResource_1    |
      | setup_1            |
      | positionCategory_1 |

    And Click on the element in the Position Categories
      | editButton |

    And User sending the key in Position Categories
      | nameInput | Group_44 |

    And Click on the element in the Position Categories
      | saveButton |


  Scenario: Delete Position Categories
    And  Navigate to Position Categories
      | humanResource_1    |
      | setup_1            |
      | positionCategory_1 |

    And Click on the element in the Position Categories
      | delete_1 |
      | deleteConf_1 |
