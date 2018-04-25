import sys

inputData = []

for line in sys.stdin:
    for item in line.split():
        inputData.append(int(item))
            


N = 100001

cnt = 1
for _ in range(0, inputData[0]):
    n = inputData[cnt]
    cnt += 1
    neg = [0]*N
    pos = [0]*N
    
    for i in range(0,n):
        if(inputData[cnt] < 0):
            neg[abs(inputData[cnt])] = 1
        else:
            pos[inputData[cnt]] = 1
        cnt += 1
    
    q = inputData[cnt]
    cnt += 1
    
    for i in range(0, q):
        x = inputData[cnt]
        if(x < 0):
            if(neg[abs(x)] == 1):
                print("Yes")
            else:
                print("No")
        else:
            if(pos[x] == 1):
                print("Yes")
            else:
                print("No")
            
        cnt += 1
