n = int(input())
ar = [int(x) for x in input().split()]
k = int(input())
pos = -1

for i in range(0, n):
    if(ar[i] == k):
        pos = i
        break
print(pos)
