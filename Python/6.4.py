'''
a=[7,2,5,3,1]
b=0
c=0
space = 0

for b in range(0, len(a)) :
    for c in range(0,len(a)) :
        if a[c] < a[c+1] :
            space = a[c]
            a[c] = a[c+1]
            a[c+1] = space
            c = c + 1
            continue
        continue
print(a)
'''
#버블정렬
#1. 안바뀌면 정렬된 것 - 변수
#check
#2. 앞과 뒤를 비교한다.
#if L[x] < L[x+1]
#3. 바꾸는 구문
#바꿀 때 변수가 필요하다.
'''
버블정렬 미완성
완성해보기

a=[7,4,1,6,3]
check = False
temp = 0
x=0

def switchData(a, index):
    temp = 0
    temp = a[index]
    a[index] = a[index+1]
    a[index+1] = temp


for x in range(0,3):
    if a[x] < a[x+1]:
        switchData(a,x)
        check = True

while check :
    for x in range(0,3):
        if a[x]<a[x+1]:
            switchData(a,x)
            check = True

print(a)
'''
'''
클래스 예제

class A:
    a=1
    b=2
    def pr():
        print("a클래스입니다")
'''
'''
class a:
    value = 1
    #print("1")이런거안댐
    def printval():
        print("1")
        value += 1
'''
'''
클래스 예제1

class a:
    val = 3
    def valueTest(self):
        self.val = 4
    def valueTest1(self):
        print(self.val)

mA=a()
mA.valueTest()
mA.valueTest1()
print(mA.val)
mB=a()
print(mB.val)
'''
'''
class A:
    mClassVal=6
    def _init_(self):
        self.val=5


mA = A()
print(mA.val)
'''
'''
실패 클래스 예제
class 디자인:
    def test(self, name, address, age, score, rank)
    test.self = self
    test.name = name
    test.address = address
    test.age = age
    test.score = score
    test.rank = rank
    print(name, address, age, score, rank)
'''
'''
#클래스활용방법 중요!!
class a:
    name = ""
    addr = ''
    age = 0
    grade1=0
    grade2=0
    sum_grade=0
    rank=-1

    def Sum(self):
        self.sum_grade = self.grade1 + self.grade2

S1 = a()
S1.grade1 = 50
S1.grade2 = 60
S1.Sum()
print("%d" % S1.sum_grade)

S2 = a()
S2.grade1 = 90
S2.grade2 = 60
S2.Sum()
print("%d" % S2.sum_grade)
'''
'''
#모듈화 = 최소한의 기능을 넣자
#오버로딩 오버라이딩

class Rectangle:
    #초기자(이니셜라이저)
    def __init__(self,width=0,height=0):
        #self 인스턴스변수
        self.width =width
        self.height = height
    #메서드
    def calcArea(self):
        area = self.width*self.height
        return area

a = Rectangle(5,5)
print(a.calcArea())
'''
'''
class Ract:
    count = 0
    def printT(self):
        Ract.count = 5
        self.w = 4
        

mA = Ract()
mA.printT()
print(mA.count)

mB = Ract()
print(mB.count)
'''
'''
상속 예제

class Ract:
    count = 0
    w = 1
    h = 3

class A(Ract):
    p=50

class B(A):
    pass

mA=A()
print(mA.w)
mB=B()
print(mB.count)
'''
'''
미완성 상속 예제

class Ract:
    count = 0
    w = 1
    h = 3
    def mv(self):
        print("Ractfunc")

class A(Ract):
    count = 50
    def mV(self):
        print("afunc")
        
class B(A):
    pass

mA=A()
mA.mV()
print("00000000")
mRact = Ract()
mRact.mV()
'''
