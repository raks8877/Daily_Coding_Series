st = []
for _ in range( int(input()) ):
    t = input().split()
    if(t[0]=="1"):
        if(len(st)!=0):
            print(st.pop())
        else:
            print("No Food")
    else:
        st.append(t[1])
    
