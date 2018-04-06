for _ in range( int(input()) ):
    n = int(input())
    ar1 = [0]*(n+1)
    ar2 = [0]*(n+1)
    cost1 = [0]*(n+1)
    cost2 = [0]*(n+1)
    
    L1 = list(map(int,input().split()))
    L2 = list(map(int,input().split()))
    
    if(n != 1):
        C1 = list(map(int,input().split()))
        C2 = list(map(int,input().split()))
    
    for i in range(1, n+1):
        ar1[i] = L1[i-1]
        ar2[i] = L2[i-1]
        if(i >= 2):
            cost1[i] = C1[i-2]
            cost2[i] = C2[i-2]
            
        
       
    dp1 = [0]*(n+1)
    dp2 = [0]*(n+1)
    
    dp1[1] = ar1[1]
    dp2[1] = ar2[1]
    
    for i in range(2, n+1):
        dp1[i] = min( dp1[i-1] + ar1[i], dp2[i-1] + ar1[i] +cost2[i] )
        dp2[i] = min( dp2[i-1] + ar2[i], dp1[i-1] + ar2[i] +cost1[i] )
        
    print( min(dp1[n], dp2[n]) )
        
