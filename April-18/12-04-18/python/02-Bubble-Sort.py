n = int(input())
ar = [int(x) for x in input().split()]

cnt = 0
for i in range(0, n -1):
    for j in range(0, n - i - 1):
        if(ar[j] > ar[j+1]):
            tmp = ar[j]
            ar[j] = ar[j+1]
            ar[j+1] = tmp
            cnt += 1
print(cnt)
