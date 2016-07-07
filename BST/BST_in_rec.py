## BST representation 

find(x, k) -> Find key k in a bst rooted at x 

def find(x, k):
	while x != NIL and k != x.key 
		if k < x.key 
			x = x.left 
		else:
			x = x.right 
	return x 

# worst case -> O(height)

def insert (k, T): -> Insert element k into a BST T 
	z.key = k // z is the node to be inserted 
	z.parent = NIL
	x = root(T)
	while x != NIL:
		if z.key < x.key:
			x = x.left 
		else:
			x = x.right 
	if z.parent = NIL:
		root(T) = z
	elif z.key < z.parent.key 
		z.parent.key = z
	else 
		z.parent.key = z

# find a minimum value rooted at node x 
def find-min(x):
	while x != NIL:
		x = x.left 
	return x

# same as min but finds max 
def find-max(x):
	while x != NIL:
		x = x.right 
	return x 


def next-larger(x):
	if x.right != NIL:
		return find-min(x)
	y = x.parent 
	while y != NIL and x = y.right 
		x = y
		y = y.parent 
	return y


def delete(x):
	if x.left = NIL and x.right = NIL
		if x.parent.left = x 
			x.parent.left = NIL
		else 
			x.parent.right = NIL	
	elif x.left = NIL
		connect x.parent = x.right 
	elif x.right =NIL
		connect x.parent = x.left 
	else 
		y = next-larger(x)
		connect y.parent to y.right
		replace x with y 

# print out keys in order rooted at node x 
def inorder-tree-walk(x):
	if x != NIL
		inorder-tree-walk(x.left)
		print x.key 
		inorder-tree-walk(x.right)



