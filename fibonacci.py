## naive algorithm: follow recursive algorithm
fib(n):
	if n <= 2 : f = 1
	else: f = fib(n-1) + fib(n-2)
	return f

# T(n) = T(n-1) + T(n-2) + O(1) >= Fn

## Memoized DP algorithm 
	memo = {}
	if n in memo: return memo[n]
	else: f = fib(n-1) + fib(n-2)
	memo[n] = f 
	return f

## Bottom-up DP algorithm 
	fib = {}
	for k in [1,2, ..., n]
		if k <= 2: f = 1
		else: f = fib[k-1] + fib[k-2]
		fib[k] = f 
	return fib[n]

 
