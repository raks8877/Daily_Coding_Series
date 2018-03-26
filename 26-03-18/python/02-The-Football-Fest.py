for _ in range( int(input()) ):
    n, idd = map(int, input().split())
    st = []
    st.append(idd)
    last = 0
    for __ in range(0, n):
        ch = input()
        if(ch.split()[0] == 'P'):
            idd = int(ch.split()[1])
            st.append(idd)
            last = 0
        else:
            i = len(st) - 1
            if(i > 0):
                if(last == 0):
                    last = st[i];
                    del st[i]
                else:
                    tmp = last
                    last = st[i]
                    del st[i]
                    st.append(tmp)
    print("Player",st[len(st) - 1])
