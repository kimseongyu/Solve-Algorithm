import sys
from collections import defaultdict, deque
INF = float('inf')

def bfs(s, d, parent, edge):
    visit = defaultdict(lambda: 0)
    visit[s] = 1
    que = deque()
    que.append(s)

    while que:
        u = que.popleft()
        for i in edge[u]:
            if visit[i]: continue
            if edge[u][i] <= 0: continue
            visit[i] = 1
            que.append(i)
            parent[i] = u
    return visit[d]

def ford_fulkerson(s, d, edge):
    parent = defaultdict(lambda: -1)
    max = 0
    while bfs(s, d, parent, edge):
        max += 1
        v = d
        while v != s:
            u = parent[v]
            edge[u][v] -= 1
            edge[v][u] += 1
            v = parent[v]
    return max

def main():
    n, p = map(int, sys.stdin.readline().split())
    edge = defaultdict(lambda: defaultdict(int))
    for _ in range(p):
        s, d = map(int, sys.stdin.readline().split())
        edge[s][d] = 1
        edge[d][s] = 0
    print(ford_fulkerson(1, 2, edge))

if __name__ == "__main__":
    main()