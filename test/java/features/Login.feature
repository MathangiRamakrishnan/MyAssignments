Feature: To test the Login functionality

Scenario: To test the Login functionality with positive credentials

# Precondition
Given Launch the Browser
Given Load the url
Given Enter the username
Given Enter the password
When Click on the Login Button
Then Verify login is successful 

# Instead of so many Given keywords, it can be replaced with And
#Given Launch the Browser
#And Load the url
#And Enter the username
#And Enter the password
#When Click on the Login Button
#Then Verify login is successful 