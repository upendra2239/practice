package basic;

public class Singleton {
	
	private static Singleton instance;
	
	private static int instanceCount=0;
	
	private Singleton() {
		
	}
	
	public static Singleton getInnstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
					instanceCount++;
				}
				
			}
		}
		return instance;
	}
	
	
	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInnstance();
		Singleton singleton1 = Singleton.getInnstance();

		if(instanceCount==1) {
			System.out.println("singleton");
		}else {
			System.out.println("not singleton");

		}
	}
	
}
