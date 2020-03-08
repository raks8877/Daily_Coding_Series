n = int(input())
val = [int(x) for x in input().split()]
ar = [int(x) for x in input().split()]
ans = 0

for i in range(0,n):
    ans += 1
    
    while(val[0]!=ar[i]):
        val.append(val[0])
        val.pop(0)
        ans+=1
    val.pop(0)

print(ans)
        
    
    
    
