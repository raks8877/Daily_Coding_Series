#This solu gives TLE
n = int(input())
ar = [int(x) for x in input().split()]
 
for _ in range(int(input())):
    x = int(input())
    for i in range(0, n):
        if(ar[i] > x):
            ar[i] -= 1
 
print(*ar)
