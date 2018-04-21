n = int(input())
cat = [int(x) for x in input().split()]
cal = [int(x) for x in input().split()]

cat.sort()
cal.sort()

ans = 0

for i in range(n-1,-1,-1):
    ans += (cat[i]*cal[i])
    
print(ans)
