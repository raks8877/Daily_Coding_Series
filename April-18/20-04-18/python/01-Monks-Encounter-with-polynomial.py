a = 0
b = 0
c = 0
def func(x):
    global a,b,c
    return (a*x*x) + (b*x) + c
    
def BS(k):
    l = 0
    r = 1
    m = 0
    pos = 0
    while(True):
        val = func(r)
        if(val >= k):
            break
        else:
            r = r << 1
    
    while(l <= r):
        m = l + (r-l)//2
        val = func(m)
        if(val < k):
            l = m + 1
        else:
            r = m - 1
        if(val >= k):
            pos = m
    return pos
    
for _ in range(int(input())):
    global a,b,c
    a, b, c, k = map(int,input().split())
    print(BS(k))
            
