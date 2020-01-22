package exam01;

public class TVUser {
	public static void main(String[] args) {
		
		LgTV obj1 = new LgTV();
		obj1.turnOn();
		obj1.turnOff();
		obj1.soundUp();
		obj1.soundDown();
		
		SamsungTV obj2 = new SamsungTV();
		obj2.turnOn();
		obj2.turnOff();
		obj2.soundUp();
		obj2.soundDown();
		
	}

}
