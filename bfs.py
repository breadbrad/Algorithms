#Breadth-first search 
'''explore graph level by level from s(start)
-level 0 = {s}
-level i = vertices reachable by path of i edges but not fewer
-build level i > 0 from level i-1 by trying all outgoing edges,
but ignoring vertices from previous levels '''
def BFS(s, Adj):
	level = {'s', 0}
	parent = {'s', None}
	i = 1
	frontier = [s]	#previous level, i-1
	while frontier:
		next = []	#next level, i 
		for u in frontier:
			for v in Adj[u]:
				if v not in level: #not yet seen 
					level[v] = i 	#level[u] += 1
					parent[v] = u
					next.append(v)
		frontier = next
		i += 1 

