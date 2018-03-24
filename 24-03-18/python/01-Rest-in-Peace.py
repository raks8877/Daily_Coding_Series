n = int(input())
val = [int(x) for x in input().split()]
ar = {}
ar[0] = val[0]
ar[-1] = 0
for i in range(1, n):
    ar[i] = ar[i-1] + val[i]

def BinarySearch(s,l,k):
    while(s <= l):
        m = (l + s) // 2
        if(ar[m] >= k):
            
            if(ar[m-1] < k):
                return m + 1
            else:
                l = m - 1
        else:
            s = m + 1
    return -1

for _ in range( int(input()) ):
    num = int(input())
    print(BinarySearch(0, n-1, num))
