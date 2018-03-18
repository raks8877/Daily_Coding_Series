n = 3

val = [int(x) for x in input().split()]

sum1 = 0
sum2 = 0
for i in range(0,n*n):
    if(i%2==0):
        sum1 += val[i]
    else:
        sum2 +=val[i]
print(sum1)
print(sum2)
        
