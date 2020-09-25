$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/budap/eclipse-workspace/Spring2020selenium/CucumberAutamationPractical/features/whiteBackground.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I want to click on set skyBlue background button",
  "description": "so that the background color change to skyBlue;",
  "id": "as-a-user-i-want-to-click-on-set-skyblue-background-button",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Sky Blue Background ;",
  "description": "",
  "id": "as-a-user-i-want-to-click-on-set-skyblue-background-button;sky-blue-background-;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": ": \"Set SkyBlue BackGround\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": ": I click on the button;",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": ": the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyBlue BackGround",
      "offset": 3
    }
  ],
  "location": "steps.button_exists1(String)"
});
formatter.result({
  "duration": 5061269700,
  "status": "passed"
});
formatter.match({
  "location": "steps.i_click_on_the_button1()"
});
formatter.result({
  "duration": 5061419700,
  "status": "passed"
});
formatter.match({
  "location": "steps.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 4849800,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "White BackGround Change;",
  "description": "",
  "id": "as-a-user-i-want-to-click-on-set-skyblue-background-button;white-background-change;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": ": \"Set skyWhite Background\" button exists;",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": ": I click on the button ;",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": ": the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set skyWhite Background",
      "offset": 3
    }
  ],
  "location": "steps.button_exists(String)"
});
formatter.result({
  "duration": 4506152300,
  "status": "passed"
});
formatter.match({
  "location": "steps.i_click_on_the_button()"
});
formatter.result({
  "duration": 64055300,
  "status": "passed"
});
formatter.match({
  "location": "steps.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 20000,
  "status": "passed"
});
});