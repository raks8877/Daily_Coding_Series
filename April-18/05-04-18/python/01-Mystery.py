import math

prime = []
N = 100000000
N = int(math.sqrt(N)) + 1

check = [0]*(N+10)
for i in range(2,N+1):
    if(check[i] == 0):
        prime.append(i)
        for j in range(2*i,N+1,i):
            check[j] = 1

def factor(n):
    ans = 1
    tmp = n
    for i in prime:
        cnt = 0
        while( tmp % i == 0):
            cnt += 1
            tmp = tmp // i
        if(i > n or tmp ==0):
            break
        ans = ans * (cnt + 1)
    if(tmp > 2):
        ans *= 2
    return ans

for _ in range(int(input())):
    data = input()
    if " " in data:
        for n in map(int, data.split()):
            print(factor(n))
        break
    print(factor(int(data)))
