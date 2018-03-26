n = int(input())
ar = [int(x) for x in input().split()]
q, x = map(int,input().split())
st = []
val = 0
i = 0
ans = -1
for _ in range(0, q):
    data = input()
    if(data == "Harry"):
        val += ar[i]
        st.append(ar[i])
        i += 1
    else:
        idx = len(st) - 1
        if(idx > 0):
            val -= st[idx]
            del st[idx]
    if(val == x):
        ans = len(st)
        break
print(ans)
    
