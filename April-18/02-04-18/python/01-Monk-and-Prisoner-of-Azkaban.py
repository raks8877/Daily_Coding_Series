n = int(input())
ar = [int(x) for x in input().split()]
stack = []
front = []
back = []

for i in range(0, n):
    front.append(0)
    back.append(0)
    
for i in range(0, n):
    while stack and (ar[stack[-1]] <= ar[i]):
        q = stack.pop()
    if not stack:
        front[i] = -1
    else:
        front[i] = stack[-1] + 1
    stack.append(i) 

while(stack):
    q = stack.pop()

for i in range(n-1, -1 , -1):
    while stack and (ar[stack[-1]] <= ar[i]):
        q = stack.pop()
    if not stack:
        back[i] = -1
    else:
        back[i] = stack[-1] + 1
    stack.append(i) 

for i in range(0, n):
    print(front[i] + back[i] , end =' ')
print()
