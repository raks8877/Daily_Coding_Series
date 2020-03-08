strData = input()

size = len(strData)
cnt = {}

for i in range(0,10):
    cnt[i]= int(0)
    
for i in range(0,size):
    cnt[ int(strData[i]) ]+=1
    
    
for i in range(0,10):
    print(i,cnt[i])
