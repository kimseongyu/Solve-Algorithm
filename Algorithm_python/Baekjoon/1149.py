import sys
input = sys.stdin.readline

def main():
    n = int(input())
    rgb = [list(map(int, input().split())) for i in range(n)]
    cost = [0,0,0]
    for i in rgb:
        a = min(cost[1], cost[2]) + i[0]
        b = min(cost[0], cost[2]) + i[1]
        c = min(cost[0], cost[1]) + i[2]
        cost = [a,b,c]
    print(min(cost))

if __name__ == '__main__':
    main()