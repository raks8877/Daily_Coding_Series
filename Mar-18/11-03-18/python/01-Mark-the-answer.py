n, x = map(int,input().split())
ar = [int(x) for x in input().split()]
cnt = 0
skip = True

for i in range(0,n):
    if(ar[i]<=x):
        cnt+=1
    elif(skip):
        skip=False
    else:
        break
print(cnt)
    
