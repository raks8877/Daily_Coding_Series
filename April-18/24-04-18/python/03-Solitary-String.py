def check(string):
    n = len(string)
    maxi = -1
    diff = 0
    N = 27
    first = [-1]*N
    last = [-1]*N
    for i in range(0, n):
        val = ord(string[i]) - ord('a')
        if(first[val] == -1):
            first[val] = i
        else:
            last[val] = i
    for i in range(0, N):
        if(first[i] != -1 and last[i] != -1):
            diff = last[i] - first[i] - 1
            if(diff > maxi):
                maxi = diff
    return maxi

for _ in range(int(input())):
    x = input()
    print(check(x))
