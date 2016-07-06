def peak1d(A, i, j):
	m = (i + j) // 2
	if A[m] >= A[m-1] and A[m+1] <= A[m]:
		return A[m]
	elif A[m-1] > A[m]:
		peak1d(A, i, m-1)
	elif A[m] < A[m+1]: 
		peak1d(A, m+1, j)





