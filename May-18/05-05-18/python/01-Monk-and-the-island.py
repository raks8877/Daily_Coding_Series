
N = 10**5 + 5
adj = {}
visit = [0]*N
level = [0]*N

def bfs(s, n):
    q = []
    q.append(s)
    visit[s] = 1
    level[s] = 0
    
    while(len(q) > 0):
        val = q[0]
        del q[0]
        if(val == n):
            return level[val]
        for i in adj[val]:
            if visit[i] == 0:
                visit[i] = 1
                level[i] = level[val] + 1
                q.append(i)
    return 0
    


for _ in range(int(input())):
    n, e = map(int, input().split())
    
    for i in range(0, n + 1):
        adj[i] = []
        visit[i] = 0
        level[i] = 0
    
    for i in range(0, e):
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

    print( bfs(1, n) )
