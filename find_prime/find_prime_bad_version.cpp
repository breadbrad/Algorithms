// // normal prime finding algorithm 
// public static void findPrime(int input){
// 	int i = 2;
// 	boolean isPrime = true;
// 	while (i <= input) {
// 		isPrime = true;
// 		for (int j = 2; j < i; j++) {
// 			if(i % j == 0) {
// 				isPrime = false;
// 			}
// 			continue;
// 		}
// 		if(isPrime)
// 			System.out.println(i);
// 		i++;
// 	}
// }

#include <iostream>
using namespace std;
// Sieve of Eratosthenes in c++
void findPrime(int num) {
	int *arr;
	arr = (int *) malloc(sizeof(int)*num);
	// initialize the array as in order of num 
	for (int i = 2; i <= num; i++) {
		arr[i] = i;
	}

	 for (int i = 2; i <= num; i++) {  
        for (int j = 2; j <= num; j++) {
            if (arr[j] != i && arr[j] % i == 0) {  
                arr[j] = 0; 
            }
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
