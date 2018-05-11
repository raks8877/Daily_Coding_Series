n, k = map(int, input().split())

ar = [int(x) for x in input().split()]

for i in range(0, k):
    pos = i
    for j in range(i+1, n):
        if(ar[j] < ar[pos]):
            pos = j
    tmp = ar[i]
    ar[i] = ar[pos]
    ar[pos] = tmp


print(*ar)
    
