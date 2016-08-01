def shortest_path_bottomup(graph, s):
	'''Bottom-up DP for finding single source shortest paths on DAG
		
	Args: 
		graph: weighted DAG.
		s: source 
	'''
	order = topological_sort(graph)
	result = ShotestPathResult()
	for v in graph.itervertices():
		result.d[v] = float('inf')
		result.parent[v] = None 
	result.d[s] = 0
	for v in order:
		for w in graph.neighbors(v):
			new_distance = result.d[v] + graph.weigt(v, w)
			if result.d[w] > new_distance:
				result.d[w] = new_distance
				result.parent[w] = v
			return result


