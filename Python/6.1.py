'''
name = input('이름')
age = (int)(input('나이'))
print(name)
print(age)
print('만 나이'+ str(age-1))
'''
'''
print("어서오세요 %s 환영합니다" % "안녕하세요")
'''
'''
print("어서오세요 {0} {1}".format("환영합니다", 1234))
'''
'''
string
1. 문자열더하기(형변환해줘야함)
2. "%s" % "문자열"
3. "{0}" format("안녕")
4. f"{name}"
'''
name = input("이름")
age = input("나이")
name.join("이구나")
print(f"이름 : {name} 나이 : {age}")
print(name.strip())
print(name.split())
print(name.join)

