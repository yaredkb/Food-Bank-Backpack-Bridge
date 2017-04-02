package backpackBridge;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class StudentReferral {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    private String firstName;
	private String lastName;
	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public int getGrade() {
		return grade;
	}

	public String getTeacherName() {
		return teacherName;
	}
	private int age;
	private int grade;
	private String teacherName;
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
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
}