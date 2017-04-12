package oop.encapsulation;

public class Jony {

	public static void main(String[] args) {
		Teacher T1 = new Teacher();
		T1.setName("jony");
		T1.setDOB("02-27-1989");
		T1.setSSN("123-111-111");
		T1.setAddress("106-27-156th street,jamaica, ny-11433");
		System.out.println(T1.getName()+"  "+T1.getDOB()+"  "+T1.getSSN()+"  "+T1.getAddress());
		Teacher T2 = new Teacher("02-27-1989","123-111-111","106-27-156th street jamaica ny 11433","jony");
		System.out.println(T2.getName()+"  "+T2.getDOB()+"  "+T2.getSSN()+"  "+T2.getAddress());

	}

}
