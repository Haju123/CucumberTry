package com.czeczotka.bdd.steps;

import com.czeczotka.bdd.calculator.Calculator;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CalculatorSteps {

    private Calculator calculator;
    int actualoutput = 0;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    
    @Given("open a calucltor and give (\\d+) and (\\d+) as input")
    public void open_a_calucltor_and_give_and_as_input(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    	calculator.setA(arg1);
    	calculator.setB(arg2);
    }
    
  
    
    @When("^something with (.*)")
	public void something_with_add(String action) throws Throwable {
		System.out.println(action);
		String type ="add";
		if (action.equals(type)) {
			actualoutput = calculator.add();
			System.out.println(actualoutput);
		} else {
			actualoutput = calculator.subtract();
			System.out.println(actualoutput);
		}
	}
    
   
   @Then("the result should be (\\d+)")
    public void the_result_should_be(int result) throws Throwable {
        assertEquals(result, actualoutput);
    }
    
    
    }
