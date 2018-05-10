n = int(input())
ar1 = [int(x) for x in input().split()]
ar2 = [int(x) for x in input().split()]

ar1.sort()
ar2.sort()

flag = True

for i in range(0, n):
    if(ar2[i] >= ar1[i]):
        flag = False
        break

if(flag):
    print("Yes")
else:
    print("No")
