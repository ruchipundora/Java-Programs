
 
abstract class Animal1   // made an abstract class
     {
	abstract void bark();
     }

class Dog extends Animal1   //need a class to extend the abstract class
{
	public void bark()     // write what you want to print in the method
	{                      //the method that was given in abstract class
		System.out.println("Bow Bow");
	}
}

class Cat extends Animal1  
{
	public void bark()     
	{
		System.out.println("Meow Meow");
	}
}


public class Animal
{
public static void main(String[] args)
     {
     	Animal1[] animals = {new Cat(), new Dog()};
	    for (Animal1 animal:animals)
	       {
		     animal.bark();
	       }

	  }
}

