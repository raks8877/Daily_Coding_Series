t=int(input())
for i in range(0,t):
    n=int(input())
    cnt=0
    while(n>0):
        if((n&1)==1):
            cnt+=1
        n>>=1
        
    print(cnt)
