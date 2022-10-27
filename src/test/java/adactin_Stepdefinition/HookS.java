package adactin_Stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookS {
	@Before
	void beforescenario() {
		System.out.println("before scenario");
	}
	
	@After
	void afterscenario() {
		System.out.println("after scenario");
	}

}
