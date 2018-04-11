prime = []
def seive():
    check = [0]*1000;
    for i in range(2, 1000):
        if(check[i] == 0):
            prime.append(i)
            for j in range(2*i,1000,i):
                check[j] = 1
seive()
n = int(input())
for val in prime:
    if(val > n):
        break
    print(val, end = ' ')
