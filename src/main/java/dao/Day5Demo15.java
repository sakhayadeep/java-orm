package dao;

import java.util.List;

import bean.PersonBean;

public class Day5Demo15 {

	public static void main(String[] args) {
		try {
			PersonDao ob = new PersonDao();
			List<PersonBean> li = ob.getAll();
//			li.forEach(System.out::println);
			for (int i = 0; i < li.size(); i++) {
				System.out.println(li.get(i));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
