import os, errno, datetime

now = datetime.datetime.now()

strData = now.strftime("%d-%m-%y")

try:
    os.makedirs(strData)
    os.makedirs(strData+"/c++")
    os.makedirs(strData+"/java")
    os.makedirs(strData+"/python")
except OSError as e:
    print(e)
