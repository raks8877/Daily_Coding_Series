import os, errno, datetime, sys

now = datetime.datetime.now()

strData = now.strftime("%d-%m-%y")

filename = sys.argv[1]
try:
    with open(strData+"/c++/"+filename+".cpp","w") as f:
        f.write("")
    f.close()
   
    
    with open(strData+"/java/"+filename+".java","w") as f:
        f.write("")
    f.close()
    

    with open(strData+"/python/"+filename+".py","w") as f:
        f.write("")
    f.close()


except Exception as e:
    print(e)

