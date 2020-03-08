data = input()
n = len(data)
pali = [[0 for i in range(n)] for j in range(n)] 
 
 
for i in range(0, n):
    pali[i][i] = 1
    if (i-1 >= 0):
        pali[i][i-1] = 1
 
cnt = 0
 
for k in range(2, n+1):
    for i in range(0, n-k+1):
        j = i + k - 1
        diff = j - i + 1
        
        if (data[i] == data[j]):
            if (diff % 2 != 0):
                if (pali[i+1][j-1]):
                    pali[i][j] = 1
                    cnt = cnt + 1
            else:
                if (pali[i+1][j-1] and (pali[i][j-1] or pali[i+1][j])):
                    pali[i][j] = 1
                    cnt = cnt + 1
 
# for i in range(0, n):
#     for j in range(0, n):
#         print(pali[i][j], end = " ")
#     print()
 
print(n + cnt)
