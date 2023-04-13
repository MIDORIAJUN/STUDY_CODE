package study;

//System.out.println(car1.equals(car2));의 결과는 false 이다.
// 그래서 이걸로 true로 바꿔주는 코드를 작성하라

// ex)
/*
  Car car1 = new Car("도요타","수프라"); 
  Car car2 = new Car("도요타","수프라");
*/
// System.out.println(car1.equals(car2)); = true

public class Car {
	String brand;
	String model;
	
	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public Car() {
		this("unknown","unknown"); //생성자 호출
	}
	
//=============================================================
	//답
	@Override
	public boolean equals (Object obj) {
		if(obj == null) return false;
		//OBJ가 Car 클래스의 인스턴스가 아니면 바로 false를 반환하자.
		//자바에는 이 목적으러 사용할 수 있는 연산자(+,-,*, /, %,...)
		//instanceof가 있다.
		//3+4 O, +(3,5) X
		if(obj instanceof Car == false) return false;
		// obj는 Car클래스의 객체라 가정한다
		// 그래야 Car 클래스의 인스턴스의 brand,model 멤버에 접근할 수 있다.
		
		//-------------------------------------------------------
		//답
		Car yourCar = (Car)obj;  //강제 변환
		if(yourCar.brand.equals(brand) && yourCar.model.equals(model)) {
			return true;
		}
		return false;
		//-------------------------------------------------------
	}
//=============================================================
	
	
	//나의 방식
	
	//오답
	public Boolean equals1 (String obj, String obj1) {

		
		if(this.brand.equals(obj) && this.model.equals(obj1) ) {
			return true;
		}
		return false;
	}
	
	
	//정답
	public Boolean equals2 (Car obj) {
		
		if(this.brand.equals(obj.brand) && this.model.equals(obj.model)) {
			return true;
		}
		return false;
	}
	
//	@Override
//	public boolean equals (Object obj) {
//		obj = new Car();
//		if(brand.equals((Car)obj.brand) && model.equals((Car)obj.model)) {
//			return true;
//		}
//		return false;
//	}
	
	public static void main(String[] args) {
		
	}

}
