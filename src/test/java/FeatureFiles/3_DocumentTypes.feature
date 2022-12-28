Feature: Document Types Functionality Test

  Background:
    Given Navigate to campus
    When Enter username and password click login button
    Then User should login successfully

  Scenario: Add Document Types

    When Navigate to Document Types
      | setup         |
      | parameters    |
      | documentTypes |

    And Click on the elements in the Document Types
      | addButton |

    And Send keys in the Document Types
      | nameInput   | Group_4 |

    And Click on the elements in the Document Types
      | stageInput          |
      | studentRegist       |

    And switch to Save button

    And Click on the elements in the Document Types
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Document Types

    When Navigate to Document Types
      | setup         |
      | parameters    |
      | documentTypes |

    And Click on the elements in the Fields
      | editButton   |

    And Send keys in the Fields
      | nameInput | anotherName1 |

   # And Send keys in the Document Types
    #  | nameInput | Group_4 |
   # And Click on the elements in the Document Types
   #   | searchButton |
   #   | editButton |
   # And Send keys in the Document Types
    #  | nameInput | Group_4444 |

    And Click on the elements in the Document Types
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Document Types

    When Navigate to Document Types
      | setup         |
      | parameters    |
      | documentTypes |

    And Click on the elements in the Document Types
      | deleteButton    |
      | deleteDialogBtn |

    # Then Success message should be displayed


