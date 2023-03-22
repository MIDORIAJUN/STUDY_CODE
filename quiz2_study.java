package study;

public class quiz2_study {

	public static void main(String[] args) {
		
		//1 ~ 50난수 중복없이 2차원 배열에 저장하기
		final int five = 5;                 //상수 5선언;
		// 5 x 5 배열 선언
		int randArr[][] = new int[five][five];
		
		for(int row = 0; row < five; row++) {
			int random = (int)(Math.random()*51)+1;
			for(int col = 0; col < five; col++) {
				//증복 검사
				for(int seconed = 0; seconed < (five*row)+col; seconed++) {  // 6 11 16 21
					if(randArr[seconed/five][seconed%five] == random) {
						seconed = -1;
						random = (int)(Math.random()*51)+1;
					}//if
				}//for
				randArr[row][col] = random;
			}//for 열
		}//for 행
		//출력 단계
				for(int j = 0; j < five; j++) {
					for(int i = 0; i < five; i++) {
						System.out.print(randArr[j][i]+"\t");
					}//for
					System.out.println();
				}//for
		
		
		
				
		int arr[] = new int[25];
		
		int count = 0;
		for(int a = 0; a < arr.length; a++) {    // 길이 25
			int ran = (int)(Math.random()*50)+1;
			for(int s = 0; s < a; s++) {    
				if(arr[s] == ran) {
					s = -1;
					ran = (int)(Math.random()*50)+1;
				}//if
			}//for
			arr[a] = ran;
		}//for
		
		int arr2[][] = new int[5][5];
		  for(int j = 0; j < 5; j++) {
			for(int l = 0; l < 5; l++) {
				arr2[j][l] = arr[count++];
				System.out.print(arr2[j][l]+"\t");
				}//for
			System.out.println();
			}//for
		
	}//main

}//class
