package java_20200518;

public class Member {
	private String name;
	private String zipcode;
	private String addr1;
	private String addr2;
	private String ssn1;
	private int age;
	private String regdate;
	
	

	// 각각 멤버변수에 대한 setter/getter 만들기!
	// setter getter = encapsulation
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getAddr2() {
		return addr2;
	}
	//setter
	public void setSsn1(String ssn1) {
		this.ssn1 = ssn1;
	}
	public String getSsn1() {
		return ssn1;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getRegdate() {
		return regdate;
	}
}
