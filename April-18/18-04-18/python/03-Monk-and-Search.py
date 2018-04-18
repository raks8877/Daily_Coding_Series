def BS1(ar,l, r, k):
    m = 0
    while(l <= r ):
        m = l + (r-l)//2
        if(ar[m] < k):
            if(ar[m+1] >= k):
                return m+1
            else:
                l = m + 1
        else:
            r = m - 1
    return m
    
    
    
def BS2(ar, l, r, k):
    m = 0
    while(l <= r ):
        m = l + (r-l)//2
        if(ar[m] == k):
            if(ar[m+1] > k):
                return m+1
            else:
                l = m + 1
        elif(ar[m] > k):
            if(m-1 >=0 and ar[m-1] < k):
                return m
            else:
                r = m - 1
        else: 
            l = m + 1
    
    return m

n = int(input())
ar = [int(x) for x in input().split()]
ar.append(10**10)
ar.sort()
for _ in range(int(input())):
    a, x = map(int, input().split())
    if(a == 0):
        print(n - BS1(ar,0,n,x))
    else:
        print(n - BS2(ar,0,n,x))
    
