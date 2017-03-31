package backpackBridge;

<<<<<<< HEAD
@Entity
public class Volunteer {
	private String id;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String ageRange;
	private String streetAddress;
	private String city;
	private int zip;
	private int homePhoneNumber;
	private int workPhoneNumber;
	private String Email;
	
	private String getId() {
		return id;
	}
	private String getFirstName() {
		return firstName;
	}
	private String getLastName() {
		return lastName;
	}
	private String getDateOfBirth() {
		return dateOfBirth;
	}
	private String getAgeRange() {
		return ageRange;
	}
	private String getStreetAddress() {
		return streetAddress;
	}
	private String getCity() {
		return city;
	}
	private int getZip() {
		return zip;
	}
	private int getHomePhoneNumber() {
		return homePhoneNumber;
	}
	private int getWorkPhoneNumber() {
		return workPhoneNumber;
	}
	private String getEmail() {
		return Email;
	}
	protected Volunteer(){
		
	}
	public Volunteer (String id,firstName,lastName){
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public Volunteer(String id,String firstName,String LastName,String dateOfBirth,String ageRange,String streetAddress,String city,int zip,int homePhoneNumber,workPhoneNumber,String email)

=======
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Volunteer {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String streetAddress;
	private String city;
	private String state;
	private String zip;
	private String phoneNum;
	private String email;
	
	
	@ManyToOne
	private FoodSite foodSite;
	
	
	protected Volunteer(){
	}
   	

	public void setId(long id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
   
>>>>>>> master
}
