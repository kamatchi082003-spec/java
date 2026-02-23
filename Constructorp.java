package basic;

public class Constructorp {
	int speed;int distance;int time;
	
	//parameterized constructor
	void speed(int distance,int time) {
		speed=distance/time;
		System.out.println(speed);
	}
	
	//non-parameterized constructor
	void distance() {
		distance=speed*time;
		System.out.println(distance);
	}
	
	//method overloading -> same method name with different arguments(parameters)
	void speed(int speed) {
		System.out.println(speed);
	}
	
	//main function
	public static void main(String[]argd) {
		Constructorp s=new Constructorp();
		s.speed(35,7);
		s.speed=7;
		s.time=7;
		s.distance();
		s.speed(7);
	}
}
