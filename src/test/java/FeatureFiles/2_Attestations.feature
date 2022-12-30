Feature: Attestations Functionality

  Background:
    Given Navigate to campus
    When Enter username and password click login button
    Then User should login successfully

  Scenario: Add Attestations
    And Navigate to Attestations
      | humanResource_1 |
      | setup_1         |
      | attestations_1  |

    And Click on the element in the Attestations
      | addButton |

    And User sending the key in Attestation
      | nameInput | Group_4 |

    And Click on the element in the Attestations
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit Attestations
    And Navigate to Attestations
      | humanResource_1 |
      | setup_1         |
      | attestations_1  |

    And Click on the element in the Attestations
      | editButton |

    And User sending the key in Attestation
      | nameInput | Group_4 is here |

    And Click on the element in the Attestations
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Attestations
    And Navigate to Attestations
      | humanResource_1 |
      | setup_1         |
      | attestations_1  |

    And Click on the element in the Position Categories
      | delete_1     |
      | deleteConf_1 |

    Then Success message should be displayed

