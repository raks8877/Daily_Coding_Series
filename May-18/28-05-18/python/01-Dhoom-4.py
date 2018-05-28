N = 10**5 + 5
visit = [-1]*N
 
def solve(ar, n, k, l):
    q = []
    q.append(k)
    visit[k] = 0
    
    
    while(len(q) > 0):
        val = q[0]
        del q[0]
        
        if(val == l):
            print(visit[l])
            return
        
        for i in range(0,n):
            data = (val * ar[i]) % 100000
            if(visit[data] == -1):
                visit[data] = 1 + visit[val]
                q.append(data)
            
            if(data == l):
                print(visit[l])
                return
                
    print(visit[l])
    
k, l = map(int, input().split())
n = int(input())
ar = [int(x) for x in input().split()]
solve(ar, n, k, l)
