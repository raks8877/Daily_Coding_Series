
for _ in range(int(input())):
    n = int(input())
    ar = [int(x) for x in input().split()]
    sum1 = 0
    sum2 = 0
    i = 0
    j = n - 1
    while(i <= j):
        if(sum1 <= (2*sum2)):
            while((sum1 <= 2*sum2) and i<=j):
                sum1+=ar[i];
                i+=1;
            
        
        elif(sum1>sum2):
            while((sum1>2*sum2) and j>=i):
                sum2+=ar[j];
                j-=1;
            
        
    a = i
    b = n - j - 1
    print(a,b)
    if(a > b):
        print("Motu")
    elif(a < b):
        print("Patlu")
    else:
        print("Tie")
    
