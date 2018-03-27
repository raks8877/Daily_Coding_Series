for _ in range( int(input()) ):
    n = int(input())
    ar = [int(x) for x in input().split()]
    val = []
    for i in range(0, n):
        val.append(0)
    val[0] = 1
    
    stack = []
    stack.append(0)
    for i in range(1, n):
        while stack and (ar[stack[-1]] <= ar[i]):
            q = stack.pop()
        if not stack:
            val[i] = i + 1
        else:
            val[i] = (i - stack[-1])
        
        stack.append(i) 
    
    for i in range(0, n):
        print(val[i], end=" ")
    print()
