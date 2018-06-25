for _ in range(int(input())):
    n, m = map(int, input().split())
    data1 = input().split()
    data2 = input().split()
    print(" ".join(sorted(data1+data2, key=int, reverse=True)))
