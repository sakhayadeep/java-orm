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
		PreparedStatement ps = co.prepareStatement("select * from person");

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
	
	public List<PersonBean> getAny(String id) throws Exception{
		Connection co = DbConnect.get();
		PreparedStatement ps = co.prepareStatement("select * from person where id = ?");
		
		ps.setInt(1, Integer.parseInt(id));

		ResultSet rs = ps.executeQuery();
		if(!rs.next()) {
			throw new Exception("ID not found!");
		}
		List<PersonBean> li = new ArrayList<PersonBean>();
		do {
			PersonBean ob = new PersonBean();
			ob.setId(rs.getString(1));
			ob.setFname(rs.getString(2));
			ob.setLname(rs.getString(3));
			ob.setAge(rs.getString(4));
			ob.setState(rs.getString(5));
			
			li.add(ob);
		}while(rs.next());
		return li;
	}
	
	public void InsertPerson(PersonBean ob) throws Exception{
		Connection co = DbConnect.get();
		PreparedStatement ps = co.prepareStatement("insert into person values(?,?,?,?,?)");
		
		ps.setInt(1, Integer.parseInt(ob.getId()));
		ps.setString(2, ob.getFname());
		ps.setString(3, ob.getLname());
		ps.setInt(4, Integer.parseInt(ob.getAge()));
		ps.setString(5, ob.getState());
		
		ps.executeUpdate();
	}
	
}
