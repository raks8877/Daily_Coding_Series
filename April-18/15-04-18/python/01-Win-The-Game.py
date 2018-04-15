def func(r, g):
    if(r == 0 or g == 0):
        return 1
    if(g == 1 ):
        return r/(r+g)
    t = r + g
    return (r/t)+(g/t)*((g-1)/(t-1))*func(r,g-2)

for _ in range(int(input())):
    n, m = map(int,input().split())
    print('%.6f' % func(n,m))
