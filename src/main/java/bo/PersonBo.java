package bo;

import java.util.List;

import bean.PersonBean;
import dao.PersonDao;
import dao.Read;

public class PersonBo {
	public void insert() throws Exception {
		PersonBean ob = new PersonBean();
		PersonDao ob1 = new PersonDao();
		
		System.out.println("Enter Id, Fname, Lname, Age, State");
		ob.setId(Read.br.readLine());
		ob.setFname(Read.br.readLine());
		ob.setLname(Read.br.readLine());
		ob.setAge(Read.br.readLine());
		ob.setState(Read.br.readLine());
		
		ob1.InsertPerson(ob);
	}
	
	public void displayAll() throws Exception{
		PersonDao ob = new PersonDao();
		List<PersonBean> li = ob.getAll();
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
	}
	
	public void displayAny() throws Exception{
		PersonDao ob = new PersonDao();
		System.out.println("Enter id:");
		List<PersonBean> li = ob.getAny(Read.br.readLine());
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
	}
	
	public void it() throws Exception {
		PersonDao ob = new PersonDao();
		System.out.println("Enter salary:");
		ob.incomeTax(Integer.parseInt(Read.br.readLine()));
	}
}
