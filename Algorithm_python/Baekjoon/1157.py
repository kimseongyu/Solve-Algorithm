s = input().upper()
arr = {}

for i in range(len(s)) :
    if arr.get(s[i], False) :
        arr[s[i]] += 1
    else :
        arr[s[i]] = 1

max = 0

for i in arr.keys() :
    if max < arr[i] :
        max = arr[i]

count = 0
c =''

for i in arr.keys() :
    if max == arr[i] :
        count += 1
        c = i

if count > 1:
    print('?')
else :
    print(c)