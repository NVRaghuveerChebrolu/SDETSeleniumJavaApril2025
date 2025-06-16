package com.JavaOOPS;

class ABC {
	ABC get() {
		return this;
	}
}

public class overridingByCovarientReturnType extends ABC {
	overridingByCovarientReturnType get() {
		return this;
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}

	public static void main(String args[]) {
		//new overridingByCovarientReturnType().get().message();
		overridingByCovarientReturnType obj = new overridingByCovarientReturnType();
		System.out.println(obj.get());
		obj.message();
	}
}


/*Note : As you can see in the above example, the return type of the get() method of ABC class is ABC but 
		the return type of the get() method of overridingByCovarientReturnType class is overridingByCovarientReturnType. 
		Both methods have different return type but it is method overriding. This is known as covariant return type.*/