package mongoDao;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoDbConnect {
	public  static DB getDatabase() throws Exception
	{
			MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
			DB db = mongo.getDB("trainingdb");
			return db;
		    
	}

	public static boolean createCollection(DB db, String col) throws Exception {
		
			 db.createCollection(col,null);
			 return true;
			
	}
}
