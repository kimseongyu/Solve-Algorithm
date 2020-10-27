def main():
    k , n = input().split()
    li = []
    for i in range(int(k)):
        li += [int(input())]

    mi = 1
    ma = max(li)
    while mi <= ma:
        av = int((mi+ma)/2) 
        count = 0
        for i in li:
            count += int(i / av)
        
        if count >= int(n):
            mi = av+1
        else:
            ma = av-1
    
    print(ma)

if __name__ == '__main__':
    main()