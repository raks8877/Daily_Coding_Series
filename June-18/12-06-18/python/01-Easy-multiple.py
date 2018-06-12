for _ in range(int(input())):
    n = int(input())
    n -= 1
    x = n // 3
    y = n // 5
    z = n // 15
    
    s1 = 3 * (x * (x+1)) // 2
    s2 = 5 * (y * (y+1)) // 2
    s3 = 15 * (z * (z+1)) // 2
    ans = s1 + s2 - s3
    print(ans)
