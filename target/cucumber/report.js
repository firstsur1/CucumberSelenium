$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/functionalTests/test.feature");
formatter.feature({
  "line": 1,
  "name": "Search string on wikipedia",
  "description": "",
  "id": "search-string-on-wikipedia",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4577962781,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Search for a given string in English",
  "description": "",
  "id": "search-string-on-wikipedia;search-for-a-given-string-in-english",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user type a string",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#\tAnd user click search button"
    },
    {
      "line": 7,
      "value": "#\tThen search results matches the search string"
    }
  ],
  "line": 8,
  "name": "search results is available in other languages",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "search results page in the new language includes a link to the version in English",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_is_on_home_page()"
});
formatter.result({
  "duration": 559417737,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_type_a_string()"
});
formatter.result({
  "duration": 424614283,
  "error_message": "org.openqa.selenium.InvalidSelectorException: The xpath expression \u0027//label[contains(\"Search Wikipedia\")]//following::input\u0027 cannot be evaluated or does notresult in a WebElement (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027LAPTOP-HLHJ75DV\u0027, ip: \u0027192.168.0.16\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002710.0.1\u0027\nDriver info: org.openqa.selenium.ie.InternetExplorerDriver\nCapabilities {browserAttachTimeout: 0, browserName: internet explorer, cssSelectorsEnabled: true, elementScrollBehavior: 0, enableElementCacheCleanup: true, enablePersistentHover: true, handlesAlerts: true, ie.browserCommandLineSwitches: , ie.ensureCleanSession: false, ie.forceCreateProcessApi: false, ie.usePerProcessProxy: false, ignoreProtectedModeSettings: false, ignoreZoomSetting: false, initialBrowserUrl: http://localhost:26158/, javascriptEnabled: true, nativeEvents: true, platform: WINDOWS, platformName: WINDOWS, requireWindowFocus: false, takesScreenshot: true, unexpectedAlertBehaviour: dismiss, unhandledPromptBehavior: dismiss, version: 11}\nSession ID: 051a48ec-955e-49f2-acb5-a3f797e70629\n*** Element info: {Using\u003dxpath, value\u003d//label[contains(\"Search Wikipedia\")]//following::input}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.sendKeys(Unknown Source)\r\n\tat pageObjects.HomePage.typeString(HomePage.java:56)\r\n\tat stepDefinitions.HomePageSteps.user_type_a_string(HomePageSteps.java:28)\r\n\tat ✽.When user type a string(src/test/resources/functionalTests/test.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageSteps.search_results_is_available_in_other_languages()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.search_results_page_in_the_new_language_includes_a_link_to_the_version_in_English()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 32000,
  "status": "passed"
});
});