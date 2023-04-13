package study;

import java.util.ArrayList;

//my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때,
//수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
//조건
//return type 은 정수형입니다.
//연산자는 +, -만 존재합니다.
//my_string	result
//"3 + 4"	  7
//3 + 4 = 7을 return 합니다.
class Solution1 {
    public int solution(String my_string) {
        int answer = 0;
        int abc = my_string.length();             //문자열 길이 저장
        ArrayList<String> plus_mynus = new ArrayList<>();   //더하기 빼기 부호만 저장하는 배열리스트
        ArrayList<Integer> arr = new ArrayList<>();         //숫자만 담는 배열
        
        int count = 0;                                //정수 배열 인덱스
        for(int i = 0; i < my_string.length(); i++) {
        	String str = my_string.substring(i,i+1);  //먼저 문자 하나씩 분리하는 단계

        	for(int j = 0; j <= 10; j++) {
        		if(str.equals("+") || str.equals("-")) { //더하기 또는 빼기인지 골라서 변수에 저장하는 단계
        			plus_mynus.add(str);
        			break;
        		}//if
        		if(str.equals(String.valueOf(j))) {
        			arr.add(j);
        			count++;                          //인덱스를 증감 시켜준다
        			break;
        		}//if
        	}//for
        }//for
         
        int calculate = 0;       //계산 카운터
        for(int i = 0; i < arr.size(); i++) {    //  arr.length <= 버그: 배열에 더할 정수 뿐만아니라 기본값 0도 포함됨   
        	if(i == 0) { //최초는 그냥 삽입
        		answer += arr.get(i); //answer = answer + arr[i]
        		continue;
        	}
        	if(plus_mynus.get(calculate).equals("+")) {
        	    answer += arr.get(i); //answer = answer + arr[i]
        	    calculate++;
        	}else if(plus_mynus.get(calculate).equals("-")) {
        		answer -= arr.get(i); //answer = answer - arr[i]
        		calculate++;
        	}//else if
        }//for
        
        System.out.println(answer);
        return answer;
    }
}
//
public class study_copy {

	public static void main(String[] args) {
		Solution1 ss = new Solution1();
		ss.solution("3 - 9 + 3 - 5 + 1");
	}

}
