n = int(input())
a = []
b = []
a = [int(x) for x in input().split(' ')]
b = [int(x) for x in input().split(' ')]


for i in range(0,n):
    print( (a[i]+b[i]),end=' ')
