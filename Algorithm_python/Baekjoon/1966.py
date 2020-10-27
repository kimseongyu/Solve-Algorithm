def main():
    t = int(input())
    for _ in range(t):
        n, m = input().split()
        li = list(map(int, input().split()))
        for i in range(int(n)):
            li[i] = [li[i], i]
        c = 1
        while len(li) != 0:
            ma = 0
            for i in li:
                ma = max(ma, i[0])
            while li[0][0] != ma:
                li.append(li.pop(0))
            if li.pop(0)[1] == int(m):
                break
            c += 1
        print(c)


if __name__ == '__main__':
    main()