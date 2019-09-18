Feature: Search string on wikipedia
  
  Scenario: Search for a given string in English
		Given user is on home page
		When user type a string
		And user click search button
		Then search results matches the search string
		And search results is available in other languages
		And search results page in the new language includes a link to the version in English
	
		