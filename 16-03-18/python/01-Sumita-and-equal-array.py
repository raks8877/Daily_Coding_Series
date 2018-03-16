for _ in range( int(input()) ):
    n, x, y, z = map(int,input().split())
    ar = [int(x) for x in input().split()]
    
    for i in range(0,n):
        while(ar[i]%x==0):
            ar[i] /= x
        while(ar[i]%y==0):
            ar[i] /= y
        while(ar[i]%z==0):
            ar[i] /= z
    
    flag = False
    
    for i in range(1,n):
        if(ar[i]!=ar[0]):
            flag = True
            break
    if(flag):
        print("She can't")
    else:
        print("She can")

        
