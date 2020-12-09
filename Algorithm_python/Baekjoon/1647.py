import sys
parent = {}
rank = {}

def make_set(n):
    for i in range(1, n+1):
        parent[i] = i
        rank[i] = 0

def find(v):
    if parent[v] != v:
        parent[v] = find(parent[v])
    return parent[v]

def union(a, b):
    a = find(a)
    b = find(b)

    if a != b:
        if rank[a] > rank[b]:
            parent[b] = a
        else:
            parent[a] = b
            if rank[a] == rank[b]:
                rank[b] += 1

def kruskal(edge, n):
    make_set(n)
    mst = []
    cost = 0
    for i in edge:
        c, a, b = i
        if find(a) != find(b):
            union(a, b)
            mst.append(i)
            cost += c
    cost -= mst.pop()[0]
    return cost

def main():
    n, m = map(int, sys.stdin.readline().split())
    edge = []
    for i in range(m):
        a, b, c = map(int, sys.stdin.readline().split())
        edge.append((c, a, b))
    edge.sort()
    print(kruskal(edge, n))

if __name__ == "__main__":
    main()