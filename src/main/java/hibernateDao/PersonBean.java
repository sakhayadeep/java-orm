package hibernateDao;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity(name = "person")
public class PersonBean {
	@Id
	int id;
	@Column
	String fname;
	@Column
	String lname;
	@Column
	int age;
	@Column
	String state;
	
	public PersonBean() {
	}
	public PersonBean(int id, String fname, String lname, int age, String state) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "PersonBean [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", state=" + state
				+ "]";
	}
	
	
}
