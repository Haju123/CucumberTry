Feature: Calculator
  As a user
  I want to use a calculator
  So that I don't need to calculate myself

  Scenario Outline: calculator add and subtract 
	Given open a calucltor and give <a> and <b> as input  
	When something with <action>
	Then the result should be <output>
	  
	
	Examples: 
		|a  | b | output|action |
		| 2 | 3 | 5     |add    |
		| 2 | 5 | 7     |add    |
		|5	| 3 | 2     |sub    |
		