t = int(input())

for i in range(t):
    a = 1
    d = []
    d = list(map(int, input().split()))
    for j in range(d[1]):
        a = (a*d[0]) % 10
    if a == 0 :
        print(10)
    else :
        print(a)