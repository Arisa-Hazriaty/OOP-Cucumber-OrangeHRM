$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginValidInvalid"
    },
    {
      "line": 1,
      "name": "@Orangehrm"
    }
  ]
});
formatter.before({
  "duration": 8471029803,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "username and password not match",
  "description": "",
  "id": "login;username-and-password-not-match",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@NegativeCase"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user open the web page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user input invalid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user see error message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginOrangesSteps.user_open_the_web_page()"
});
formatter.result({
  "duration": 679925366,
  "status": "passed"
});
formatter.match({
  "location": "LoginOrangesSteps.user_input_invalid_username_and_password()"
});
formatter.result({
  "duration": 1150183357,
  "status": "passed"
});
formatter.match({
  "location": "LoginOrangesSteps.user_see_error_message()"
});
formatter.result({
  "duration": 30815432,
  "status": "passed"
});
formatter.after({
  "duration": 202175402,
  "status": "passed"
});
formatter.before({
  "duration": 5076804730,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "username and password match",
  "description": "",
  "id": "login;username-and-password-match",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@PositiveCase"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user open the web page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user input \"admin\" as username and \"admin123\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user see dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginOrangesSteps.user_open_the_web_page()"
});
formatter.result({
  "duration": 154850922,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 12
    },
    {
      "val": "admin123",
      "offset": 36
    }
  ],
  "location": "LoginOrangesSteps.user_input_valid_username_and_password(String,String)"
});
formatter.result({
  "duration": 3807305805,
  "status": "passed"
});
formatter.match({
  "location": "LoginOrangesSteps.user_see_dashboard()"
});
formatter.result({
  "duration": 688608151,
  "status": "passed"
});
formatter.after({
  "duration": 213568772,
  "status": "passed"
});
});