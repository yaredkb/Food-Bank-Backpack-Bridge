package backpackBridge;

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

}
