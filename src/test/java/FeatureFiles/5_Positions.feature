Feature: Position Functionality

  Background:
    Given Navigate to campus
    And Enter username and password click login button
    Then User should login successfully

  Scenario: Add Position
    And Navigate to Positions Under HR  Setup
      | humanResource_1 |
      | setup_1         |
      | positions       |

    And Click on the element in the Positions
      | addButton |

    And User sending the key in Positions
      | nameInput | Group_4_can |
      | shortName | candeneme   |

    And Click on the element in the Positions
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Position
    And Navigate to Positions Under HR  Setup
      | humanResource_1 |
      | setup_1         |
      | positions       |

    And Click on the element in the Positions
      | editButton |


    And User sending the key in Positions
      | nameInput | Group_4_can_edit |

    And Click on the element in the Positions
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Position

    And Navigate to Positions Under HR  Setup
      | humanResource_1 |
      | setup_1         |
      | positions       |

    And Click on the element in the Position Categories
      | deleteButton    |
      | deleteDialogBtn |

    Then Success message should be displayed