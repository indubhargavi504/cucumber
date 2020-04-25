Feature: create test for registation - Demowebshop


Scenario Outline: Registration test
* user should navigates to demowebshop on chrome browser
* user clicks on register link
* user selects gender
* user enters with first name as "<fn>"
* user enters with last name  as "<ln>"
* user enters with email as "<email>"
* user enters with paasword as "<psd>"
* user enters with confirm password as "<cnpsd>" 
* user clicks on register button 
* user should verify registration success


Examples:
|fn|ln|email|psd|cnpsd|
|indu|bhargavi|jklnbv@gmail.com|pass1226|pass1226|
|nmjkl|asdfg|bhanu@gmail.com|pass4567|pass4567|