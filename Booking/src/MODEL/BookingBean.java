package MODEL;

import java.sql.Date;
import java.time.LocalDate;

public class BookingBean {

	private int bookingId;
	private String custname;
	private String custId;
	private java.util.Date dob;
	private int age;
	private String address;
	private int mobId;
	private int quantity;
	
 
	public BookingBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingBean(String custname, String custId, java.util.Date dob, int age, String address,int mobId, int quantity, int bookingId) {
		super();
		this.bookingId = bookingId;
		this.custname = custname;
		this.custId = custId;
		this.dob = dob;
		this.age = age;
		this.address=address;
		this.mobId = mobId;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "BookingBean [bookingId=" + bookingId + ", custname=" + custname + ", custId=" + custId + ", dob=" + dob
				+ ", age=" + age + ", address=" + address + ", mobId=" + mobId + ", quantity=" + quantity + "]";
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public java.util.Date getDob() {
		return dob;
	}
	public void setDob(java.util.Date dob2) {
		this.dob = dob2;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobId() {
		return mobId;
	}
	public void setMobId(int mobId) {
		this.mobId = mobId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}