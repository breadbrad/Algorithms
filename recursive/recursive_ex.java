public static double power(double x, int n) {
	if (n == 0)
		return 1;
	else 
		return x * power(x, n-1);
}


public static int gcd(int m, int n) {
	if (m % n == 0) 
		return n;
	else if (m < n)
		return gcd(n, m); // transpose arguments 
	else 
		return gcd(n, m % n); 
}

/** recursive vs iterative 
	iteration -> loop header determines whether to repeat the loop body or not 
	recursion -> tests for base case, it stops when the base case is reached */
public static int factorialRec(int n){
	if (n == 0) 
		return 1;
	else 
		n * factorialRec (n - 1);
}

public static int factorialIter (int n) {
	int result = 1;
	for (int k = 1; k <= n; k++)
		result *= k;
	return result;
}

private static int fibo(int fibCurrent, int fibPrevious, int n) {
	if (n == 1)
		return fibCurrent;
	else 
		return fibo(fibCurrent + fibPrevious, fibCurrent, n - 1)
}

public static int fibonacci(int n){
	return fibo(1, 0, n);
}



