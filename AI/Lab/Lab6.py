'''
Question 1
graph = {
  'A': ['B', 'C'],
  'B': ['D', 'E'],
  'C': ['F', 'G'],
  'D': [],
  'E': [],
  'F': [],
  'G': []
}

visited = []
queue = []
goal = 'G'

def bfs(visited, graph, node):
  visited.append(node)
  queue.append(node)
  print("Visiting nodes:", end=" ")
  while queue:
    s = queue.pop(0)
    print(s, end=" ")
    if s == goal:
      print(f"\nTarget node {goal} found!")
      break
    for neighbour in graph[s]:
      if neighbour not in visited:
        visited.append(neighbour)
        queue.append(neighbour)

bfs(visited, graph, 'A')

Question 2

graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F', 'G'],
    'D': [],
    'E': [],
    'F': [],
    'G': ['H'],
    'H': []
}

visited = []
queue = []
goal = 'H'

def bfs(visited, graph, node):
    visited.append(node)
    queue.append(node)
    while queue:
        s = queue.pop(0)
        print(s, end=" ")
        if s == goal:
            print(f"\nGoal '{goal}' found.")
            return
        for neighbour in graph[s]:
            if neighbour not in visited:
                visited.append(neighbour)
                queue.append(neighbour)
    print(f"\nError: Goal '{goal}' not found in the graph.")

bfs(visited, graph, 'A')

Question 3
graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F', 'G'],
    'D': [],
    'E': [],
    'F': [],
    'G': []
}

goal = 'F'
visited = set()
count = 0

def dfs(visited, graph, node):
    global count
    if node not in visited:
        print(node)
        visited.add(node)
        count += 1
        if node == goal:
            print(f"Total nodes visited before reaching '{goal}': {count}")
            return True
        for neighbour in graph[node]:
            if dfs(visited, graph, neighbour):
                return True
    return False

dfs(visited, graph, 'A')
'''

graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F', 'G'],
    'D': [],
    'E': [],
    'F': [],
    'G': []
}

visited = []
queue = []

def bfs(visited, graph, node):
    visited.append(node)
    queue.append(node)
    while queue:
        s = queue.pop(0)
        print(s, end=" ")
        for neighbour in graph[s]:
            if neighbour not in visited:
                visited.append(neighbour)
                queue.append(neighbour)

bfs(visited, graph, 'A')


