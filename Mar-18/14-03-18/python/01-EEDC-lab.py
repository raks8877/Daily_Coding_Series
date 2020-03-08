n = int(input())
ar = [int(x) for x in input().split()]

totalSum = sum(ar)

lastDigit = 0
ans = {}
ans[0]=0
for i in range(0,n):
    currSum = totalSum-ar[i]
    if(i!=n-1):
        lastDigit = ar[i-1]+ar[n-1]
    else:
        lastDigit = ar[i-1]
    if(currSum%3==0 and lastDigit%10==0):
        ans[i+1]=ans[i]+1
    else:
        ans[i+1]=ans[i]
    
for _ in range(int(input())):
    l, r = map(int,input().split())
    print(ans[r]-ans[l-1])
    
