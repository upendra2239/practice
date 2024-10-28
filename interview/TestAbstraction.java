package interview;

//Creating a Test class which calls abstract and non-abstract methods  

/*Code 1
 * 
 * class TestAbstraction{ public static void main(String args[]){ Bike obj = new
 * Honda(); obj.run(); obj.changeGear(); } }
 */ 
/* output1
 * bike is created running safely.. gear changed
 */


class TestAbstraction{  
public static void main(String args[]){  
 
	Bike obj = new Honda();
	obj.run();  
 
}  
}  