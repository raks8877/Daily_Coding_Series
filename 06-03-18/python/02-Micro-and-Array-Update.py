t = int(input())

while(t>0):
    n,k = map(int,input().split())
    ar = [int(x) for x in input().split()]
    print(max(0,k-min(ar)))
    t-=1
