Feature:Departments School Locations
  Background:
    Given Navigate to campus
    When Enter username and password click login button
    Then User should login successfully

  Scenario: Add School Locations
    And Navigate to School Locations
      | setup |
      | school_setup |
      | locations  |

    And Click on the element in the School Locations
      | addButton |

    And User sending the key in School Locations
      | nameInput | Group_4 |
      | shortname | G4      |
      | capacity  | 50      |

    And Click on the element in the Form Content
      | locationtype |
      | selecttype   |

    And Click on the element in the School Locations
      | saveButton |

    And Success message should be displayed

    And Click on the element in the School Locations
      | editButton |

    And User sending the key in School Locations
      | nameInput | Group_04 |

    And Click on the element in the School Locations
      | saveButton |

    And Success message should be displayed

    And Click on the element in the School Locations
      | deleteButton  |
      | deleteDialogBtn |

    Then Success message should be displayed

