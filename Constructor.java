package basic;

public class Constructor {
	int id;
	String name;
	String email;
	int age;
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	
	
		@Override
	public String toString() {
		return "Constructor [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}
		
	
		public Constructor(int id, String name, String email, int age) {
			this.id = id;
			this.name = name;
			this.email = email;
			this.age = age;
		
		}
		void user(int id, String name, String email, int age){
			this.id = id;
			this.name = name;
			this.email = email;
			this.age = age;
		}
		
//		public static void main(String[]args) {
//			Constructor C=new Constructor(1,"subha","subha@2003",22);
//			System.out.println(C);
//			C.user(2,"selvi","selvi@gmail.com",20);
//			System.out.println(C);
//			
//		}


		

	
	

}
