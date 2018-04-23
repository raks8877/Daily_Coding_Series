import sys

for _ in range(int(input())):
    n, k, p = map(int, input().split())
    ar = []
    ar.append(0)
    for i in input().split():
        i = int(i)
        ar.append(i)
    ar.append(sys.maxsize)
    
    if(p > (n-k)):
        print("-1")
    else:
        ar.sort()
        for i in range(1,k+2):
            c = ar[i] - ar[i-1] -1
            if(p - c <= 0):
                print(ar[i-1] + p)
                break
            else:
                p -= c
    
            
    
