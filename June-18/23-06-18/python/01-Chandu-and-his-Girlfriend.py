for _ in range(int(input())):
    n = int(input())
    ar = [int(x) for x in input().split()]
    ar.sort()
    for i in range(n-1, -1, -1):
        print(ar[i], end = ' ')
    print()
