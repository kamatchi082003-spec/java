package basic;

public class Address {
	String Address;
	String City;
	String State;
	String pincode;
	String country;
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	
	}
	@Override
	public String toString() {
		return "Address [Address=" + Address + ", City=" + City + ", State=" + State + ", pincode=" + pincode
				+ ", country=" + country + "]";
	}

}
