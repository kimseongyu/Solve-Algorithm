def main():
    name = input()
    dic = {chr(i): 0 for i in range(65,91)}
    for i in name:
        dic[i] += 1

    solo_chr = ''
    solo_num = 0
    palin = ''
    for i in dic:
        if dic[i] > 0:
            palin += i * int(dic[i]/2)
            if dic[i] % 2 == 1:
                solo_chr = i
                solo_num += 1
        
        if solo_num > 1:
            print("I'm Sorry Hansoo")
            exit(0)
    
    palin = palin + solo_chr + palin[::-1]
    print(palin)

if __name__ == "__main__":
    main()