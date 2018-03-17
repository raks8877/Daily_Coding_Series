n = int(input())
ar = {}

for i in range(0,n):
    data = input().split()
    ar[int(data[1])] = data[0]

cnt = 0
for i in reversed(sorted(ar)):
    cnt += 1
    if(cnt<=3):
        print(ar[i])
    else:
        break
