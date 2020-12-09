import sys
from collections import deque

def main():
    n, m = map(int, sys.stdin.readline().split())
    parent = {i:[] for i in range(1, n+1)}
    child = {i:[] for i in range(1, n+1)}
    for _ in range(m):
        a, b = map(int, sys.stdin.readline().split())
        parent[b].append(a)
        child[a].append(b)
    
    li = [0 for _ in range(n)]
    for i in range(1, n+1):
        que = deque()
        for j in range(1, n+1):
            if len(parent[j]) == 0 and li[j-1] == 0:
                que.append(j)
        while que:
            v = que.popleft()
            for j in child[v]:
                parent[j].remove(v)
            li[v-1] += i
    print(*li)

if __name__ == "__main__":
    main()