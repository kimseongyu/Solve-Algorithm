import sys

n = int(sys.stdin.readline())
li = [sys.stdin.readline().split() for i in range(n)]
for i in range(n):
    li[i][0] = int(li[i][0])
li = sorted(li, key=lambda x: x[0])
for i in li:
    print(*i)