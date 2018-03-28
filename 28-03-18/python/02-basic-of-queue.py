que = []
for _ in range( int(input()) ):
    data = input().split()
    
    if(data[0] == 'E'):
        x = int(data[1])
        que.append(x)
        print(len(que))
    else:
        if(len(que)>0):
            print(que[0],end = ' ')
            del que[0]
        else:
            print("-1",end = ' ')
        print(len(que))
    
