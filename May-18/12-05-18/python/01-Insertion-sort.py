n = int(input())
ar = [int(x) for x in input().split()]
pos = []

for i in range(0, n):
    pos.append(ar[i])

ar.sort()

for i in range(0, n):
    for j in range(0, n):
        if(pos[i] == ar[j]):
            print(j+1, end = ' ')
        
