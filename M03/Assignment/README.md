# Android Unit Testing

For this app, you'll be building a simple, basic calculator that performs math operations. 
> You will also not be building a UI for this project.

## Steps

1. Build a `Calculator` class with a constructor injected parameter of type `Math` which is another class.  
2. Add two functions to the `Math` class, one to calculate the sum of squares of two numbers and the other to find the difference between the absolute values of two numbers. 

3. Write two functions in the `Calculator` functions to provide APIs to a client using the `Calculator` class. 
* The first function should be named `factorial` that accepts one parameter that calls the corresponding function in the `Math` class. 
* The second function should be named `difference` that accepts two parameters that calls the corresponding function in the `Math` class.

4. Write unit tests for verifying both the functions in the `Calculator` class.
* The unit tests should use a mock object for the `Math` class. 
* The unit tests should have mock implementation for the functions defined in the `Math` class.

5. Verify code coverage for your unit tests to see if the `Calculator` class is fully covered by the tests. 


#### Go Further (for the more curious)

* Learn what parameterized tests are write a function to check if a given number is a prime number. Now add parameterized tests to this function to verify the behavior of the function. 
Read more about parameterized tests here. 
https://github.com/junit-team/junit4/wiki/parameterized-tests  
https://blog.kotlin-academy.com/parametrized-tests-with-spek-e0e02d5766a




############OLD FOLOWSSFD3###









# Android Test Driven Design Calculator

For this app, you'll bulid a simple, basic calculator. The difference, is that you'll be using Test Driven design to do it.
> You will also not be building a UI for this as we will be using TDD to do that for the next assignment.

## Steps

1. Build a `Calculator` class with an empty constructor and a method called `addSymbol` or something to that effect which accepts and returns a string. For now it will just return the accepted string.
> Don't implement this now, but This method will be called when a symbol button is pressed (number or decimal), it will add that symbol to its internal member tracking the number entered into the calculator and then return a string representation of that number to be displayed

2. Write 2 tests, 1 to test if the method works when used once to add a single character when nothing else has been added, and 1 to test when multiple consecutive strings are added.  Run the tests.
> The first test should pass, but the second test should fail.

3. Implement that method in your calculator class.
4. Continue in this manner. Build a test for a step you want to perform, say, adding a decimal. Think of all the potential use cases to cover ie: adding a single decimal, what if the number already has a decimal. Since the Calculator is part of a separate class, it shouldn't manipulate any UI instead, return the desired string to be displayed.

This calculator should have the following features:
* Add numbers (in the future, you'll add them with buttons 0-9), but for now, just call the methods manually
* Add a decimal to the current number
* Remove the most recently added character (backspace)
* Perform the following calculations
	* Addition
	* Subraction
	* Multiplication
	* Division
* Perform repeated calculations (5 * 10 = 50, pressing equals again should return 500, etc.)
* Clear all values

Be sure to add test cases for each use case on each feature before implementing that feature

#### Go Further

* Add more functions to your calculator (square, square root, pi)
