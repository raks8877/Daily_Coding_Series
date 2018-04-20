
def BS(ar, l, r, k):
    m = 0
    pos = -1
    while(l <= r):
        m = l + (r-l)//2
        if(k > ar[m]):
            pos = m
            l = m + 1
        else:
            r = m - 1
    return pos + 1


def BSg(ar, l, r, k):
    m = 0
    pos = -1
    while(l <= r):
        m = l + (r-l)//2
        if(k >= ar[m]):
            pos = m
            l = m + 1
        else:
            r = m - 1
    return pos + 1


n , m = map(int, input().split())
ar1 = [int(x) for x in input().split()]
ar2 = [int(x) for x in input().split()]

ar1.sort()
ar2.sort()

val1 = 0
val2 = 0

for i in range(0,n):
    t1 = BS(ar2,0,m-1,ar1[i])
    t2 = m - BSg(ar2,0,m-1,ar1[i])
    val1 += (t1*t2)

for i in range(0,m):
    t1 = BS(ar1,0,n-1,ar2[i])
    t2 = n - BSg(ar1,0,n-1,ar2[i])
    val2 += (t1*t2)

if(val1 > val2):
    print("Monk",val1-val2)
elif(val1 < val2):
    print("!Monk",val2-val1)
else:
    print("Tie")
    
