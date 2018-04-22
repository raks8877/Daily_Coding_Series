N = 100005
starting = {}
ending = {}

n = int(input())
ar = [int(x) for x in input().split()]

for i in range(0, n):
    if(ar[i] not in starting ):
        starting[ar[i]] = i
    else:
        ending[ar[i]] = i
maxi = 0

for i in range(0, n):
    tmp = 0
    if(ar[i] in starting and ar[i] in ending):
        tmp = ending[ar[i]] - starting[ar[i]] + 1
    if(tmp > maxi):
        maxi = tmp
print(maxi)
