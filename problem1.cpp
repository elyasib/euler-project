#include <stdio.h> 
#include <string.h> 

//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.

int main() 
{ 
	 int numA = 3; 
	 int numB = 5; 
	 int limit = 1000; 
	 int currMultA = numA; 
	 int currMultB = numB; 
	 unsigned long accum = 0; 
	 while (currMultA < limit || currMultB <limit) { 
	 	 if (currMultA < currMultB) { 
	 	 	 accum += currMultA; 
	 	 	 currMultA += numA; 
	 	 	 } 
	 	 else if (currMultA > currMultB) { 
	 	 	 accum += currMultB; 
	 	 	 currMultB += numB; 
	 	 	 } 
	 	 else { 
	 	 	 accum += currMultA; 
	 	 	 currMultA += numA; 
	 	 	 currMultB += numB; 
	 	 	 } 
	 	 } 
	 printf("accum: %lu",accum); 
	 return 0; 
} 

