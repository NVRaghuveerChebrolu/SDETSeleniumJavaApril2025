@featureleveltag
Feature: Validate GMO Online App End to End flow

@GmoRegression
  Scenario: validate launch Of Gmo Online Application and verify the title
    Given User is on Gmo online page
    Then I validate the title
    When user click on Enter Gmo Online Button
    Then verify the title of Onlicatalogue Page
           
@GmoRegression        
  Scenario: validate place and order for sun glasses product
    Given User is on online catalogue page
    When user provide quantity for sun glasses product
    And usr click on Place An Order button
    Then verify the title of Place order page
    And veriy the unit prce and total price calculated
    

  Scenario Outline: validate datadriven
    Given User is on login page 
    When User provides userName as "<userName>" and password as "<Password>"
    And User click on submit button
    Then User is on Home Page
    
@datadriven
    Examples: 
      | userName  | Password |   
      | user123   |  pass123 | 
      | user456   |  pass456 | 
      
      
Scenario: validate the login and scroll functionality in home page
   	Given User is on login page
    When user provide quantity for sun glasses product
    And usr click on Place An Order button
    Then verify the title of Place order page
    And veriy the unit prce and total price calculated
    When User perform scroll operation to the bottom of the page
      
		
    