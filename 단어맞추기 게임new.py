import random
#영어 단어 3개 받고 리스트에 저장
cn = 0
wordlist = []
while cn <= 2:
    eng = input(str(cn)+'번째 단어를 입력하세요>>')
    #단어 글자수 5이하시 오류 출력
    if len(eng) >= 5:
        wordlist.append(eng)
        cn +=1
    #유효범위 이외 단어 입력시 재입력
    else:
        print('5~20이하의 글자수의 단어를 입력해주세요>>')


#입력된 3개의 단어 중 한개의 단어를 선택
#선택한 단어를 블라인드로 처리
#게임시작
count = 1

#단어 입력 단계

while True:
    a = ""   # 선택 단어
    a = input('단어선택을 해주세요>>')
    #단어 선택시 리스트에 있는지 확인하기
    if a in wordlist:
        print('단어 선택 완료. 게임을 시작합니다. 선택된 단어:',a)
        #게임시작

        #선택된 단어의 글자 중 50%를 블라인드 처리 알파벳은 랜덤하게 선택
        i = 0
        wordnum = len(a) // 2                      #선택 단어 길이(크기)를 반(50%)으로 구하기
        randword = []                              #블라인드 단어
        random_index = []                          #랜덤 블라인드 인덱스 <=  계속 사용해야 되므로 중요!
        for value in range(wordnum):
           Rd = random.randint(0,len(a)-1)
           if Rd not in random_index:
              random_index.append(Rd)
        
        random_index.sort()

        #랜덤 인덱스로 블라인드 시키는 단계
        blindword = ""
        count = 0
        for value in range(len(a)):
            if a[value] == a[random_index[count]]:
                blindword = blindword + "_"
                count+=1
            else:
                blindword = blindword + a[value]
        print(blindword)

        
        #만약 블라인드  인덱스                            <= 여기서 부터 수정ㄱㄱㄱㄱ

        answer = [] #답 리스트
        for value1 in ran:            #a p p l e
            answer.append(value1)
        if '_' not in ran:
            answer,ran.clear()
            continue
        if '_' in ran :
                MyAnswer = input(str(count)+'번째 시도, 아래 단어를 구성하는 알파벳 한 개 입력하세요.')
            #맞춰도 다음 글자 진행하기 a_p_e => app_e => apple
                if MyAnswer == clear:
                    answer[value] = MyAnswer   # 여기서 문제
                    answer.append(MyAnswer)
                #답 모두 채우면 클리어하기
                # if '-' not in answer:
                #     print('CLEAR - 선택된 단어:',a,'총 시도 횟수:',count)
                #     break
                #단어 내 포함되지 않은 알파벳 입력경우 오류 출력
                elif MyAnswer != clear:
                    print('단어 내 포함되지 않은 알파벳입니다.')
        else:
            continue
                
        # if MyAnswer == clear:
        #     #맞춰도 다음 글자 진행하기 a_p_e => app_e => apple
            
        #     print('CLEAR - 선택된 단어:',a,'총 시도 횟수:',count)
        #     break
        # else :
        #     continue #아니면 계속 돌기

        count += 1
        
    else:
        print('단어가 없습니다. 다시 선택해주세요.') 
