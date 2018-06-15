def BS(ar, l, r, key):
    m = 0
    while(l <= r):
        m = l + (r-l)//2
        if(ar[m] == key):
            return m+1
        elif(key > ar[m]):
            l = m + 1
        else:
            r = m - 1
    return m


n = int(input())
ar = [int(x) for x in input().split()]
ar.sort()
for _ in range(int(input())):
    x = int(input())
    print(BS(ar,0,n-1,x))
