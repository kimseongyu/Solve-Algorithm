def main():
    s = input()
    stack = [0]
    for i in s:
        if i == '(':
            stack.append(1)
        else:
            if stack[-1] == 1:
                stack.pop()
            else:
                stack.append(2)
    print(len(stack)-1)            

if __name__ == '__main__':
    main()