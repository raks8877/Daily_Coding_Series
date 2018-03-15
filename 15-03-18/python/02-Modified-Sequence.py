n = int(input())
ar = [int(x) for x in input().split()]

diff = ar[0]
for i in range(1,n):
    diff = ar[i] - diff
    if(diff<0):
        break
if(diff==0):
    print("YES")
else:
    print("NO")
