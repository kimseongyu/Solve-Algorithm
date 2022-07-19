def main():
    word = input()
    first = 'z' * 50
    for i in range(1,len(word)):
        for j in range(i+1, len(word)):
            new = word[i-1::-1] + word[j-1:i-1:-1] + word[:j-1:-1]
            if new < first:
                first = new
    print(first)

if __name__ == '__main__':
    main()