n , m = map(int, input().split())
ar = [int(x) for x in input().split()]

pos = -1

for i in range(0, n):
    if(ar[i] == m):
        pos = i + 1
print(pos)
