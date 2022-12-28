Feature: Fields Functionality Test

  Background:
    Given Navigate to campus
    When Enter username and password click login button
    Then User should login successfully

  Scenario: Add Fields

    When Navigate to Fields
      | setup      |
      | parameters |
      | fields     |

    And Click on the elements in the Fields
      | fieldsAddButton |

    And Send keys in the Fields
      | nameInput | newName1 |

    And Click on the elements in the Fields
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Fields

    When Navigate to Fields
      | setup      |
      | parameters |
      | fields     |

     And Click on the elements in the Fields
      | editButton   |

    And Send keys in the Fields
      | nameInput | anotherName1 |

    And Click on the elements in the Fields
      | saveButton |

    Then Success message should be displayed

 # And Click on the elements in the Fields
    #  | searchButton |
    #  | editButton   |
 # And Send keys in the Fields
    #  | nameInput | Group_4 |

  Scenario: Delete Fields

    When Navigate to Fields
      | setup      |
      | parameters |
      | fields     |

    And Click on the elements in the Fields
      | deleteButton    |
      | deleteDialogBtn |

    Then Success message should be displayed