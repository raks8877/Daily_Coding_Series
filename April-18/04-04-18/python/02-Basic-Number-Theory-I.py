

def modularExponentiation(a, n, M):
    result = 1
    while(n > 0):
        if(n % 2 == 1):
            result = (result * a) % M;
        a = (a*a) % M;
        n = n // 2
    return result
    

def modInverse(a, m) :
    m0 = m
    y = 0
    x = 1
    if (m == 1) :
        return 0
    while (a > 1) :
        q = a // m
        t = m
        m = a % m
        a = t
        t = y
        y = x - q * y
        x = t
    if (x < 0) :
        x = x + m0
    return x
a, b, c, m = map(int, input().split())
ans = ( modularExponentiation(a,b,m) * modInverse(c,m) )%m
print(ans)
    
