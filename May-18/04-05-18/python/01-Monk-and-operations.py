def findsum(ar, n, v1, v2):
    s1 = 0
    s2 = 0
    ans = n * v2
    
    for i in range(0, n):
        s1 += abs(ar[i])
        s2 += abs(ar[i] + v1)
    return max(s1, max(s2, ans))

n, m = map(int, input().split())
ar = []
for i in range(0, n):
    data = [int(x) for x in input().split()]
    ar.append(data)
    
colmaj = [[ar[j][i] for j in range(len(ar))] for i in range(len(ar[0]))]

v1, v2, v3, v4 = map(int, input().split())

row = 0
col = 0

for i in range(0, n):
    row += findsum(ar[i], m, v1, v2)

for i in range(0, m):
    col += findsum(colmaj[i], n, v3, v4)
    
print(max(row, col))
