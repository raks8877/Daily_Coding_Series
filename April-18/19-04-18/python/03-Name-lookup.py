n = int(input())
mp = {}
for i in range(0,n):
    data = input()
    a = int(data.split()[0])
    mp[a] = data.split()[1]

for _ in range(int(input())):
    x = int(input())
    print(mp[x])
