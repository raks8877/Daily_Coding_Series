MOD = int(1e9)+7
N = 2
K = 2
F = [[1]*(N+1) for i in range(K+1)]
M = [[1]*(N+1) for i in range(K+1)]
F[0][0] = 1
F[0][1] = 1
F[1][0] = 1
F[1][1] = 0

M[0][0] = 1
M[0][1] = 1
M[1][0] = 1
M[1][1] = 0

def fibo(n):
    
    if(n == 1 or n == 0):
        return 1
    power(n)
    return F[0][0]

def power(n):
    if( n == 1 or n == 0):
        return
    power(n//2)
    multiply(F,F)
    if(n % 2 != 0):
        multiply(F,M)

def multiply(F,M):
    a = ( (F[0][0] * M[0][0]) + (F[0][1] * M[1][0]) ) % MOD
    b = ( (F[0][0] * M[0][1]) + (F[0][1] * M[1][1]) ) % MOD
   
    c = ( (F[1][0] * M[0][0]) + (F[1][1] * M[1][0]) ) % MOD
    d = ( (F[1][0] * M[0][1]) + (F[1][1] * M[1][1]) ) % MOD
    
    F[0][0] = a
    F[0][1] = b
    F[1][0] = c
    F[1][1] = d

n = int(input())
print(fibo(n-1))
