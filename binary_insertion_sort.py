def binary_search(a, x, lo=0, hi=None):
    if lo < 0:
        raise ValueError('lo must be non-negative')
    if hi is None:
        hi = len(a)
    while lo < hi:
        mid = (lo+hi)//2
        if x < a[mid]: 
        	hi = mid
        else: 
        	lo = mid+1
    return lo



def binary_insertion_sort(A):
    for i in xrange(1, len(A)):
        key = A[i]
        # invariant: ``A[:i]`` is sorted        
        # find the least `low' such that ``A[low]`` is not less then `key'.
        #   Binary search in sorted sequence ``A[low:hi]``:
        low, hi = 0, i
        while hi > low:
            mid = (low + hi) // 2
            if A[mid] < key:
                low = mid + 1              
            else:
                hi = mid
        # insert key at position ``low``
        A[:] = A[:low] + [key] + A[low:i] + A[i + 1:]

