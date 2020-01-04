Feature: signing for facebook
@Test
  Scenario: sign for input field
    #Given i put url// facebook.com
    #Then i put first name in first name field
    #And i put last name in last name field
    #Then i put mobile number in mobile number field
    #And i put password in password field
 Given i put url// facebook.com
    Then i put "pakistan" in first name field
    And i put "ahmad" in last name field
    Then i put "12343" in mobile number field
    And i put "ikmj" in password field
    @Test
  Scenario: drop down
    #Then i select month from moth drop down
    #And i select date from date dropdown
    #Then i select year from year drop down
    Then i select month from moth drop down
    And i select date from date dropdown
    Then i select year from year drop down
@Test
  Scenario: radio button
    #Then i select male
     Then i select male
@Test
  Scenario: submit
    #Then i select submit
    Then i select submit
