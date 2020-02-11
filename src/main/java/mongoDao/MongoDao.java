package mongoDao;

import java.util.List;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;

public class MongoDao {

	public void  insert(String [][] val, DB db, String file) throws Exception{
		
			
		DBCollection dbc = db.getCollection(file);
		BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
		
		for(int i = 0;i<val.length;i++) 
			docBuilder.append(val[i][0],val[i][1]);
		
		WriteResult rs =dbc.insert(docBuilder.get());
		
	}
	
	public List<DBObject> read(DB db, String file) throws Exception{
		
		
		String []val;
		DBCollection dbc = db.getCollection(file);
		DBObject query = BasicDBObjectBuilder.start().get();
		DBCursor cursor = dbc.find(query);
		return cursor.toArray();
		
		// below is to print or convert		
		//while(cursor.hasNext()){
			//System.out.println(cursor.next());

			//val[i++] = cursor.next().toString();
		//}
				
		
	}	
	
	
}
