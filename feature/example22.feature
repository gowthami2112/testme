Feature: user register into TestMeApp

Scenario: Register
Given user lunaching TestMeApp
When user enter username as "gowthami"
When user enter firstname as "gowthu"
When user enter lastname as "shanthi"
When user enter password as "password123"
When user enter confirmpassword as "password123"
When user select gender as "Female"
When user enter Email as "gowthami2196@gmail.com"
When user enter mobile number  as "9524258612"
When user enter DOB as "21/12/96" 
When user enter Address as "coimbatore"
When user select SecurityQuestion as "what is your favour color"
When user enter answer as "red"
Then user click submit


