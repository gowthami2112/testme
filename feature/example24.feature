Feature: user login into TestMeApp
 

  
  Scenario Outline: Login
    Given user open testMeapp
    When user enter username as <"username"> And enter password as <"password">
    Then click ok
    And verify login result
 Examples: 
 |username||password|
 |AlexUser| |Alex@123|
 
    