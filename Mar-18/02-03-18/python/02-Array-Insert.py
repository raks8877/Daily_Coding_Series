n,q=map(int,input().split())
ar = {}


cnt = 0
for i in input().split(' '):
    ar[cnt] = int(i)
    cnt+=1

for i in range(0,q):
    a,b,c=map(int,input().split())
    if(a==1):
        ar[b]=c
    else:
        val = 0
        for j in range(b,c+1):
            val+=ar[j]
        print(val)
        
