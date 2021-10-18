Feature: Testing over all fuctionalities of amazon website
Scenario Outline: log in
Given User launch amazon website
When User click sign in menu
And user enter "<Username>" valid username
And user click continue
And user enter "<password>" valid password
And user click sign in
Then user verify sign in and navigates to home page
Examples:
    |Username|password|
    |mipav54222@cantouri.com|selenium123|
    |mipav54222@contouri.com|123|
Scenario: To verify user able to sign in 
Given User launch amazon website
When User click sign in menu
And user enter "mipav54222@cantouri.com" valid username
And user click continue
And user enter "cucumber123" valid password
And user click sign in
Then user verify sign in and navigates to home page
 