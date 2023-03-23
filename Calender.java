package study;

public class Calender {

	public static void main(String[] args) {
		int arr[][][] = new int[12][5][7];
		
		for(int k = 0; k < arr.length; k++) { //12
			int num = 1;
			System.out.println("\t\t\t" + (k + 1) + "월");
			for(int i = 0; i < arr[k].length; i++) {//5
				for(int j = 0; j < arr[k][i].length; j++) { //7
					arr[k][i][j] = num++; //배열의 갯수만큼 num(일)증가
					
					if(k + 1 < 8) {// 1월 ~ 7월까지
						if((k + 1) % 2 == 1){//홀수날은 31까지
							if(num > 32) continue;
						}
						else if((k + 1) % 2 == 0)  //나머지 짝수 경우
							if(num > 31) continue;
						else if((k + 1) == 2) //2월은 28일까지
							if(num > 29) continue;
					}//1월에서 7월까지 //if
					else { //8월에서 12월까지
						if((k + 1) % 2 == 0) {//짝수날은 31일까지
							if(num > 32) continue;
						}
						else if(num > 31) continue;//나머지 홀수낳은 30일
					}//else
					System.out.print(arr[k][i][j] + "\t"); //간격 조절
				}//for3
				System.out.println();
			}//for2
			System.out.println();
			num = 1;
		}//for1
		
		
	}

}
