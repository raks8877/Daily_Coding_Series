
def solu(data, n):
    cnt1 = 0
    cnt2 = 0
    v1 = 0
    v2 = 0
    for i in data:
        v1 = ord(i) - ord('a')
        v2 = ord(i) - ord('A')
        if(v1 >= 0 and v1 <= 25):
            cnt1 += 1
        
        if(v2 >= 0 and v2 <= 25):
            cnt2 += 1
        
    if( (cnt1 == 0 and cnt2 == 0) or (n < 1 or n > 100) ):
        print("Invalid Input")
    else:
        print(min(cnt1, cnt2))


data = input()
t = 0
try:
    t = int(data)
except:
    t = -1

if(t < 1 or t > 10):
    print("Invalid Test")
else:
    for _ in range(0, t):
        data = input()
        n = len(data)
        solu(data, n)
