#Getting TLE in last test case, will update a solu for this later


import sys

MOD = 1000000007

def fibo(n):
    F = {}
    F[0] = {}
    F[1] = {}
    F[0][0] = 1
    F[0][1] = 1
    F[1][0] = 1
    F[1][1] = 0
    if(n == 0):
        return 0
    power(F,n)
    return(F[0][0])
    
def power(F,n):
    if( n == 0 or n == 1):
        return
    M = {}
    M[0] = {}
    M[1] = {}
    M[0][0] = 1
    M[0][1] = 1
    M[1][0] = 1
    M[1][1] = 0
    
    power(F,n//2)
    multiply(F,F)
    
    if(n % 2 != 0):
        multiply(F,M)

def multiply(F,M):
  x = ( ( (F[0][0]%MOD)*(M[0][0]%MOD) ) + ( (F[0][1]%MOD)*(M[1][0]%MOD) ) ) %MOD;
  y = ( ( (F[0][0]%MOD)*(M[0][1]%MOD) ) + ( (F[0][1]%MOD)*(M[1][1]%MOD) ) ) %MOD ;
  z = ( ( (F[1][0]%MOD)*(M[0][0]%MOD) ) + ( (F[1][1]%MOD)*(M[1][0]%MOD) ) ) %MOD;
  w = ( ( (F[1][0]%MOD)*(M[0][1]%MOD) ) + ( (F[1][1]%MOD)*(M[1][1]%MOD) ) ) %MOD ;
  F[0][0] = x
  F[0][1] = y
  F[1][0] = z
  F[1][1] = w
  
t = int(sys.stdin.readline())
for _ in range(0, t ):
    n = int(sys.stdin.readline())
    print( fibo(n+1) )
