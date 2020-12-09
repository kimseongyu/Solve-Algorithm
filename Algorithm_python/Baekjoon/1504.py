import sys, heapq
INF = float('inf')

def dijkstra(edge, s, d, n):
    dist = [INF for _ in range(n+1)]
    dist[s] = 0
    que = []
    heapq.heappush(que, (0, s))

    while que:
        v = heapq.heappop(que)
        for n in edge[v[1]]:
            if dist[n[0]] > v[0] + n[1]:
                dist[n[0]] = v[0] + n[1]
                heapq.heappush(que, (dist[n[0]], n[0]))
    return dist[d]

def main():
    n, e = map(int, sys.stdin.readline().split())
    edge = [[] for _ in range(n+1)]
    for _ in range(e):
        a, b, c = map(int, sys.stdin.readline().split())
        edge[a].append((b, c))
        edge[b].append((a, c))
    v1, v2 = map(int, sys.stdin.readline().split())
    a = dijkstra(edge, 1, v1, n) + dijkstra(edge, v1, v2, n) + dijkstra(edge, v2, n, n)
    b = dijkstra(edge, 1, v2, n) + dijkstra(edge, v2, v1, n) + dijkstra(edge, v1, n, n)
    if min(a, b) != INF:
        print(min(a, b))
    else:
        print(-1)

if __name__ == "__main__":
    main()