#I tried solving similar method used in c++ and java, but its giving TLE
 
import sys
 
MOD = 1000000007
 
def fibo(n):
    F = {}
    F[0] = {}
    F[1] = {}
    F[2] = {}
    
    F[0][0] = 0
    F[0][1] = 0
    F[0][2] = 1
    
    F[1][0] = 1
    F[1][1] = 0
    F[1][2] = 1
    
    F[2][0] = 0
    F[2][1] = 1
    F[2][2] = 1
    
    if(n == 0):
        return 0
    power(F,n)
    return(F[2][2])
    
def power(F,n):
    if( n == 0 or n == 1):
        return
    M = {}
    M[0] = {}
    M[1] = {}
    M[2] = {}
    
    M[0][0] = 0
    M[0][1] = 0
    M[0][2] = 1
    
    M[1][0] = 1
    M[1][1] = 0
    M[1][2] = 1
    
    M[2][0] = 0
    M[2][1] = 1
    M[2][2] = 1
    
    
    power(F,n//2)
    multiply(F,F)
    
    if(n % 2 != 0):
        multiply(F,M)
 
def multiply(F,M):
    a = ( (F[0][0]%MOD)*(M[0][0]%MOD) + (F[0][1]%MOD)*(M[1][0]%MOD) + (F[0][2]%MOD)*(M[2][0]%MOD) ) % MOD
    d = ( (F[1][0]%MOD)*(M[0][0]%MOD) + (F[1][1]%MOD)*(M[1][0]%MOD) + (F[1][2]%MOD)*(M[2][0]%MOD) ) % MOD
    g = ( (F[2][0]%MOD)*(M[0][0]%MOD) + (F[2][1]%MOD)*(M[1][0]%MOD) + (F[2][2]%MOD)*(M[2][0]%MOD) ) % MOD
    
    b = ( (F[0][0]%MOD)*(M[0][1]%MOD) + (F[0][1]%MOD)*(M[1][1]%MOD) + (F[0][2]%MOD)*(M[2][1]%MOD) ) % MOD
    e = ( (F[1][0]%MOD)*(M[0][1]%MOD) + (F[1][1]%MOD)*(M[1][1]%MOD) + (F[1][2]%MOD)*(M[2][1]%MOD) ) % MOD
    h = ( (F[2][0]%MOD)*(M[0][1]%MOD) + (F[2][1]%MOD)*(M[1][1]%MOD) + (F[2][2]%MOD)*(M[2][1]%MOD) ) % MOD
    
    c = ( (F[0][0]%MOD)*(M[0][2]%MOD) + (F[0][1]%MOD)*(M[1][2]%MOD) + (F[0][2]%MOD)*(M[2][2]%MOD) ) % MOD
    f = ( (F[1][0]%MOD)*(M[0][2]%MOD) + (F[1][1]%MOD)*(M[1][2]%MOD) + (F[1][2]%MOD)*(M[2][2]%MOD) ) % MOD
    i = ( (F[2][0]%MOD)*(M[0][2]%MOD) + (F[2][1]%MOD)*(M[1][2]%MOD) + (F[2][2]%MOD)*(M[2][2]%MOD) ) % MOD
    
    F[0][0] = a
    F[0][1] = b
    F[0][2] = c
    
    F[1][0] = d
    F[1][1] = e
    F[1][2] = f
    
    F[2][0] = g
    F[2][1] = h
    F[2][2] = i
  
t = int(sys.stdin.readline())
for _ in range(0, t ):
    n = int(sys.stdin.readline())
    print( fibo(n+1) )
Language: Python 3
