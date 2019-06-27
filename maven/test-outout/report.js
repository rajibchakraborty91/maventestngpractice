$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("google.feature");
formatter.feature({
  "line": 1,
  "name": "google.feature",
  "description": "",
  "id": "google.feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Google",
  "description": "",
  "id": "google.feature;google",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Open google com",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enter search term",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Fail it",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleStep.open_google_com()"
});
formatter.result({
  "duration": 39816446500,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStep.user_enter_search_term()"
});
formatter.result({
  "duration": 229100,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStep.user_clicks_Search_button()"
});
formatter.result({
  "duration": 9635253800,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStep.failit()"
});
formatter.result({
  "duration": 571122600,
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat StepDefinitions.GoogleStep.failit(GoogleStep.java:59)\r\n\tat ✽.Then Fail it(google.feature:9)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 11,
  "name": "Googletest2",
  "description": "",
  "id": "google.feature;googletest2",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Open google com",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User enter search term",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user clicks Search button",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleStep.open_google_com()"
});
formatter.result({
  "duration": 17567184500,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStep.user_enter_search_term()"
});
formatter.result({
  "duration": 137700,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStep.user_clicks_Search_button()"
});
formatter.result({
  "duration": 10687544400,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Googletest3",
  "description": "",
  "id": "google.feature;googletest3",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "Open google com",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User enter search term",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user clicks Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Fail it",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleStep.open_google_com()"
});
formatter.result({
  "duration": 17232122200,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStep.user_enter_search_term()"
});
formatter.result({
  "duration": 149400,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStep.user_clicks_Search_button()"
});
formatter.result({
  "duration": 10410024500,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStep.failit()"
});
formatter.result({
  "duration": 434300,
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat StepDefinitions.GoogleStep.failit(GoogleStep.java:59)\r\n\tat ✽.Then Fail it(google.feature:22)\r\n",
  "status": "failed"
});
});