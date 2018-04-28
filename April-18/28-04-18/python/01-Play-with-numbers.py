n, q = map(int, input().split())
ar = [int(x) for x in input().split()]

ans = [0]*(n+1)

for i in range(1,n+1):
    ans[i] = ans[i-1] + ar[i-1]

for i in range(0,q):
    a,b = map(int, input().split())
    divi = b-a+1
    val = (ans[b]-ans[a-1])//divi
    print(val)
