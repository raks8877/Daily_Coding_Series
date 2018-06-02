n = int(input())
ar = [int(x) for x in input().split()]

a = 0
b = 0
c = 0

for i in range(0, n, 3):
    a += ar[i]

for i in range(1, n, 3):
    b += ar[i]

for i in range(2, n, 3):
    c += ar[i]

print(a,b,c)
