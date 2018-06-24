l = int(input())

for _ in range(int(input())):
    w, h = map(int, input().split())
    if(w < l or h < l):
        print("UPLOAD ANOTHER")
    else:
        if(w == h):
            print("ACCEPTED")
        else:
            print("CROP IT")
            
