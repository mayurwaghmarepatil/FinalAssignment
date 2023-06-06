package ineuron;
/*Demonstrate the difference between abstract class and interface by writing programs
as well as in keypoints.*/
	// Abstract Class
	abstract class Animal {
	    public abstract void sound();

	    public void sleep() {
	        System.out.println("Zzzzz...");
	    }
	}

	// Interface
	interface Jumpable {
	    void jump();
	}

	// Class implementing Abstract Class and Interface
	class Dog extends Animal implements Jumpable {
	    public void sound() {
	        System.out.println("Woof!");
	    }

	    public void jump() {
	        System.out.println("Jumping high!");
	    }
	}

	public class FinalAssignmentP5 {
	    public static void main(String[] args) {
	        Dog dog = new Dog();
	        dog.sound();
	        dog.jump();
	        dog.sleep();
	    }
	}

/*

Key points about abstract classes and interfaces:

1) Abstract Classes:

An abstract class is a class that cannot be instantiated, meaning you cannot create objects directly from it.
Abstract classes can have both abstract and non-abstract methods.
Abstract methods are declared without a body and must be implemented by the concrete subclasses.
Abstract classes can have member variables and constructors.
Abstract classes can provide default implementations for some methods.
Concrete subclasses extend the abstract class and provide implementations for the abstract methods.
A class can only extend one abstract class.



2) Interfaces:

An interface is a collection of abstract methods that define a contract for implementing classes.
Interfaces cannot have member variables or constructors.
All methods in an interface are implicitly abstract and public. They do not have a body.
A class implements an interface by providing implementations for all the methods defined in the interface.
A class can implement multiple interfaces.
Interfaces can be used to achieve multiple inheritance of types, as a class can implement multiple interfaces but can extend only one class.
Interfaces can also define constant fields, which are implicitly public, static, and final.

  */