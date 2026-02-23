package basic;
import java.util.*;
public class Methodcreation {
	//void type
	//public static void ObjectCreation(int id,String name,String email,int age){
	//	Constructor C=new Constructor(id,name,email,age);
		//System.out.println(C);
	//}
	 
	//return type
	public static Constructor ObjectCreation(int id,String name,String email,int age) {
		Constructor C=new Constructor(id,name,email,age);
		//System.out.println(C);
		return C;
	}
	
	public static List<Constructor> Fbyage(int age,List<Constructor> C){
		List<Constructor> result=new ArrayList<>();
		for(Constructor A:C) {
			if(A.getAge()<=age) {
				result.add(A);
				}
			}
		return result;
	}
	public static void main(String[]args) {
		Constructor r1=ObjectCreation(1,"subha","subha@gmail.com",18);
		Constructor r2=ObjectCreation(2,"sudha","sudha@gmail.com",26);
		Constructor r3=ObjectCreation(3,"selvi","selvi@gmail.com",28);
		
		List<Constructor> input=new ArrayList<>();
		input.add(r1);
		input.add(r2);
		input.add(r3);
		
		if(r1.id==1) {
			System.out.println("object creation successfully");
		}
		 List<Constructor> Fresult=Fbyage(27,input);
		 System.out.println(Fresult);
	}

}
