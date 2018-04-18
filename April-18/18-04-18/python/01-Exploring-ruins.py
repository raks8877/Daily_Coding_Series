
data = list(input())

n = len(data)

for i in range(0,n):
    if(i+1 < n):
        if(data[i] == '?'):
            if(data[i+1] == 'a' or data[i-1] == 'a'):
                data[i] = 'b'
            else:
                data[i] = 'a'
    elif(i == n -1):
        if(data[i] == '?'):
            if(data[i-1] == 'a'):
                data[i] = 'b'
            else:
                data[i] = 'a'
for i in data:
   print(i,end = '')
