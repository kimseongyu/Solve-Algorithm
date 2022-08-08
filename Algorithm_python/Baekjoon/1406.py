from collections import deque
import sys
input = sys.stdin.readline

def main():
    s = deque(input().rstrip())
    
    cursor = len(s)
    for i in range(int(input())):
        op = input().split()
        if op[0] == 'L':
            if cursor != 0:
                s.rotate(1)
                cursor -= 1
        elif op[0] == 'D':
            if cursor != len(s):
                s.rotate(-1)
                cursor += 1
        elif op[0] == 'B':
            if cursor != 0:
                s.pop()
                cursor -= 1
        else:
            s.append(op[1])
            cursor += 1
    s.rotate(cursor-len(s))
    print("".join(s))

if __name__ == '__main__':
    main()