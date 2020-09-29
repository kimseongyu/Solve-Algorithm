def main():
    a, b = map(float, input().split())
    c, d = int(a), int(b)

    if a == b :
        print(format(1-(20-2*a)/(18*17),".3f"))
    else :
        n = 0
        for i in range(1, 11):
            for j in range(1, 11):
                if i == j :
                    continue
                if ((i+j)%10) < ((c+d)%10) :
                    if ((c == i) | (c == j)) | ((d == i) | (d == j)) :
                        n += 1
                    else :
                        n += 2
        print(format(2*n/(18*17),".3f"))

if __name__ == "__main__":
    main()