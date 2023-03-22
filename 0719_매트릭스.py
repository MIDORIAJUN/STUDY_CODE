#랜덤 함수를 이용하여 1 ~ 50 사이 정수 중 중복되지 않은 값 25개를 선택하여 LIST에
#저장하고 아래와 같이 최대, 최소, 중간 값을 찾아 출력하는 프로그램을 작성하라.

# 1~50 사이의 중복되지 않은 정수형 난수 25개를 선택하여 LIST에 저장
import random
mylist = []                  #중복없는 값 리스트

num=0
while len(mylist) < 25:
    num=random.randint(1,50) #50난수 생성,저장
    if num not in mylist:
        mylist.append(num)

# 5 x 5 정렬 단계
for value in range(5):
    print(mylist[0+5*value:5+5*value]) # 5x5 정렬 \ [0:5] > [5:10] > ...
    print()
#================= 5 x 5 정렬 내 방식 코드==============
# count = 0
# for value in range(5): #가로
#     #세로
#     for value1 in range(5):
#         print(mylist[count],'\t',end='')
#         count+=1
#     print()
#========================================================
#다른 방법(아래)
# mylist = [] #50까지 리스트
# kss = []    #중복 리스트
# tss = []    #중복 아닌 리스트
# count = 0
# for value in range(25):
#     mylist = random.randint(1,50)
#     if mylist not in tss :
#         tss.append(mylist)
# print(tss)

#최대값,중간,최소값 출력하기
print('열')
#최소값
print('최소값:')

for value1 in range(5):     #세로
    mx = []                 #최소값 리스트               
    for value2 in range(5): #가로
        mx.append(mylist[5*value1+value2])  #value1(세로시작점)
    mx.sort()               #순서대로 정렬 기능
    print(mx[0],'\t',end='')#촤소값 출력
print()

#최대값
print('최대값:',end='')
for value1 in range(5):     #세로
    mn = []                 #최대값 리스트 # *1바퀴 돌때마다 리스트 초기화됨(이유: 보면 리스트 비어있으니깐)
    for value2 in range(5): #가로
        mn.append(mylist[5*value1+value2])  #*5칸이기 때문에 5로 곱해줌*
    mn.sort()               #순서대로 정렬 기능
    print(mn[-1],'\t',end='')
print()

#중간값
print('중간값:',end='')
for value1 in range(5):
    mm = []                 #중간값 리스트
    for value2 in range(5):
        mm.append(mylist[5*value2+value1])
    mm.sort()               #순서대로 정렬 기능
    print(mn[2],'\t',end='')
print()

#행출력
print('행')
print('최소값  최대값  중간값')
for value1 in range(5):
    ast = []
    for value2 in range(5):
        ast.append(mylist[value2+value1*5])
    ast.sort()
    print(ast[0],'\t',ast[-1],'\t',ast[2])

mylist.sort()
print('최소값:',mylist[0])
print('최대값:',mylist[-1])
print('중간값:',mylist[12])

#내 방식 \ 전체값
# min = 50
# max = 0
# for all in range(len(mylist)):
#     #최소값
#     if mylist[all] < min :
#         min = mylist[all]
#     #최대값:
#     if mylist[all] > max :
#         max = mylist[all]
#     #중간값 :
#     if mylist[all] == mylist[12]:
#         mid = mylist[12]
# print('최소값:',min,'\n','최대값:',max,'\n','중간값:',mid)

