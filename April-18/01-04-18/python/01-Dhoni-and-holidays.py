n = int(input())
ar = [int(x) for x in input().split()]

cnt = 0 
car = False
acad = False

for i in range(0, n):
    if(ar[i] == 0):
        cnt += 1
        car = acad = False
    elif(ar[i] == 1):
        if(not acad):
            car = False
            acad = True
        else:
            cnt += 1
            car = acad = False
    elif(ar[i] == 2):
        if(not car):
            car = True
            acad = False
        else:
            cnt += 1
            car = acad = False
    else:
        if(not car and not acad):
            car = acad = False
        elif(car and not acad):
            car = False
            acad = True
        elif(not car and acad):
            car = True
            acad = False
print(cnt)
            
    
