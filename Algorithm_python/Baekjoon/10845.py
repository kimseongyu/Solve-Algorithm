from collections import deque
import sys
input = sys.stdin.readline

def main():
    n = int(input())
    que = deque()
    for i in range(n):
        op = input().split()
        if op[0] == 'push':
            que.append(op[1])
        elif op[0] == 'pop':
            if len(que) == 0:
                print(-1)
            else:
                print(que.popleft())
        elif op[0] == 'size':
            print(len(que))
        elif op[0] == 'empty':
            if len(que) == 0:
                print(1)
            else:
                print(0)
        else:
            if len(que) == 0:
                print(-1)
            else:
                if op[0] == 'front':
                    print(que[0])
                else:
                    print(que[-1])

if __name__ == '__main__':
    main()