Feature: Login to abhibus application

Scenario: user should login with valid details
    
Given navigates to abhibus website
When i click on login
Then i enter mobile number
And i click on login or signup with otp

