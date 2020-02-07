package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.PersonBean;

public class PersonDao {
	public List<PersonBean> getAll() throws Exception{
		Connection co = DbConnect.get();
//		System.out.println(co);
//		System.out.println("ok");
		PreparedStatement ps = co.prepareStatement("select * from person");
//		System.out.println(co);
//		System.out.println("ok");
		ResultSet rs = ps.executeQuery();
		List<PersonBean> li = new ArrayList<PersonBean>();
		while(rs.next()) {
			PersonBean ob = new PersonBean();
			ob.setId(rs.getString(1));
			ob.setFname(rs.getString(2));
			ob.setLname(rs.getString(3));
			ob.setAge(rs.getString(4));
			ob.setState(rs.getString(5));
			
			li.add(ob);
		}
		return li;
	}
}
