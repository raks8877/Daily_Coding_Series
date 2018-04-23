for _ in range(int(input())):
    n = int(input())
    b, g = map(int,input().split())
    
    if(max(b,g) - 1 > min(b,g)):
        print("Little Jhool wins!")
    else:
        print("The teacher wins!")
    
