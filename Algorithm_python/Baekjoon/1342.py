def main():
    s = input()
    length = len(s)
    dic = {}
    for i in s:
        try:
            dic[i] += 1
        except:
            dic[i] = 1
    
    def func(pre, size):
        if size == length:
            return 1
        num = 0
        size += 1
        for i in dic:
            if pre == i or dic[i] == 0:
                continue
            dic[i] -= 1
            num += func(i, size)
            dic[i] += 1
        return num
    
    ans = func('', 0)
    print(ans)

if __name__ == '__main__':
    main()