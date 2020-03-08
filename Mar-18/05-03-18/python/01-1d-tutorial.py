n = int(input())
ar = {}
for i in range(0,n):
    ar[i] = input()

for i in range(n-1,0-1,-1):
    print(ar[i])
