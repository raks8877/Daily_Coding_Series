import os, sys
from month import *


strData = getDate()
monthName = getMonth() + "-" + getYear()

language = sys.argv[1]
progNum = sys.argv[2]
filename = ""

fileList = None

if(language == "c++"):
    fileList = os.listdir(monthName + "/" + strData + "/c++/")

elif(language == "java"):
    fileList = os.listdir(monthName + "/" + strData + "/java/")

elif(language == "python"):
    fileList = os.listdir(monthName + "/" + strData + "/python/")


for item in fileList:
    num = item.split('-')[0]
    if(num == progNum):
        filename = item
        break

if(filename == ""):
    print("File not found")
    exit(0)


if(language == "c++"):
    os.system("vim "+  monthName + "/" + strData + "/c++/" + filename)

if(language == "java"):
    os.system("vim "+  monthName + "/" + strData + "/java/" + filename)

if(language == "python"):
    os.system("vim "+  monthName + "/" + strData + "/python/" + filename)

