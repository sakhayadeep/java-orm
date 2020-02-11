package mongoDao;

import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBObject;

public class Day11Demo1 {
	 public static void main(String[] args) {
		try {
			DB db = MongoDbConnect.getDatabase();
			MongoDao ob1 = new MongoDao();
			
			ob1.insert(new String[][] {{"_id","420"}, {"fname", "gourav"},{"lname", "jain"}, {"Age","72"}}, db , "employee");
			System.out.println("Record is inserted.");
			
			List<DBObject> li = ob1.read(db, "employee");
			
			for (int i = 0; i < li.size(); i++) {
				System.out.println(li.get(i));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
