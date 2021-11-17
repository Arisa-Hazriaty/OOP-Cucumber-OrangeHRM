$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/AddEmployee.feature");
formatter.feature({
  "line": 2,
  "name": "Add Employee",
  "description": "User want to Add Employee",
  "id": "add-employee",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AddEmployeeesatu"
    },
    {
      "line": 1,
      "name": "@development"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "User input employee with correct data",
  "description": "",
  "id": "add-employee;user-input-employee-with-correct-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@PositiveCase"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User already login with \"\u003cemail\u003e\" as username and \"\u003cpassword\u003e\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User Open Add Employee Page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User input \"\u003cfirstname\u003e\" as firstName, \"\u003cmiddlename\u003e\" as middleName and \"\u003clastname\u003e\" as lastName",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User upload photo \"arisa.jpg\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User \"arisa hazriaty testing\" already created",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "add-employee;user-input-employee-with-correct-data;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "firstname",
        "middlename",
        "lastname"
      ],
      "line": 14,
      "id": "add-employee;user-input-employee-with-correct-data;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123",
        "arisa",
        "hazriaty",
        "testing"
      ],
      "line": 15,
      "id": "add-employee;user-input-employee-with-correct-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8906012807,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User input employee with correct data",
  "description": "",
  "id": "add-employee;user-input-employee-with-correct-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@AddEmployeeesatu"
    },
    {
      "line": 5,
      "name": "@PositiveCase"
    },
    {
      "line": 1,
      "name": "@development"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User already login with \"Admin\" as username and \"admin123\" as password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User Open Add Employee Page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User input \"arisa\" as firstName, \"hazriaty\" as middleName and \"testing\" as lastName",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User upload photo \"arisa.jpg\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User \"arisa hazriaty testing\" already created",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 25
    },
    {
      "val": "admin123",
      "offset": 49
    }
  ],
  "location": "AddEmployeeStep.loginOrangeHRM(String,String)"
});
formatter.result({
  "duration": 5649849532,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeeStep.openEmployeePage()"
});
formatter.result({
  "duration": 2608329913,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "arisa",
      "offset": 12
    },
    {
      "val": "hazriaty",
      "offset": 34
    },
    {
      "val": "testing",
      "offset": 63
    }
  ],
  "location": "AddEmployeeStep.inputNameEmployee(String,String,String)"
});
formatter.result({
  "duration": 270697986,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "arisa.jpg",
      "offset": 19
    }
  ],
  "location": "AddEmployeeStep.uploadPhoto(String)"
});
formatter.result({
  "duration": 5727009519,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "arisa hazriaty testing",
      "offset": 6
    }
  ],
  "location": "AddEmployeeStep.created(String)"
});
formatter.result({
  "duration": 57695116,
  "status": "passed"
});
formatter.after({
  "duration": 119452,
  "status": "passed"
});
formatter.uri("Features/AddUser.feature");
formatter.feature({
  "line": 2,
  "name": "AddUser",
  "description": "",
  "id": "adduser",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AddUser"
    },
    {
      "line": 1,
      "name": "@development"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User input user with correct data",
  "description": "",
  "id": "adduser;user-input-user-with-correct-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@PositiveCase"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User login \"\u003cemail\u003e\" as username and \"\u003cpassword\u003e\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Open Add User Page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user set the Role",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User input \"\u003cname\u003e\" as EmployeeName, \"\u003cusername\u003e\" Username",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User set Status ,\"\u003cpasswordusername\u003e\" as Password , \"\u003cconfirmPassword\u003e\" as ConfirmPassword",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user see Username List Pages",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "adduser;user-input-user-with-correct-data;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "name",
        "username",
        "passwordusername",
        "confirmPassword"
      ],
      "line": 14,
      "id": "adduser;user-input-user-with-correct-data;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123",
        "Fiona Grace",
        "valid",
        "P@ssw0rd123",
        "P@ssw0rd123"
      ],
      "line": 15,
      "id": "adduser;user-input-user-with-correct-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7523579007,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User input user with correct data",
  "description": "",
  "id": "adduser;user-input-user-with-correct-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@AddUser"
    },
    {
      "line": 4,
      "name": "@PositiveCase"
    },
    {
      "line": 1,
      "name": "@development"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User login \"Admin\" as username and \"admin123\" as password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Open Add User Page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user set the Role",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User input \"Fiona Grace\" as EmployeeName, \"valid\" Username",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User set Status ,\"P@ssw0rd123\" as Password , \"P@ssw0rd123\" as ConfirmPassword",
  "matchedColumns": [
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user see Username List Pages",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 12
    },
    {
      "val": "admin123",
      "offset": 36
    }
  ],
  "location": "AddUserStep.loginOrange(String,String)"
});
formatter.result({
  "duration": 4856286090,
  "status": "passed"
});
formatter.match({
  "location": "AddUserStep.openUserPage()"
});
formatter.result({
  "duration": 2692472371,
  "status": "passed"
});
formatter.match({
  "location": "AddUserStep.setTherRole()"
});
formatter.result({
  "duration": 693540528,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Fiona Grace",
      "offset": 12
    },
    {
      "val": "valid",
      "offset": 43
    }
  ],
  "location": "AddUserStep.setName(String,String)"
});
formatter.result({
  "duration": 714364559,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "P@ssw0rd123",
      "offset": 18
    },
    {
      "val": "P@ssw0rd123",
      "offset": 46
    }
  ],
  "location": "AddUserStep.setStatusPassword(String,String)"
});
formatter.result({
  "duration": 5944336774,
  "status": "passed"
});
formatter.match({
  "location": "AddUserStep.saveUser()"
});
formatter.result({
  "duration": 1664634116,
  "status": "passed"
});
formatter.after({
  "duration": 26998,
  "status": "passed"
});
formatter.uri("Features/Login.feature");
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
      "name": "@development"
    }
  ]
});
formatter.before({
  "duration": 7833397634,
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
  "duration": 174853785,
  "status": "passed"
});
formatter.match({
  "location": "LoginOrangesSteps.user_input_invalid_username_and_password()"
});
formatter.result({
  "duration": 1293897786,
  "status": "passed"
});
formatter.match({
  "location": "LoginOrangesSteps.user_see_error_message()"
});
formatter.result({
  "duration": 36266555,
  "status": "passed"
});
formatter.after({
  "duration": 25677,
  "status": "passed"
});
formatter.before({
  "duration": 7710989555,
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
  "duration": 262809327,
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
  "duration": 4909962404,
  "status": "passed"
});
formatter.match({
  "location": "LoginOrangesSteps.user_see_dashboard()"
});
formatter.result({
  "duration": 966940030,
  "status": "passed"
});
formatter.after({
  "duration": 37360,
  "status": "passed"
});
});