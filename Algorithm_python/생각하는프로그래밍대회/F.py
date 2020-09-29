def main():
    p, m = input().split()
    I = []
    n = []
    for _ in range(int(p)):
        a, b = input().split()
        I.append(int(a))
        n.append(b)

    anI = []
    ann = []
    for i in range(int(p)):
        ok = True
        for j in range(len(anI)):
            if len(anI[j]) < int(m):
                if anI[j][0]-10 <= I[i] <= anI[j][0]+10:
                    anI[j].append(I[i])
                    ann[j].append(n[i])
                    ok = False
                    break
        if ok:
            anI += [[I[i]]]
            ann += [[n[i]]]

    for i in range(len(anI)):
        if len(anI[i]) < int(m):
            print('Waiting!')
        else:
            print('Started!')

        for j in range(len(anI[i])-1):
            for k in range(len(anI[i])-j-1):
                if ann[i][k] > ann[i][k+1]:
                    ann[i][k] , ann[i][k+1] = ann[i][k+1], ann[i][k]
                    anI[i][k] , anI[i][k+1] = anI[i][k+1], anI[i][k]
        
        for j in range(len(anI[i])):
            print(anI[i][j], ann[i][j])

if __name__ == '__main__':
    main()