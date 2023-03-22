#라인수 입력

line = int(input('라인수 입력하기:'))

#문자열 입력하기
indexlist = []
for index in range(line):
    indexlist.append(input(str(index+1)+'번째 문자입력:'))
print(indexlist)

#찾는 문자 입력하기
user = input('찾는 문자 입력하기:')

#검사시작
for value in range(line):
    #각 라인의 문자열 검사단계
    #인덱스로 비교하여 인덱스(문자)가 같으면 다음 문자 검사하는 식으로 비교 \ 입력문자와 검색문자 인덱스가 다 같으면 끝.
    listcount = 0     #user의 인덱스기능 만들기
    count = 1      #검색된 횟수   
    for value1 in range(len(indexlist[value])):
        #매칭시작
        if listcount == 0 and indexlist[value][value1] == user[listcount]: #user의 인덱스기능 만들기
            listcount += 1  #listcount == 0 => 다시 처음의 문자를 찾기위해 초기화함
        #매칭계속
        elif indexlist[value][value1] == user[listcount]:  #h e l l o
            #매칭종료
            if listcount == (len(user)-1):  #user길이랑 일치시 성공
                count += 1        #검색된 횟수
                print('찾았습니다:',user,'검색된 라인수:',value+1,'검색된 횟수:',count)
                
            else:                          #user_index증가 \ user의 문자열 순(인덱스)으로 찾기
                listcount += 1             #user의 문자열를 순서대로 한 글자식 비교해감
        #문자열이 일치하지 않을 경우 상태값 리셋
        else:
            listcount = 0