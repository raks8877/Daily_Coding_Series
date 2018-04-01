import os, sys
from month import *


strData = getDate()
monthName = getMonth() + "-" + getYear()

filename = sys.argv[1]
try:
    with open(monthName + "/" + strData + "/c++/" + filename + ".cpp", "w") as f:
        f.write("")
    f.close()
   
    
    with open(monthName + "/" + strData + "/java/" + filename + ".java", "w") as f:
        f.write("")
    f.close()
    

    with open(monthName + "/" + strData + "/python/" + filename + ".py", "w") as f:
        f.write("")
    f.close()


except Exception as e:
    print(e)

