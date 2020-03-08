ar = []
for _ in range( int(input()) ):
    data = input()
    x = int(data.split()[0])
    if(x == 1):
        if(len(ar) == 0):
           print("No Food")
        else:
            print(ar[len(ar)-1])
            del ar[len(ar)-1]
    else:
        y = int(data.split()[1])
        ar.append(y)
