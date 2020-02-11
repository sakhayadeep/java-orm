package hibernateDao;

import java.util.List;

public class Day12Demo1 {

	public static void main(String[] args) {
		HDao ob = new HDao();
		try {
			
			
			ob.startSesion();
			
//			PersonBean pb = new PersonBean(122, "ali", "maula", 27, "Mumbai");
//			ob.insertPerson(pb);
//			System.out.println("Record inserted!");
			
			List<PersonBean> li = ob.read();
			for(PersonBean x : li) {
				System.out.println(x);
			}
			
			System.out.println("----------------------");
			
			li.add(ob.findByID(122));
			System.out.println(li.get(li.size()-1));
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			ob.closeSession();
		}
	}

}
