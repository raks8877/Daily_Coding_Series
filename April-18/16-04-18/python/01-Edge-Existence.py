n, m = map(int, input().split())
n += 5
m += 5
adj = [[0]*n for i in range(m)]

for i in range(0,m-5):
    a, b = map(int,input().split())
    adj[a][b] = 1

for _ in range(int(input())):
    a, b = map(int,input().split())
    if(adj[a][b] == 1):
        print("YES")
    else:
        print("NO")
