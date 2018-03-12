for _ in range( int(input()) ):
    n = int(input())
    ar = [int(x) for x in input().split()]
    
    ans = 0
    psum = 0
    nsum = 0
    cnt = 0

    for i in range(0,n):
        if(ar[i]<=0):
            nsum+=ar[i]
    
    ar.sort()
    
    for i in range(n-1,0,-1):
        if(ar[i]>=0):
            psum+=ar[i]
            cnt+=1
        else:
            break
    
    ans = (psum*cnt)+nsum
    
    for i in range(n-1-cnt,0,-1):
        psum += ar[i]
        nsum -= ar[i]
        cnt += 1
        temp = (psum*cnt)+nsum
        ans = max(ans,temp)
        
    print(ans)
        
