n = int(input())

ar = [int(x) for x in input().split(' ')]
ar.sort()

for i in range(1,len(ar)):
    if( (ar[i]-ar[i-1]) >1):
        print("NO")
        exit()
print("YES")
