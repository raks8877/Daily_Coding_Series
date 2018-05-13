N = 10**5 + 5
adj = {}
visit = [0]*N

def dfs(s):
    q = []
    q.append(s)
    visit[s] = 1

    while(len(q) > 0):
        val = q[-1]
        q.pop()
        
        for i in adj[val]:
            if visit[i] == 0:
                visit[i] = 1
                q.append(i)


n, e = map(int, input().split())

for i in range(0,e):
    x, y = map(int, input().split())
    tmp = []
    if x in adj:
        tmp = adj[x]
    tmp.append(y)
    adj[x] = tmp;
    
    tmp = []
    if y in  adj:
        tmp = adj[y]
    tmp.append(x)
    adj[y] = tmp

start = int(input())

dfs(start)

cnt = 0
for i in range(1, n+1):
    if(visit[i] == 0):
        cnt += 1
        
print(cnt)
