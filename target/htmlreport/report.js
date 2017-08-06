$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contactUs.feature");
formatter.feature({
  "line": 2,
  "name": "Complete QAworks Contact us page",
  "description": "As a end user I want to navigate to QAworks.com contacts us page.\r\nSo that I can enter my details, message and send QAworks message to find out more about QAworks services.",
  "id": "complete-qaworks-contact-us-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Contact QAworks for more information about their services",
  "description": "",
  "id": "complete-qaworks-contact-us-page;contact-qaworks-for-more-information-about-their-services",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am QAWorks Site",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on Contact",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter name as \"j.Bloggs\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter email as \"j.Bloggs@qaworks.com \"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter my message as \"please contact me I want to find out more\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on Send button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should get confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "contactUs_StepDef.i_am_QAWorks_Site()"
});
formatter.result({
  "duration": 7518855764,
  "status": "passed"
});
formatter.match({
  "location": "contactUs_StepDef.i_click_on_Contact()"
});
formatter.result({
  "duration": 2043730390,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "j.Bloggs",
      "offset": 17
    }
  ],
  "location": "contactUs_StepDef.i_enter_name_as(String)"
});
formatter.result({
  "duration": 193970554,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "j.Bloggs@qaworks.com ",
      "offset": 18
    }
  ],
  "location": "contactUs_StepDef.i_enter_email_as(String)"
});
formatter.result({
  "duration": 210517808,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "please contact me I want to find out more",
      "offset": 23
    }
  ],
  "location": "contactUs_StepDef.i_enter_my_message_as(String)"
});
formatter.result({
  "duration": 315006252,
  "status": "passed"
});
formatter.match({
  "location": "contactUs_StepDef.i_click_on_Send_button()"
});
formatter.result({
  "duration": 1465017903,
  "status": "passed"
});
formatter.match({
  "location": "contactUs_StepDef.i_should_get_confirmation_message()"
});
formatter.result({
  "duration": 310847900,
  "status": "passed"
});
});