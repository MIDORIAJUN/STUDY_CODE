package study;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		Class classvar = car.getClass();
		System.out.println(classvar.getName()); //패키지명.클래스명
		
		System.out.println("브랜드" + car.brand + "," + "모델" + car.model);
		
		Car car1 = new Car("도요타","수프라"); 
		Car car2 = new Car("도요타","수프라");
		Car car3 = null;
		//주소값이 달라서 false
		System.out.println(car1.equals(car2)); //false
		
		
		//===============================================
		
		//답
		//오버라이딩
		System.out.println("답" + "\t" + car1.equals(car2)); //true
		
		//===============================================
		//나의 방식 (오답)
		System.out.println(car1.equals1("도요타","수프라")); //true
		
		//나의 방식 (정답)
		System.out.println("나의 방식" + "\t" + car1.equals2(car2)); //true
		
		
		
		//===============================================
		System.out.println(car1.equals(car3)); //종료됨
		System.out.println("program off");
		
		
	}

}
