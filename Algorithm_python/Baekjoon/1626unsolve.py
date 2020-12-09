import sys

parent = {}
rank = {}

def make_set(v):
    parent[v] = v
    rank[v] = 0

def find(v):
    if v != parent[v]:
        parent[v] = find(parent[v])
    return parent[v]

def union(u, v):
    root1 = find(u)
    root2 = find(v)

    if root1 != root2:
        if rank[root1] > rank[root2]:
            parent[root2] = root1
        else:
            parent[root1] = root2
            if root1 == root2:
                rank[root2] += 1

def kruskal(vertex, edges):
    for u in vertex:
        make_set(u)

    sum = 0
    for e in edges:
        cost, u, v = e
        if find(u) != find(v):
            union(u, v)
            sum += cost

    count = 0
    for i in parent.keys():
        if i == parent[i]:
            count += 1
    if count != 1:
        sum = -1

    return sum

def main():
    v, e = map(int, sys.stdin.readline().rsplit())

    vertices = []
    edges = []

    for i in range(1, v+1):
        vertices.append(str(i))
    for _ in range(e):
        u, v, c = sys.stdin.readline().rsplit()
        edges.append((int(c), u, v))
    edges.sort()
    
    result = kruskal(vertices, edges)
    m = sys.maxsize
    for i in range(e):
        edge = edges[:i] + edges[i+1:]
        s = kruskal(vertices, edge)
        if (s != -1) & (s > result):
            m = min(m, s)
    if m == sys.maxsize:
        print(-1)
    else:
        print(m)

if __name__ == '__main__':
    main()