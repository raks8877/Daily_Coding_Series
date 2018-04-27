n = int(input())
ar = [int(x) for x in input().split()]

st = []
ans = 0
st.append(ar[0])

for i in range(1, n):
    
    while(len(st) != 0 and ar[i] > st[-1]):
        st.pop()
        ans += 1
    if(len(st) != 0):
        ans += 1
    st.append(ar[i])
print(ans)
