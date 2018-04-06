def sumFactor(n):
    ans = 0
    for i in range(1,n):
        if(n % i == 0):
            ans += i
    return ans
for _ in range(int(input())):
    n = int(input())
    print(sumFactor(n))
