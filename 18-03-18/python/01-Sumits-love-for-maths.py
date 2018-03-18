def GCD(a,b):
    if(b==0):
        return a
    else:
        return GCD(b,a%b)
def LCM(a,b):
    return (a*b)//GCD(a,b)
    
for _ in range( int(input()) ):
    
    n,a,b,c = map(int,input().split())
    total = (n//a) + (n//b) + (n//c)  
    total -= (n//LCM(a,b))
    total -= (n//LCM(a,c))
    total -= (n//LCM(b,c))
    total += (n//LCM(a,LCM(b,c)))
    print(int(total))
    
    
