def solution(n, k, cmd):
    li = [i for i in range(n)]
    l = n
    z = []
    for i in cmd:
        if i[0] == 'U':
            k -= int(i[2:])
            if k < 0:
                k = 0

        elif i[0] == 'D':
            k += int(i[2:])
            if k >= l:
                k = l-1

        elif i[0] == 'C':
            if l > 0:
                num = li[k]
                z.append((li.index(num), num))
                li.remove(num)
                l -= 1
                if k >= l:
                    k = l-1

        elif i[0] == 'Z':
            if len(z) > 0:
                index, num = z.pop()
                li.insert(index, num)
                if index <= k :
                    k += 1
                l += 1
    
    answer = ''
    for i in range(n):
        if l > 0:
            if li[0] == i:
                li.pop(0)
                l -= 1
                answer += 'O'
            else:
                answer += 'X'
        else:
            answer += 'X'
    return answer