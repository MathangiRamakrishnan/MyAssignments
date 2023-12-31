Feature: Leads Functionality

Scenario: Create Lead testcase with positive Credentials

Given Launch the Browser
And Load the url
And Enter the username
And Enter the password
When Click on the Login Button
Then Verify login is successful 
When Click on the crmsfa
And Click on the Leads tab
And Click on the Create Lead 
Given Enter the company name
And Enter the first name
And Enter the last name
When Click on the submit button
Then Verify Create Lead is successful
Given Get the lead id
When Close the browser

Scenario: Login with negative credentials
Given Launch the Browser
And Load the url
And Enter the uname
And Enter the pwd
When Click on the Login Button
But Verify login is successful 