@Login
Feature: Login functionality

  Scenario: Verify the login by entering valid username and password

   Given Launch the browser and navigate to login page

    When Enter the credentials
      | username | password     |
      | student  | password@123 |

    Then Verify the user status

  Scenario: Verify the login by entering invalid username and valid password

   Given Launch the browser and navigate to login page

    When Enter the invalid username and valid password
      | username   | password     |
      | student123 | password@123 |

    Then Verify the user status for wrong credentials

    Scenario: : Verify the login by entering valid username and invalid password


    Given Launch the browser and navigate to login page

    When Enter the valid username and invalid password
      | username | password |
      | student  | pass@123   |

    Then Verify the user status for wrong credentials


  Scenario: Verify the login by entering invalid username and invalid password

    Given Launch the browser and navigate to login page

    When Enter the invalid username and invalid password
      | username   | password |
      | student123 | pass@123 |

    Then Verify the user status for wrong credentials