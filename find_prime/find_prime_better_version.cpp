
/** In order to find prime numbers using Sieve of Eratosthenes, 
    there's no need to divide the input number N by the all multiple of numbers
    If there is a composite number m, m is composed of a * b
    At that point, at least one of them is less than or equal to sqrt(N)
    */
#include <iostream>
#include <cmath>
using namespace std;
// Sieve of Eratosthenes in c++
void findPrime(int num) {
	int *arr;
	arr = (int *) malloc(sizeof(int)*num);
	// initialize the array as in order of num 
	for (int i = 2; i <= num; i++) {
		arr[i] = i;
	}
	// prime number -> should not be the muptiple of n
	// set the limit of divisor to the sqrt(num) 
	for (int i = 2, max_num = sqrt(num); i <= max_num; i++) { // i is a divisor
		if(arr[i] == 0) 
			continue; // ignore 0 values 
		for(int j = i + i; j <= num; j+=i) { // check muptiple of i as zero except i 
				arr[j] = 0;
		}
	}
	for(int i = 2; i <= num; i++) {
		if(arr[i])
			cout << arr[i] << " ";
	}
	free(arr);
}


int main(void) {
	int input;
	clock_t start, end;
	cout << "Enter an input : ";
	cin >> input;
	start = clock();
	findPrime(input);
	end = clock();

	double time = (double) (end - start) / CLOCKS_PER_SEC;
	cout << "Elapsed time : " << time << endl;
}
