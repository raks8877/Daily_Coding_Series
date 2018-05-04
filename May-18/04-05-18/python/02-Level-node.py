N = 10**5 + 5
adj = {}
visit = [0]*N
level = [0]*N

def bfs(s):
    q = []
    q.append(s)
    visit[s] = 1
    level[s] = 1
    
    while(len(q) > 0):
        val = q[0]
        del q[0]
        
        for i in adj[val]:
            if visit[i] == 0:
                visit[i] = 1
                level[i] = level[val] + 1
                q.append(i)
                
    



n = int(input())

for i in range(1,n):
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

bfs(1)
l = int(input())
cnt = 0
for i in range(1, n):
    if(level[i] == l):
        cnt += 1
        
print(cnt)
