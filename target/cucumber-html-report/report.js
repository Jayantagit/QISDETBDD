$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SignIn.feature");
formatter.feature({
  "line": 1,
  "name": "Sign In Module Scenarios",
  "description": "",
  "id": "sign-in-module-scenarios",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "This scenario is to test the Invalid Sign In Scenario",
  "description": "",
  "id": "sign-in-module-scenarios;this-scenario-is-to-test-the-invalid-sign-in-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is already in the Sign In Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the wrong \"\u003cUserName\u003e\" And User enter the wrong \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Error message will appear",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "sign-in-module-scenarios;this-scenario-is-to-test-the-invalid-sign-in-scenario;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 10,
      "id": "sign-in-module-scenarios;this-scenario-is-to-test-the-invalid-sign-in-scenario;;1"
    },
    {
      "cells": [
        "Test",
        "Test"
      ],
      "line": 11,
      "id": "sign-in-module-scenarios;this-scenario-is-to-test-the-invalid-sign-in-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 251013749987,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "This scenario is to test the Invalid Sign In Scenario",
  "description": "",
  "id": "sign-in-module-scenarios;this-scenario-is-to-test-the-invalid-sign-in-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is already in the Sign In Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the wrong \"Test\" And User enter the wrong \"Test\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Error message will appear",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInStepDef.user_is_already_in_the_Sign_In_Page()"
});
formatter.result({
  "duration": 683370936,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat com.mapsynq.StepDef.SignInStepDef.user_is_already_in_the_Sign_In_Page(SignInStepDef.java:40)\r\n\tat ✽.Given User is already in the Sign In Page(SignIn.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 22
    },
    {
      "val": "Test",
      "offset": 54
    }
  ],
  "location": "SignInStepDef.user_enter_the_wrong_And_User_enter_the_wrong(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignInStepDef.error_message_will_appear()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1187054409,
  "status": "passed"
});
});