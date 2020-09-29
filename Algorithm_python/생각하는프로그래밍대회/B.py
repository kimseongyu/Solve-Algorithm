
def main():
    n = int(input())
    li = []
    for i in range(n):
        li += [list(map(int,input().split()))]

    an = []
    for i in range(n):
        l = []
        for j in range(n):
            an += [l]

    m = -1000
    for i in range(n):
        for j in range(n):
            m = max(m, li[i][j]) 
    print(m)

if __name__ == '__main__':
    main()