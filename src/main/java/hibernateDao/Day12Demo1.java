package hibernateDao;

public class Day12Demo1 {

	public static void main(String[] args) {
		
		try {
			HDao ob = new HDao();
			PersonBean pb = new PersonBean(122, "ali", "maula", 27, "Mumbai");
			ob.insertPerson(pb);
			System.out.println("Record inserted!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
