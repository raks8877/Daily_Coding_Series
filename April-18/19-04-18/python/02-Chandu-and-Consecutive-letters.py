for _ in range(int(input())):
    data = input()
    n = len(data)
    nstr = ""
    i = 0
    while(i < n):
        nstr += data[i]
        while(i < n-1 and data[i] == data[i+1]):
            i += 1
        i += 1
    print(nstr)
