from collections import deque
import sys
input = sys.stdin.readline

def main():
    n = int(input())

    stack = deque()
    for i in range(n):
        op = input().split()
        if op[0] == 'push':
            stack.append(int(op[1]))
        elif op[0] == 'pop':
            if len(stack) == 0:
                print(-1)
            else:
                print(stack.pop())
        elif op[0] == 'size':
            print(len(stack))
        elif op[0] == 'empty':
            if len(stack) == 0:
                print(1)
            else:
                print(0)
        else:
            if len(stack) == 0:
                print(-1)
            else:
                t = stack.pop()
                print(t)
                stack.append(t)

if __name__ == '__main__':
    main()