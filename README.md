# java-fundamentals

## clas01

basics dicrotory contain 4 methods

* main to call the methods and run them 

* pluralize that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

* flipNHeads hat accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row.

* clock  that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.

## clas02 

basicslibrary dicrotory contain 5 methods

* main to call the methods and run them 

* Rolling Dice that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.

* containsDuplicates that returns true or false depending on whether the array contains duplicate values

* calculatingAverages that accepts an array of integers and calculates and returns the average of all the values in the array.

* arrayOfArrays that Given an array of arrays calculate the average value for each array and return the array with the lowest average.

## class03 
this class has two section 

**basicslibrary dicrotory**

in this directory I added two meyhods to previos methods:

* uniqueTemp that use the October Seattle weather data above. Iterate through all of the data to find the min and max values.
     and iterate from the min temp to the max temp and create a String containing any temperature not seen during the month. Return that String.
* tally  that accepts a List of Strings representing votes and returns one string to show what got the most votes.

**linter**

in this directory I make two meyhods:
* main
* returnError that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a 
semi-colon.

## class06

In this inheretances directory there is 3 class one for the LIbrary and the rest:

     * Review that take an 3 parameters so, each review has (body , author , number Of stars)
    
     * Resturent that take an two parameters name of resturent and the price category
     the  Resturent has an addReview method that take an object with type Review and add it to list of reviews for the instance resturent
     and the updateNumberOfStar method that update the number of stars depend on average starts for all reviews
## class07

In this inheretances directory I added 2 class and interface:

* Reveiwable its a interface and I put insaide it two methods one for update number of stars and the other for adding reveiw

* shope its a class like resturent
* theater its a class has a movies and same properites for resturent  