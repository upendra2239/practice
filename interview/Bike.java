package interview;

//Example of an abstract class that has abstract and non-abstract methods  
/*Code 1
 * abstract class Bike{ Bike(){System.out.println("bike is created");} abstract
 * void run(); void changeGear(){System.out.println("gear changed");} }
 */

//code 2
abstract class Bike{  
	   Bike(){System.out.println("bike is created");}  
	   void run(){System.out.println("running");}
	   void changeGear(){System.out.println("gear changed");}  
	 }  