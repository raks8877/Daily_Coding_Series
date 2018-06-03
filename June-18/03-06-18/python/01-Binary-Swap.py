str1 = input()
str2 = input()
n = len(str1)
cnt = 0

for i in range(0, n):
    if(str1[i] != str2[i]):
        cnt += 1
if(cnt % 2 != 0):
    print("-1")
else:
    print(cnt//2)
