def main():
    a = input()
    b = input()
    c = []
    for i in range(len(a)):
        c.append(int(a[i]))
        c.append(int(b[i]))

    for i in range(len(c)-2):
        d = []
        for j in range(len(c)-1):
            d.append((c[j]+c[j+1])%10)
        c = d
    
    print(*c, sep='')

if __name__ == '__main__':
    main()