package basic;

public class coordinates {
	String lat;
	String lan;
	
	@Override
	public String toString() {
		return "coordinates [lat=" + lat + ", lan=" + lan + "]";
	}
	
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLan() {
		return lan;
	}
	public void setLan(String lan) {
		this.lan = lan;
	}
	

}
