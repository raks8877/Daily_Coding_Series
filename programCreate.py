'''
Usage:
python programCreate.py "01-prog1"

"01-prog1"
01 indicates serial numbering method used.
it increases so next will be 02,03 etc.
it is also used by edit prog to locate the file.

prog1 indicates question name

'''

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

