import sys

def main():
    # 비트마스킹을 사용하여 집합으로 저장
    # 이진수의 2~21번째 , 20칸 사용하여 저장
    # 1번째 칸은 연산을 편리하게 하기 위하여 사용하지 않는 칸 
    s = 0x00000
    for i in range(int(sys.stdin.readline())):
        exp = sys.stdin.readline().split()
        op, n = exp[0], exp[-1]
        if op == 'add':
            # n번 만큼 쉬프트 연산 후 or 연산을 통해 해당 수 저장
            s = s|(1<<int(n))
        elif op == 'remove':
            # n 번 만큼 쉬프트 연산 후 수를 뒤집어 해당 자리만 0으로 만들어
            # and 연산을 통해 해당 자리를 0으로 만들어 비워준다.
            s = s&~(1<<int(n))
        elif op == 'check':
            # n 번 만큼 쉬프트 연산 후 n+1번째 칸을 1번으로 가져와서
            # and 연산을 하여 존재하면 1, 존재하지 않으면 0을 출력
            print((s>>int(n))&1)   
        elif op == 'toggle':
            # n번 만큼 쉬프트 연산 후 xor 연산을 통해 뒤집어준다.
            s = s^(1<<int(n))
        elif op == 'all':
            # 이진수의 2~21번째 수가 모두 1인 16진수 수
            s = 0x1FFFFE
        elif op == 'empty':
            s = 0x00000

if __name__ == '__main__':
    main()
