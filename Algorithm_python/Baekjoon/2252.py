from collections import deque
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    parent = dict()
    childs = dict()
    for i in range(1, n+1):
        parent[i] = []
        childs[i] = []
    for i in range(m):
        a, b = map(int, sys.stdin.readline().split())
        parent[a].append(b)
        childs[b].append(a)
    
    que = deque()
    for i in parent:
        if len(parent[i]) == 0:
            que.append(i)

    ans = deque()
    while que:
        v = que.pop()
        ans.appendleft(v)
        for i in childs[v]:
            parent[i].remove(v)
            if len(parent[i]) == 0:
                que.append(i)
    print(*ans)

if __name__ == '__main__':
    main()