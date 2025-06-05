package com.JavaOOPS;

 class Address {
	String city, state, country;
	public Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

public class InhertanceHasARelationShip {
	int id;
	String name;
	Address obj;
	public InhertanceHasARelationShip(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		obj = address;
	}
	void display() {
		System.out.println(id + " " + name);
		System.out.println(obj.city + " " + obj.state + " " + obj.country);
	}
	public static void main(String[] args) {
		Address address1 = new Address("HYDERABAD", "Telangana", "India");
		Address address2 = new Address("abc", "NewJersy", "US");

		InhertanceHasARelationShip e1 = new InhertanceHasARelationShip(111, "varun", address1);
		InhertanceHasARelationShip e2 = new InhertanceHasARelationShip(112, "arun", address2);

		e1.display();
		e2.display();
	}
}