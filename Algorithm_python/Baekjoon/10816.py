import sys
input = sys.stdin.readline

def main():
    n = int(input())
    li = {}
    for i in list(map(int, input().split())):
        try:
            li[i] += 1
        except:
            li[i] = 1

    m = int(input())
    for i in list(map(int, input().split())):
        try:
            print(li[i], sep = ' ')
        except:
            print(0, sep = ' ')

if __name__ == '__main__':
    main()
