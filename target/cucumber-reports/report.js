$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CommunityTest.feature");
formatter.feature({
  "line": 1,
  "name": "Testing functionality on Community Page",
  "description": "",
  "id": "testing-functionality-on-community-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1326569564,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "To verify user navigation to correct topic page from Community Page",
  "description": "",
  "id": "testing-functionality-on-community-page;to-verify-user-navigation-to-correct-topic-page-from-community-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@revolut"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User navigates to \"RevolutCommunity\" Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on \"searchIcon\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"searchText\" in \"SearchTextBox\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify \"searchText\" should appear in \"searchDropdown\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User clicks on \"searchText\" from \"searchDropdown\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Verify \"searchText\" is appearing as \"topicTitle\" on opened page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "RevolutCommunity",
      "offset": 19
    }
  ],
  "location": "CommunityPageStepDef.user_navigates_to_Page(String)"
});
formatter.result({
  "duration": 2247032872,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "searchIcon",
      "offset": 16
    }
  ],
  "location": "CommunityPageStepDef.user_clicks_on_Page(String)"
});
formatter.result({
  "duration": 127255879,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "searchText",
      "offset": 13
    },
    {
      "val": "SearchTextBox",
      "offset": 29
    }
  ],
  "location": "CommunityPageStepDef.user_enters_text_in_textBox(String,String)"
});
formatter.result({
  "duration": 287983190,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "searchText",
      "offset": 8
    },
    {
      "val": "searchDropdown",
      "offset": 38
    }
  ],
  "location": "CommunityPageStepDef.verify_searched_topic_should_appear_in_dropdown(String,String)"
});
formatter.result({
  "duration": 719281851,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "searchText",
      "offset": 16
    },
    {
      "val": "searchDropdown",
      "offset": 34
    }
  ],
  "location": "CommunityPageStepDef.user_clicks_on_text_from_search_dropdown(String,String)"
});
formatter.result({
  "duration": 167509168,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "searchText",
      "offset": 8
    },
    {
      "val": "topicTitle",
      "offset": 37
    }
  ],
  "location": "CommunityPageStepDef.verify_selected_Text_is_appearing_on_opened_page(String,String)"
});
formatter.result({
  "duration": 434276157,
  "status": "passed"
});
formatter.after({
  "duration": 128348462,
  "status": "passed"
});
formatter.before({
  "duration": 997886698,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "To Verify The Keyboard Shortcuts on Community Page",
  "description": "",
  "id": "testing-functionality-on-community-page;to-verify-the-keyboard-shortcuts-on-community-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@revolut"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User navigates to \"RevolutCommunity\" Page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User clicks on \"hamburgerMenu\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User clicks on \"keyboardShortcuts\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User validate the content of \"shortcutsOptions\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "RevolutCommunity",
      "offset": 19
    }
  ],
  "location": "CommunityPageStepDef.user_navigates_to_Page(String)"
});
formatter.result({
  "duration": 2267340359,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hamburgerMenu",
      "offset": 16
    }
  ],
  "location": "CommunityPageStepDef.user_clicks_on_Page(String)"
});
formatter.result({
  "duration": 76253129,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "keyboardShortcuts",
      "offset": 16
    }
  ],
  "location": "CommunityPageStepDef.user_clicks_on_Page(String)"
});
formatter.result({
  "duration": 104088008,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shortcutsOptions",
      "offset": 30
    }
  ],
  "location": "CommunityPageStepDef.user_validate_the_content_of_placeHolder(String)"
});
formatter.result({
  "duration": 542428904,
  "status": "passed"
});
formatter.after({
  "duration": 126399925,
  "status": "passed"
});
formatter.before({
  "duration": 906066380,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "To Verify user is able to change the language on community page",
  "description": "",
  "id": "testing-functionality-on-community-page;to-verify-user-is-able-to-change-the-language-on-community-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@revolut"
    },
    {
      "line": 19,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User navigates to \"RevolutHome\" Page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User clicks on \"selectCountryIcon\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User enters \"searchUSText\" in \"searchCountryTextBox\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User clicks on \"USText\" from \"searchedCountryTextBox\"",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User validate that correct Url opens up for \"RevolutUSPage\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "RevolutHome",
      "offset": 19
    }
  ],
  "location": "CommunityPageStepDef.user_navigates_to_Page(String)"
});
formatter.result({
  "duration": 2328890605,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selectCountryIcon",
      "offset": 16
    }
  ],
  "location": "CommunityPageStepDef.user_clicks_on_Page(String)"
});
formatter.result({
  "duration": 192049695,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "searchUSText",
      "offset": 13
    },
    {
      "val": "searchCountryTextBox",
      "offset": 31
    }
  ],
  "location": "CommunityPageStepDef.user_enters_text_in_textBox(String,String)"
});
formatter.result({
  "duration": 393713596,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "USText",
      "offset": 16
    },
    {
      "val": "searchedCountryTextBox",
      "offset": 30
    }
  ],
  "location": "CommunityPageStepDef.user_clicks_on_text_from_search_dropdown(String,String)"
});
formatter.result({
  "duration": 440393642,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RevolutUSPage",
      "offset": 45
    }
  ],
  "location": "CommunityPageStepDef.user_validate_that_correct_url_opens_up_for_revolut(String)"
});
formatter.result({
  "duration": 30050901,
  "status": "passed"
});
formatter.after({
  "duration": 136291674,
  "status": "passed"
});
});