for _ in range( int(input()) ):
    n = int(input())
    ru = [int(x) for x in input().split()]
    an = [int(x) for x in input().split()]
    ru.sort()
    an.sort()
    ru_val = 0
    an_val = 0
    
    maxi = 0
    for i in range(0,n):
        cnt = ru.count(ru[i])
        if cnt >= maxi:
            maxi = cnt
            ru_val = ru[i]
    maxi = 0
    for i in range(0,n):
        cnt = an.count(an[i])
        if cnt >= maxi:
            maxi = cnt
            an_val = an[i]
    if(ru_val>an_val):
        print("Rupam")
    elif(ru_val<an_val):
        print("Ankit")
    else:
        print("Tie")
    
