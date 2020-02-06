Feature: facebook smoke tests

  Scenario Outline: Test the login page
    Given open chromebrowser with facebook
    When I enter valid "<username>" and "<password>"
    Then user able to login
    Then user back on laogin page

    Examples: 
      | username             | password |
      | akshay@kalegmail.com | 56778687  |
      | afroj@gmail.com      | 776333  |
