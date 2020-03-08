s = input()

cnt = 0
ans = 0
for i in range(0,len(s)):
    if(s[i]=='a' or
       s[i]=='e' or
       s[i]=='i' or
       s[i]=='o' or
       s[i]=='u' ):
           cnt+=1
    else:
        ans=max(ans,cnt)
        cnt=0
ans=max(ans,cnt)
print(ans)
