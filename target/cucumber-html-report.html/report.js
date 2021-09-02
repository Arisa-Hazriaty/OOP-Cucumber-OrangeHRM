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
  "duration": 7016575194,
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
  "duration": 514340308,
  "status": "passed"
});
formatter.match({
  "location": "LoginOrangesSteps.user_input_invalid_username_and_password()"
});
formatter.result({
  "duration": 1181298395,
  "status": "passed"
});
formatter.match({
  "location": "LoginOrangesSteps.user_see_error_message()"
});
formatter.result({
  "duration": 30593587,
  "status": "passed"
});
formatter.after({
  "duration": 112845197,
  "status": "passed"
});
formatter.before({
  "duration": 4921513961,
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
  "duration": 163549379,
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
  "duration": 3849026427,
  "status": "passed"
});
formatter.match({
  "location": "LoginOrangesSteps.user_see_dashboard()"
});
formatter.result({
  "duration": 182632456,
  "status": "passed"
});
formatter.after({
  "duration": 120230255,
  "status": "passed"
});
});