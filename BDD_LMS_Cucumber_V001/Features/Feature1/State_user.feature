Feature: State
Scenario: Validating State dropdown
Given Admin/User/Staff is on Manage user page 
	When Admin/User/Staff clicks on state dropdown	
	Then Admin/User/Staff see list of states in Alphabetical Order
