def solution(s):
    li = ["zero","one","two","three","four","five","six","seven","eight","nine"]
    for i in range(10):
        s = s.replace(li[i], str(i))
    return int(s)