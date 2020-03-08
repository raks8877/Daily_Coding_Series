for _ in range( int(input()) ):
    n,k=map(int,input().split())
    ar = [int(x) for x in input().split()]
    pos = n - (k%n)
    print(*ar[pos:],*ar[:pos])
