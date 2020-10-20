'''
#예외처리로 리스트안의 int값 더하기
성적 = ""
List = ["홍길동", 70, 80, 90, "수", "우"]
Sum = 0
for x in List:
    try :
        Sum += x
    except:
        pass
        
print(Sum)
'''

import threading
def A():
    for x in range(1000):
        print("A함수:%d"% x)
def B():
    for x in range(1000,50000):
        print("B함수:%d"% x)
        
t= threading.Thread(target=A)
t.start()
t1= threading.Thread(target=B)
t1.start()
