#include <stdio.h> 
#include <string.h> 

int main() 
{ 
	unsigned long num1 = 1; 
	unsigned long num2 = 2; 
	unsigned long temp = 0; 
	unsigned long limit = 4000000; 
	unsigned long accum = num2; 
	while (num2 <limit) { 
	 	temp = num2; 
	 	num2 += num1; 
	 	num1 = temp; 
	 	if (num2 % 2 == 0) 
	 	 	accum += num2; 
	 	} 
	printf("accum: %lu \n",accum); 
	return 0; 
}
