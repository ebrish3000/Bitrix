Feature: As  a user I want to login
  Scenario:  Login to bitrix
    Given  user is on the log in page
    When  user logs in
    Then  user should see the page
    #change