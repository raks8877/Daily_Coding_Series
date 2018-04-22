
N = 1000001
check = [0]*N

def checking():
    check[0] = 1
    check[1] = 1
    for i in range(2,N):
        if(check[i] == 0):
            for j in range(2*i,N,i):
                check[j] = 1
                

def queue_and_stack (A):
    checking()
    a = []
    b = []
    
    for i in A:
        if(check[i] == 0):
            a.append(i)
        else:
            b.append(i)
    for i in a:
        print(i, end = ' ')
    print()
    
    for j in b[::-1]:
        print(j, end = ' ')
    print()

n = int(input())
A = map(int, input().split())

queue_and_stack(A)
