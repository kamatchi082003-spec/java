package basic;

public class DummyObjectCreation {
	public static void main(String[]args) {
		coordinates co=new coordinates();
		co.setLan("20.5937° N");
		co.setLat("78.9629° E");
		
		Address adrs=new Address();
		adrs.setAddress("11/2,mgr street");
		adrs.setCity("madurai");
		adrs.setPincode("625002");
		adrs.setState("TamilNadu");
		adrs.setCountry("India");
		System.out.println(adrs);
		System.out.println(co);
		
	}

}
