N = 10**6 + 2
dp = [0]*N
cnt = 0




n, q = map(int,input().split())
str1 = list(input())
str2 = list(input())
for i in range(0, n):
    if(str1[i] != str2[i]):
        dp[i] = 1
        cnt += 1

flag = False
for i in range(0,q):
    x = int(input())
    x -= 1
    
    if(dp[x]):
        cnt -= 1
    else:
        if(str1[i] == '0'):
            flag = True
    
    if(cnt == 0 and flag == False):
        print("YES")
    else:
        print("NO")
