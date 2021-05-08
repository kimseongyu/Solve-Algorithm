def solution(places):
    answer = []
    for i in places:
        p = []
        for j in range(5):
            for k in range(5):
                if i[j][k] == 'P':
                    p.append((j,k))
        
        ok = True
        for j in range(len(p)):
            for k in range(j+1, len(p)):
                l = abs(p[j][0]-p[k][0]) + abs(p[j][1]-p[k][1])
                if l <= 2:
                    if p[j][0] == p[k][0] and i[p[j][0]][p[j][1]+1] == 'X':
                        continue
                    elif p[j][1] == p[k][1] and i[p[j][0]+1][p[j][1]] == 'X':
                        continue
                    elif p[j][0]+1 == p[k][0] and p[j][1] > p[k][1] and p[j][0]+1 < 5 and p[j][1]-1 >= 0:
                        if i[p[j][0]][p[j][1]-1] == 'X' and i[p[j][0]+1][p[j][1]] == 'X':
                            continue
                    elif p[j][0]+1 == p[k][0] and p[j][1] < p[k][1] and p[j][0]+1 < 5 and p[j][1]+1 < 5:
                        if i[p[j][0]][p[j][1]+1] == 'X' and i[p[j][0]+1][p[j][1]] == 'X':
                            continue
                    else:
                        ok = False
                        break
            if ok == False:
                break
                    
        if ok:
            answer.append(1)
        else:
            answer.append(0)
    return answer

def main():
    places = [["XPXXX", "PXXXX", "XXXXX", "XXXXX", "XXXXX"]]
    answer = solution(places)
    print(answer)

if __name__ == '__main__':
    main()