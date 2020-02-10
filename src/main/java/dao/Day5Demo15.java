package dao;

import bo.PersonBo;

public class Day5Demo15 {

	public static void main(String[] args) {
		try {
			
			int ch = 0;
			PersonBo bo = new PersonBo();
			do {
				System.out.println("0 exit, 1 insert, 2 display all, 3 display any, 4 tax :");
				
				ch = Integer.parseInt(Read.br.readLine());
				
				switch (ch) {
				case 0:System.out.println("Thanks for using the program!");
					
					break;
				case 1:  bo.insert();
					
					break;
					
				case 2: bo.displayAll();
					break;
				case 3: bo.displayAny();
					break;
				case 4: bo.it();
				break;
				default: System.out.println("Invalid option!");
				}
			
			}while(ch != 0);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
