@wip
Feature: Complete QAworks Contact us page
  As a end user I want to navigate to QAworks.com contacts us page.
  So that I can enter my details, message and send QAworks message to find out more about QAworks services.


  Scenario: Contact QAworks for more information about their services
    Given I am QAWorks Site
    And I click on Contact
    And I enter name as "j.Bloggs"
    And I enter email as "j.Bloggs@qaworks.com "
    And I enter my message as "please contact me I want to find out more"
    When I click on Send button
    Then I should get confirmation message






