
flag = True
n, x, y = map(int, input().split())
for data in input().split():
    data = int(data)
    if(data < x or data > y):
        flag = False

if(flag):
    print("YES")
else:
    print("NO")
