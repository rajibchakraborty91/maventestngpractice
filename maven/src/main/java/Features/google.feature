Feature: google.feature


Scenario: Google

Given Open google com
Then User enter search term
Then user clicks Search button
Then Fail it


Scenario: PageFactory

Given Open automation site
When click on Tshirt
//li[3]/a[text()='T-shirts']
//span[contains(text(),'Add to cart')]
Then click on Add to cart
















