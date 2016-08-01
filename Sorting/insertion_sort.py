def insertion_sort (A):
	for j in range(len(A)):
		key = A[j]
		# insert A[j] into sorted sequence A[0..i-1]
		i = j - 1
		while i > -1 and A[i] > key:
			A[i+1] = A[i]
			i -= 1
		A[i+1] = key
	return A 

