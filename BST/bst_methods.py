## next_larger() and next_smaller() 
## returns the next larger (the successor) or next smaller (the predecessor)

def next_larger(self):
	if self.right is not None:
		return self.right.find_min()
	current = self 
	while current.parent is not None and current is current.parent.right:
		current = current.parent
	return current.parent

## delete () : removes the node x from the bst 
# case 1 : x has no children, just delete it
# case 2 : x has one child. Splice out (connect) x.parent and x.child
# case 3 : x has two children. Splice out x.successor and replace x with x.successor

def delete(self):
	if self.left is None or self.right is None:
            if self is self.parent.left:
                self.parent.left = self.left or self.right
                # case 1 
                if self.parent.left is not None:
                    self.parent.left.parent = self.parent
                    self.parent.min = self.parent.left.min
                # case 2 
                else: 
                    self.parent.min = self.parent
                # Propagates the changes upwards.
                c  = self.parent
                while c.parent is not None and c is c.parent.left:
                    c.parent.min = c.min
                    c = c.parent
            else:
                self.parent.right = self.left or self.right
                if self.parent.right is not None:
                    self.parent.right.parent = self.parent
            return self
        else:
            s = self.next_larger()
            self.key, s.key = s.key, self.key
            return s.delete()

def insert(self, node):
        if node is None:
            return
        if node.key < self.key:
            # Updates the min of this node if the inserted node has a smaller
            # key.
            if node.key < self.min.key:
                self.min = node
            if self.left is None:
                node.parent = self
                self.left = node
            else:
                self.left.insert(node)
        else:
            if self.right is None:
                node.parent = self
                self.right = node
            else:
                self.right.insert(node)

