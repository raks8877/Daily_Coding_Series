import sys

for _ in range(int(input())):
    n = int(input())
    mini = sys.maxsize
    cnt = 0
    for i in input().split():
        i = int(i)
        if(i<mini):
            mini = i
            cnt = 1
        elif(i==mini):
            cnt += 1
    if(cnt%2==0):
        print("Unlucky")
    else:
        print("Lucky")
