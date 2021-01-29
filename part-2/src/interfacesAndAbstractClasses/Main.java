package interfacesAndAbstractClasses;

public class Main {
	public static void main(String[] args) {
		DeskPhone timsPhone = new DeskPhone(123456);
		timsPhone.powerOn();
		timsPhone.callPhone(123456);
		timsPhone.answer();
	}
}
