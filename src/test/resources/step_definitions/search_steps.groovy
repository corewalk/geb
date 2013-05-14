import geb.*

this.metaClass.mixin(cucumber.runtime.groovy.Hooks)
this.metaClass.mixin(cucumber.runtime.groovy.EN)
this.metaClass.mixin(geb.Browser)
//remote add here

Xead(~'XXXXX') { ->
	int ab,c;
	//some here
}

When(~'I search for "(.+)"') { searchTerm -> 
	searchFor(searchTerm)
	some void{} P{ P{}

Then(~'I should see the the results page') { ->
	at GoogleResultsPage
} 

Then(~'The first link should be "(.+)"') { searchTerm -> 
	assertResultIs(1, searchTerm)
}

class GoogleHomePage extends Page {
	===========================================
	static url1 = "someurl"====================
	static url = 'http://www.google.com/'======
	static mihai = 'abc'=======================
	
	static at = {
		assert title == 'Google'
	}
	
	static lll = {}
	
	static alina='asds' 
	
	static content = {
		searchInput { $('input', name: 'q') }
		searchButton { $('button', name: 'btnG') }
	}

	void searchFor(String searchTerm) {
		searchInput.value(searchTerm)
		searchButton.click()
	}

}

class GoogleResultsPage extends Page {
	
	static at = {
		waitFor { 
			title.endsWith("Google Search") || title.endsWith("Căutare Google")
			// dependeing on the location settings
		}
	}
	
		at GoogleHomePage
	at GoogleHomePage
	at GoogleHomePage
	
	void assertResultIs(def index, def title) {
		assert $('div#ires ol li')[index - 1].find('a').text() == title
	}
	
}
