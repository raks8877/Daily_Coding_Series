
def solve(data, n, cmpstr):
    cnt = 0
    for ch in cmpstr:
        if ch in data[cnt]:
            data[cnt] = data[cnt].replace(ch,'_',1)
            cnt += 1
            if(cnt == n):
                cnt = 0
        else:
            print("No")
            return
    print("Yes")
    return

for _ in range(int(input())):
    n, m = map(int, input().split())
    data = []
    for i in range(0, n):
        data.append((input()))
    
    cmpstr = input()
    
    solve(data, n, cmpstr)
