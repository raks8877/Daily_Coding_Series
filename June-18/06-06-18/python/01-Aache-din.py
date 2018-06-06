for _ in range( int(input()) ):
    n = int(input())
    ar = [int(x) for x in input().split()]
    
    for i in range(0,n):
        if(ar.count(ar[i])==1):
            print(ar[i])
            break
