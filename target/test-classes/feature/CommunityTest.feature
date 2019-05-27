Feature: Testing functionality on Community Page

@revolut
Scenario: To verify user navigation to correct topic page from Community Page
	Given User navigates to "RevolutCommunity" Page
	When User clicks on "searchIcon"
	And User enters "searchText" in "SearchTextBox"
	Then Verify "searchText" should appear in "searchDropdown"
	When User clicks on "searchText" from "searchDropdown"
	And Verify "searchText" is appearing as "topicTitle" on opened page 

@revolut	
Scenario: To Verify The Keyboard Shortcuts on Community Page
	Given User navigates to "RevolutCommunity" Page
	When User clicks on "hamburgerMenu"
	And User clicks on "keyboardShortcuts"
	Then User validate the content of "shortcutsOptions"
	
@revolut @regression	
Scenario: To Verify user is able to change the language on community page
	Given User navigates to "RevolutHome" Page
	When User clicks on "selectCountryIcon"
	And User enters "searchUSText" in "searchCountryTextBox"
	When User clicks on "USText" from "searchedCountryTextBox"
	Then User validate that correct Url opens up for "RevolutUSPage"

	