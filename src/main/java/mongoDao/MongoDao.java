package mongoDao;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.WriteResult;

public class MongoDao {

	public void  insert(String [][] val, DB db, String file) throws Exception{
		
			
		DBCollection dbc = db.getCollection(file);
		BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
		for(int i = 0;i<val.length;i++) docBuilder.append(val[i][0],val[i][1]);
		WriteResult rs =dbc.insert(docBuilder.get());
		
	}
	
	
}
