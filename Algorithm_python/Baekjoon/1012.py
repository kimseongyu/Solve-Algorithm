from collections import deque

def main():
    t = int(input())
    for _ in range(t):
        m, n, k = map(int, input().split())
        li = [[ 0 for j in range(n)] for i in range(m)]
        for i in range(k):
            x, y = map(int, input().split())
            li[x][y] = 1
        
        count = 0
        dx = [1, -1, 0, 0]
        dy = [0, 0, 1, -1]
        for i in range(m):
            for j in range(n):
                if li[i][j] == 1:
                    
                    q = deque()
                    q.append([i, j])
                    while q:
                        v = q.pop()
                        li[v[0]][v[1]] = 0
                        for k in range(4):
                            x = v[0] + dx[k]
                            y = v[1] + dy[k]
                            if  0 <= x < m and 0 <= y < n:
                                if li[x][y] == 1:
                                    q.append([x, y])

                    count += 1
        print(count)

if __name__ == '__main__':
    main()