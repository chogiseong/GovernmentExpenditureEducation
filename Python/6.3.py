'''
무한루프를 사용하는 방법
    1. 변수를 통해서 무한루프
'''
'''
자판기
    돈 입력
    5000원을 넣었을때 구매할 수 있는 제품 활성화
    커피 100 음료수 500 과자 1000 아이스크림 600
    돈 부족 시 돈을 더 넣어라
    뽑을 시 계속 뽑으시겠습니까 or 끝내기
    결과 출력
    커피 5개 거스름돈 얼마
    개수
    관리자 페이지
    
'''
'''
money = 0
question = 0
pro = 0
promenu = 0
proplus = 0
baguni = []
menu = {'커피':100, '음료수':500, '과자':1000, '아이스크림':600}

while True:
    money = int(money) + int(input('자판기입니다. 돈을 넣어주세요.'))
    input('자판기입니다. 돈을 넣어주세요.')
    print('총', money, '원 받았습니다')
    if money < menu['커피'] :
        print('살 수 있는게 없습니다. 돈을 더주세요.')
        continue
    elif money >= 100 and money < 500 :
        print('커피만 구매하실 수 있습니다.')
        question = input('구매하시겠습니까? y/n')
        if question == 'y' :
            money = money - 100
            baguni.insert(0, '커피')
            print ('장바구니에 담았습니다. 장바구니에', baguni,'가 있습니다.')
            print ('계속 주문하시겠습니까? y/n')
            if question == 'y' :
                continue
            else :
                print ('구매하신 물품',baguni,'와 거스름돈',money, '드리겠습니다. 감사합니다.')
                break
        else :
            print ('잔돈', money, '원 거슬러드렸습니다')
            break
        
    elif money >= 100 and money < 600 :
        print('커피, 음료수만 구매하실 수 있습니다.')
        question = input('어떤 물품을 구매하시겠습니까?')
        if question == '커피' :
            money = money - 100
            baguni.insert(0, '커피')
            print ('장바구니에 담았습니다. 장바구니에', baguni,'가 있습니다.')
            question = input('계속 주문하시겠습니까? y/n')
            if question == 'y' :
                continue
            else :
                print ('구매하신 물품',baguni,'와 거스름돈',money, '드리겠습니다. 감사합니다.')
                break
        elif question == '음료수' :
            money = money - 500
            baguni.insert(0, '음료수')
            print ('장바구니에 담았습니다. 장바구니에', baguni,'가 있습니다.')
            question = input('계속 주문하시겠습니까? y/n')
            if question == 'y' :
                continue
            else:
                print ('구매하신 물품',baguni,'와 거스름돈',money, '드리겠습니다. 감사합니다.')
                break
        else :
            print ('잔돈', money, '원 거슬러드렸습니다')
            break

    elif money >= 100 and money < 1000 :
        print('커피, 음료수, 아이스크림만 구매하실 수 있습니다.')
        question = input('어떤 물품을 구매하시겠습니까?')
        if question == '커피' :
            money = money - 100
            baguni.insert(0, '커피')
            print ('장바구니에 담았습니다. 장바구니에', baguni,'가 있습니다.')
            question = input('계속 주문하시겠습니까? y/n')
            if question == 'y' :
                continue
            else :
                print ('구매하신 물품',baguni,'와 거스름돈',money, '드리겠습니다. 감사합니다.')
                break
        elif question == '음료수' :
            money = money - 500
            baguni.insert(0, '음료수')
            print ('장바구니에 담았습니다. 장바구니에', baguni,'가 있습니다.')
            question = input('계속 주문하시겠습니까? y/n')
            if question == 'y' :
                continue
            else:
                print ('구매하신 물품',baguni,'와 거스름돈',money, '드리겠습니다. 감사합니다.')
                break
        elif question == '아이스크림' :
            money = money - 600
            baguni.insert(0, '아이스크림')
            print ('장바구니에 담았습니다. 장바구니에', baguni,'가 있습니다.')
            question = input('계속 주문하시겠습니까? y/n')
            if question == 'y' :
                continue
            else:
                print ('구매하신 물품',baguni,'와 거스름돈',money, '드리겠습니다. 감사합니다.')
                break
        else :
            print ('잔돈', money, '원 거슬러드렸습니다')
            break

    elif money >= 100 and money >= 1000 :
        print('커피, 음료수, 아이스크림, 과자 전부 구매하실 수 있습니다.')
        question = input('어떤 물품을 구매하시겠습니까?')
        if question == '커피' :
            money = money - 100
            baguni.insert(0, '커피')
            print ('장바구니에 담았습니다. 장바구니에', baguni,'가 있습니다.')
            question = input('계속 주문하시겠습니까? y/n')
            if question == 'y' :
                continue
            else :
                print ('구매하신 물품',baguni,'와 거스름돈',money, '드리겠습니다. 감사합니다.')
                break
        elif question == '음료수' :
            money = money - 500
            baguni.insert(0, '음료수')
            print ('장바구니에 담았습니다. 장바구니에', baguni,'가 있습니다.')
            question = input('계속 주문하시겠습니까? y/n')
            if question == 'y' :
                continue
            else:
                print ('구매하신 물품',baguni,'와 거스름돈',money, '드리겠습니다. 감사합니다.')
                break
        elif question == '아이스크림' :
            money = money - 600
            baguni.insert(0, '아이스크림')
            print ('장바구니에 담았습니다. 장바구니에', baguni,'가 있습니다.')
            question = input('계속 주문하시겠습니까? y/n')
            if question == 'y' :
                continue
            else:
                print ('잔돈', money, '원 거슬러드렸습니다')
                break
        elif question == '과자' :
            money = money - 1000
            baguni.insert(0, '과자')
            print ('장바구니에 담았습니다. 장바구니에', baguni,'가 있습니다.')
            question = input('계속 주문하시겠습니까? y/n')
            if question == 'y' :
                continue
            else:
                print ('구매하신 물품',baguni,'와 거스름돈',money, '드리겠습니다. 감사합니다.')
                break
        else :
            print ('잔돈', money, '원 거슬러드렸습니다.')
            break
    
    break
'''
'''
while True:
    pro = input('관리자 모드를 원하신다면 p 를 눌러주세요')
    if pro == 'p' :
        int(input('메뉴를 추가하시려면 1, 삭제하시려면 2, 수량을 추가하시려면 3을 입력해주세요.'))
        if promenu == 1 :
            break
        elif promenu == 2 :
            break
        elif promenu == 3 :
            break
        else :
            print('초기메뉴로 돌아갑니다.')
            break
    else :
        break
'''
'''
예제1
sum1=0
for x in range(1,1000):
    if x%3==0 :
        sum1 = sum1+x
        print(sum1)
'''

'''
예제2
a=[20,55,67,82,45,33,90,87,100,25]
b=0
c=[]
d=[]
while True:
    if a[b] >= 50 :
        c.append(a[b])
        b = b + 1
        print(c)
    elif a[b] < 50 :
        d.append(a[b])
        b = b +1
        print(d)
    else :
        break
    
'''
'''
예제3
for x in range(1,5):
    print("*"*x)
'''
'''
피보나치 수열 중 짝수 합 예제 성공

n = int(input('숫자입력'))
a = [0, 1]
b = 0
c = []
d = []
for x in range(0,n):
    a.append(a[b] + a[b+1])
    print(a)
    b = b+1
for b in range(0,n):
        if int(a[b])%2 == 0 :
            d.append(a[b])
            b = b + 1
            print(d)
        else:
            continue
'''

'''
name = []
math = []
kor = []
so = []


count=0
condition=True

while(condition):
    temp = input("이름 : ")
    if temp=="stop":
        condition = False
        break
    name.append(temp)
    count+=1

    

for i in range(0,count):
    math = int(input("수학 : "))
    kor= int(input("국어 : "))
    so = int(input("사회 : "))
    SUM = math+kor+so
    #name[i].append([name[i], SUM, SUM/3])
    name[i] = [name[i], SUM, SUM/3]

print(name)

    
for i in range(0,count):
    MAX = 0
    for j in range(i,count):
        if(name[j][2] > MAX):
            MAX = name[j][2]
            index = j
    temp = name[i]
    name[i] = name[index]
    name[index] = temp
    name[i][2]=i+1
    

print(name)
'''
'''
List=[1,5,7,3,9]
check=1

print(List)
while(check):
    check=0
    for j in range(0,len(List)-1):
        if(List[j] > List[j+1]):
            temp = List[j]
            List[j] = List[j+1]
            List[j+1] = temp
            print(List)
            check=1
        

print(List)
'''  

'''     
isOK = True
while isOK :
    count = input("입력 : ")
    if count == "종료":
        isOK = Falsey
        while True:
                if True :
                    if True:
                        if True:
                            break
                            break

print("끝")
'''

'''
sum=0
for i in range(1,1001):
    if i%3==0:
        sum+=i
print(sum)

count=1
while(count<5):
    print("*"*count)
    count+=1
'''

'''

num = int(input("숫자 : "))

list_num = []

list_num.append(0)
list_num.append(1)

i=0

test=0
while(True):
    test = list_num[i] + list_num[i+1]

    if test>=num:
        break

    list_num.append(test)
    i+=1


sum=0
for i in range (0,len(list_num)):
    if list_num[i]%2==0:
        sum+=list_num[i]
print(list_num)
print(sum)

'''


'''
수학 = [1,2,3,4,5]
과학 = [11,22,33,4,5,5]
사회 = [1,2,3,4,5,5]

def A(과목):
    합계 =0
    for i in 과목:
        합계 += i
    print(합계)

A(수학)
A(과학)
A(사회) 
'''




'''
def add(a,b):
    return [a+b, a-b, a/b, a%b]

Sum = add(b=3,a=4)
'''


'''
def add(a, b=4):
    return [a+b, a-b, a/b, a%b]

Sum = add(3)


print(Sum)

'''

'''
a=1
b=2

def add(*args):
    print(args)

add(1,2,3,4)
add(1,2,3,4,6,7,7,8)
'''

'''
Sum=0
def add_many(*args):
    global Sum    
    for i in args:
        Sum += i
    return Sum

print(add_many(1,2))
Sum=0
print(add_many(1,2,3))
Sum=0
print(add_many(1,2,3,4,5,6,7,8,9,10))
'''

'''
a = 1
def test(a) :
    a += 1
    return a

a = test(a)
print(a)
'''

'''
a = 1
def test():
    global a
    a +=1

test()
print(a)
'''

'''
add = lambda a, b: a+b
result = add(3,4)
name_rank.sort(key = lambda x:x[1], reverse=True)
'''

f = open("C:/test1/newfile.txt",'a')
f.write("안녕하세요 파일입출력입니다.")
f.close()

f = open("C:/test1/newfile.txt",'a')
f.write("추가 쌉가능??")
f.close()

f = open("C:/test1/newfile.txt",'r')
memo = f.read()
f.close()



print(memo)




