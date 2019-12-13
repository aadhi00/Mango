package org.company;

public class Company {
	private void companyName(int id) {
		System.out.println("The Company id is "+id);
	}
	private void companyName(String name) {
		System.out.println("The Company name is "+name);
	}
	private void companyName(long networth) {
		System.out.println("The networth is $"+networth);
	}
	public static void main(String[] args) {
		Company c=new Company();
		c.companyName(456789);
		c.companyName("CTS pvt ltd");
		c.companyName(230000000l);
	}
}
