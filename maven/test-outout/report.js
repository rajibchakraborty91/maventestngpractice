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
  "duration": 12745323700,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStep.user_enter_search_term()"
});
formatter.result({
  "duration": 136100,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStep.user_clicks_Search_button()"
});
formatter.result({
  "duration": 138582500,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@name\u003d\u0027q\u0027]\"}\n  (Session info: chrome\u003d75.0.3770.100)\n  (Driver info: chromedriver\u003d2.46.628402 (536cd7adbad73a3783fdc2cab92ab2ba7ec361e1),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-MSUCRPV\u0027, ip: \u0027192.168.0.103\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_77\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.46.628402 (536cd7adbad73a..., userDataDir: C:\\Users\\Rajib\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:49304}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 75.0.3770.100, webStorageEnabled: true}\nSession ID: 56f3e8b776ea3bca51bd2e78f36a457d\n*** Element info: {Using\u003dxpath, value\u003d//input[@name\u003d\u0027q\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pages.CommonFunctions.clickSearch(CommonFunctions.java:120)\r\n\tat StepDefinitions.GoogleStep.user_clicks_Search_button(GoogleStep.java:49)\r\n\tat ✽.Then user clicks Search button(google.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "GoogleStep.failit()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 12,
  "name": "PageFactory",
  "description": "",
  "id": "google.feature;pagefactory",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "Open automation site",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "click on Tshirt as \"rajib\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click on Add to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationPagefactory.openAutomationSite()"
});
formatter.result({
  "duration": 22212016300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rajib",
      "offset": 20
    }
  ],
  "location": "AutomationPagefactory.clickonTshirt(String)"
});
formatter.result({
  "duration": 5652400,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});