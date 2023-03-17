package study;

import java.util.Arrays;

public class TODAY_LOTTO_NUMBER {

	public static void main(String[] args) {
		
		int ball[] = new int[45];
		
		//각 1-45를 저장
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}//for
		//랜덤
		int temp = 0;
		int j = 0;
		for(int i = 0; i < 6; i++) {
			j = (int)(Math.random() * 45);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}//for
		
		//sort(순번정렬)
		for(int i = 0; i < 6; i++) {
			for(int k = 0; k < 6 - i; k++) {
				if(ball[i] > ball[k + i + 1]) {
					int front = ball[i];
					ball[i] = ball[k + i + 1];
					ball[k + i + 1] = front;
				}//if
			}//for
		}//for
		//출력
		System.out.print("오늘의 번호는? ");
		for(int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " "); 
		}//for
//		System.out.println();
//		System.out.println(Arrays.toString(ball));

	}

}
