package basic;

public class StaticAndInstanceBlocks {
	static int i=0;
	
		//static block
	    static {
	    	//Error - int i = 0; - static to non static call
	    	//solution - static int i = 0;
	    	i=1;
	        System.out.println("Static initializer block");
	    }

	    //instance block
	    {
	    	i=2;
	        System.out.println("Instance initializer block");
	    }

	    public StaticAndInstanceBlocks() {
	        System.out.println("Constructor");
	    }

	    public static void main(String[] args) {
	        System.out.println("Creating first instance:");
	        StaticAndInstanceBlocks obj1 = new StaticAndInstanceBlocks();
	        System.out.println("Creating second instance:");
	        StaticAndInstanceBlocks obj2 = new StaticAndInstanceBlocks();
	    }
	}

