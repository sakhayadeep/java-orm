package mongoDao;

import com.mongodb.DB;

public class Day11Demo1 {
	 public static void main(String[] args) {
		try {
			DB db = MongoDbConnect.getDatabase();
			MongoDao ob1 = new MongoDao();
			
			ob1.insert(new String[][] {{"_id","444"}, {"fname", "gourav"},{"lname", "jain"}, {"Age","420"}}, db , "employee");
			System.out.println("Record is inserted.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
