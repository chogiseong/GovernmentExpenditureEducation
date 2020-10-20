"""
replace 활용
a = "안 녕 하 세요"
a = a.replace(" ", "")
print (a)
"""
"""
여러가지 내장함수 사용

a = " 안 녕 하 세 요 "
print(a.strip())
print(a.replace(" ", ""))
print(a.split("하"))

b = "//사과/배/수박/오렌지//"
print(b.split("/"))
print("/의 개수는"+str(b.count("/"))+"개 입니다.")
"""
'''
리스트는 대괄호로 시작해서 끝남.
리스트는 데이터 집함
리스트와 배열은 다르다
'''
'''
여러가지 리스트 예제

a = ("우에엥")
ListData = [a,1,2,3,"안녕하세요", [1,2,3]]
print(ListData)

a=[]
b=[1,2,3]
c=['life', 'is', 'too', 'short']
d=[c, b]
e=[1,2,['life','is']]
print('a=', a)
print('b=',b)
print('c=',c)
print('d=',d)
print('e=',e)
print('c의3번째',c[2])
print('e의 리스트속 리스트',e[2][1])

f=['수학',30,'영어',40,'은','는']
f_1= f[0] + str(f[1])
f_2= f[2] + str(f[3])
print(f[0],f[4],f[1])
print(f[2],f[5],f[3])
print(f_1)
print(f_2)
print("%s 은 %s" % (f[0], f[1]))
print("{0} 은 {1}".format(f[0],f[1]))
'''
'''
형변환 및 리스트연산 예제

a=['조기성','90','92','94']
a_1=(int(a[1])+int(a[2])+int(a[3]))
print(a[0],'은',a[1],a[2],a[3])
print('평균은' , int(a_1)/3)
'''
'''
a=['조기성',['수학',90],['국어',82],['사회',94],['영어',60],['지리',50]]
b=['권용준',['수학',90],['국어',52],['사회',94],['영어',60],['지리',50]]
c=['김병찬',['수학',90],['국어',62],['사회',94],['영어',60],['지리',50]]
d=['송현수',['수학',90],['국어',72],['사회',94],['영어',60],['지리',50]]
e=['김종희',['수학',90],['국어',22],['사회',94],['영어',60],['지리',50]]
avg_a=(a[1][1]+a[2][1]+a[3][1]+a[4][1]+a[5][1])/5
avg_b=(b[1][1]+b[2][1]+b[3][1]+b[4][1]+b[5][1])/5
avg_c=(c[1][1]+c[2][1]+c[3][1]+c[4][1]+c[5][1])/5
avg_d=(d[1][1]+d[2][1]+d[3][1]+d[4][1]+d[5][1])/5
avg_e=(e[1][1]+e[2][1]+e[3][1]+e[4][1]+e[5][1])/5
print(a[0],'의 점수는',a,'따라서 평균은',avg_a)
print(b[0],'의 점수는',b,'따라서 평균은',avg_b)
print(c[0],'의 점수는',c,'따라서 평균은',avg_c)
print(d[0],'의 점수는',d,'따라서 평균은',avg_d)
print(e[0],'의 점수는',e,'따라서 평균은',avg_e)
'''
'''
창의적인 리스트 활용 예제

조기성 = 0
권용준 = 1
송현수 = 2
수학성적 = [70, 20, 30]
국어성적 = [20, 30, 40]
영어성적 = [30, 40, 50]

조기성총점 = 수학성적[조기성] + 국어성적[조기성] + 영어성적[조기성]
권용준총점 = 수학성적[권용준] + 국어성적[권용준] + 영어성적[권용준]
송현수총점 = 수학성적[송현수] + 국어성적[송현수] + 영어성적[송현수]
조기성평균 = 조기성총점/3
권용준평균 = 권용준총점/3
송현수평균 = 송현수총점/3
print(조기성평균, 권용준평균, 송현수평균)

'''
'''
데이터 삽임
a=[1,2,3,4,5]
a.insert(len(a)+1,9)
print(a)
'''
'''
extend와 append

a=[1,2,3,4,5,6]
a.append([20])
print(a)
a.extend([20])
print(a)
'''
'''
extend와 append의 차이

a= input("이름을입력하시오")
b=[]
c=[]
b.extend(a)
print(b)
c.append(a)
print(c)
'''
'''
배운거 복습 창의적인 코딩하기

a=[1,2,3,4,5,6]
a.pop(2)
a.insert(2,'세번째')
print(a)
b=[1,3,5,4,2]
b.sort()
b.reverse()
print(b)
'''
'''
순위 매기기(실패작)

a_1=[]
b_2=[]
c_3=[]
d_4=[]
rank=[]
a=input('이름:')
b=input('수학:')
c=input('국어:')
d=input('영어:')
e=input('이름:')
f=input('수학:')
g=input('국어:')
h=input('영어:')
a_1.append(a)
b_2.append(b)
c_3.append(c)
d_4.append(d)
a_1.append(e)
b_2.append(f)
c_3.append(g)
d_4.append(h)
avg1=(int(b_2[0])+int(c_3[0])+int(d_4[0]))/3
avg2=(int(b_2[1])+int(c_3[1])+int(d_4[1]))/3
rank=[avg1,avg2]
rank.sort()
rank.reverse()
rank.insert(0,"1등")
rank.insert(2,"2등")
print('이름', a_1[0])
print('수학', b_2[0])
print('국어', c_3[0])
print('영어', d_4[0])
print('평균', avg1)
print('이름', a_1[1])
print('수학', b_2[1])
print('국어', c_3[1])
print('영어', d_4[1])
print('평균', avg2)
print('1등은', rank)

'''
'''
딕셔너리
test={"수학":60, "국어":70, "사회":80}
print(test["수학"])
'''
'''
score = 60
message = "success" if score >=60 else "fail"
print(message)
'''
'''
count = 0
List = []
while count < 5 :
    List.append(input("입력"))
    count = count + 1
print(List)
'''
'''
List=[1,2,3,4,5]
count=0
Sum=0
while count < len(List) :
    Sum = Sum + List[count]
    count = count +1
print(Sum)

for x in range(0, len(List)):
    Sum = Sum + List[x]
    count = count+1
print(Sum)
'''
name = []
kor = []
eng = []
mat = []
avg = []
rank = []

count_1 = 0

while count_1 < 3 :
    name.append(input("이름"))
    kor.append(input("국"))
    eng.append(input("영"))
    mat.append(input("수"))
    print("이름",name[count_1],"국어", kor[count_1],"영어", eng[count_1],"수학", mat[count_1])
    avg.append((int(kor[count_1])+int(eng[count_1])+int(mat[count_1]))/3)
    print("평균",avg)
    count_1 = count_1 + 1
if int(avg[0]) > int(avg[1]) :
    avg.insert(avg[0],avg[1])
elif int(avg[1]) > int(avg[2]) :
    avg.insert(avg[1],avg[2])
elif int(avg[2]) > int(avg[0]) :
    avg.insert(avg[2],avg[0])
else :
    print(avg)

    






