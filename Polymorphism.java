package test;

class Animal {
	int hunger = 50;

	public void sleep() {
		System.out.println("Zzz...");
	}
	
	public void feed() {
		hunger -= 10;
		System.out.println("hunger: " + hunger);
	}
	
	public void showhunger() {
		System.out.println(hunger);
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("Woof, Woof!");
	}
	

}

class Cat extends Animal {
	public String meow() {
		return "meow?";
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Animal gg = new Dog();
		Dog gg1 = new Dog();
		Cat gg2 = new Cat();
		gg.sleep();
		gg.feed();
		gg.feed();
		
		gg1.showhunger();
		gg1.bark();
		System.out.println(gg2.meow());
		gg2.showhunger();
		gg2.feed();
		
	}
}
