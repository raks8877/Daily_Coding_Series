def modularExponentiation(a, n, M):
    result = 1
    while(n > 0):
        if(n % 2 == 1):
            result = (result * a) % M;
        a = (a*a) % M;
        n = n // 2
    return result
    
a , b = map(int,input().split())
print(modularExponentiation(a,b,1000000007))
