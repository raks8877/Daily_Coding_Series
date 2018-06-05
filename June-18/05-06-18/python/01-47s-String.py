for _ in range(int(input())):
    data = input()
    n = len(data)
    cnt = 0
    ans = 0
    for i in range(0, n):
        if(data[i] == '$' or data[i] == '&'):
            ans = ans + (n-i) + ((n-i)*cnt)
            cnt = 0
        else:
            cnt += 1
    print(ans)
