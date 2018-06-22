for _ in range(int(input())):
    data1 = input()
    data2 = input()
    n1 = len(data1)
    n2 = len(data2)
    ar1 = [0]*27
    ar2 = [0]*27
    
    for i in data1:
        v = ord(i) - ord('a')
        ar1[v] += 1
    
    for i in data2:
        v = ord(i) - ord('a')
        ar2[v] += 1
    val = 0
    for i in range(0, 26):
        val += 2*min(ar1[i], ar2[i])
    ans = n1 + n2 - val
    print(ans)
