// Abstract classes 
public class JavaLearning{
	public static void main (String[] args){
		abstract class Animal {
			//abstract methods
			abstract void move();
			abstract void eat();
			
			// concrete method 
			void label(){
				System.out.println("Animal's data:");
			}
		}
	
		class Bird extends Animal {
	
		void move() {
				System.out.println("Moves by flying.");
			}
			void eat() {
				System.out.println("Eats birdfood.");
			}	 
		}
	
		class Fish extends Animal {
				void move() {
					System.out.println("Moves by swimming.");
				}
				void eat() {
					System.out.println("Eats seafood.");
				}
		}
	}
}

class TestBird {
	public static void main(String[] args) {
		Animal myBird = new Bird();

		myBird.label();
		myBird.move();
		myBird.eat();
	}
}

class TestFish {
	public static void main(String[] args) {
		Animal myFish = new Fish();

		myFish.label();
		myFish.move();
		myFish.eat();
	}
}

/* Animal's data:
Moves by flying.
Eats birdfood.

Animal's data:
Moves by swimming.
Eats seafood.
 */


// Interfaces 
interface Animal {
	public void eat();
	public void sound();
}

interface Bird {
	int numberOfLegs = 2;
	String outerCovering = "feather";

	public void fly();
}

class Eagle implements Animal, Bird {
	public void eat() {
		System.out.println("Eats reptiles and amphibians.");
	}
	public void sound() {
		System.out.println("Has a high-pitched whistling sound.");
	}
	public void fly() {
		System.out.println("Flies up to 10,000 feet.");
	}
}

class TestEagle {
	public static void main(String[] args) {
		Eagle myEagle = new Eagle();

		myEagle.eat();
		myEagle.sound();
		myEagle.fly();

		System.out.println("Number of legs: " + Bird.numberOfLegs);
		System.out.println("Outer covering: " + Bird.outerCovering);
	}
}

/* Eats reptiles and amphibians.
Has a high-pitched whistling sound.
Flies up to 10,000 feet.
Number of legs: 2
Outer covering: feather */

// Encapsulation

class Animal {
	private String name;
	private double averageWeight;
	private int numberOfLegs;

	// Getter methods
	public String getName() {
		return name;
	}
	public double getAverageWeight() {
		return averageWeight;
	}
	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	// Setter methods
	public void setName(String name) {
		this.name = name;
	}
	public void setAverageWeight(double averageWeight) {
		this.averageWeight = averageWeight;
	}
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
}

public class TestAnimal {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();

		myAnimal.setName("Eagle");
		myAnimal.setAverageWeight(1.5);
		myAnimal.setNumberOfLegs(2);

		System.out.println("Name: " + myAnimal.getName());
		System.out.println("Average weight: " + myAnimal.getAverageWeight() + "kg");
		System.out.println("Number of legs: " + myAnimal.getNumberOfLegs());
	}
}

/* Name: Eagle
Average weight: 1.5kg
Number of legs: 2 */

// Inheritance
class Bird {
	public String reproduction = "egg";
	public String outerCovering = "feather";

	public void flyUp() {
		System.out.println("Flying up...");
	}
	public void flyDown() {
		System.out.println("Flying down...");
	}
}

class Eagle extends Bird {
	public String name = "eagle";
	public int lifespan = 15;
}

class TestEagle {
	public static void main(String[] args) {		
		Eagle myEagle = new Eagle();

		System.out.println("Name: " + myEagle.name); 			
		System.out.println("Reproduction: " + myEagle.reproduction);
		System.out.println("Outer covering: " + myEagle.outerCovering);
		System.out.println("Lifespan: " + myEagle.lifespan); 		
		myEagle.flyUp();
		myEagle.flyDown(); 		
	}
}
/* Reproduction: another egg
Outer covering: feather
Lifespan: 15
Flying up...
Flying down... */

// Polymorphism
class Bird {
	public void fly() {
		System.out.println("The bird is flying.");
	}
	public void fly(int height) {
		System.out.println("The bird is flying " + height + " feet high.");
	}
	public void fly(String name, int height) {
		System.out.println("The " + name + " is flying " + height + " feet high.");
	}
}

class TestBird {
	public static void main(String[] args) {
		Bird myBird = new Bird();

		myBird.fly();
		myBird.fly(10000);
		myBird.fly("eagle", 10000);
	}
}

/* The bird is flying.
The bird is flying 10000 feet high.
The eagle is flying 10000 feet high. */

// Dynamic polymorphism
class Animal {
	public void eat() {
		System.out.println("This animal eats insects.");
	}
}

class Bird extends Animal {

	public void eat() {
		System.out.println("This bird eats seeds.");
	}

}

class TestBird {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		myAnimal.eat();

		Bird myBird = new Bird();
		myBird.eat();
	}
}

/* This animal eats insects.
This bird eats seeds. */
























