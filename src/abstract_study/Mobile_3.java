package abstract_study;

public class Mobile_3 extends Mobile_2 {

	public static void main(String[] args) {
		Mobile_3 m= new Mobile_3();
		m.call();
		m.sms();
		m.clock();
		m.date();
		m.alarms();
		m.remainder();
		m.games();
		m.memory_slot();
		m.android();
		m.camera();
	}

	public void memory_slot() {
		System.out.println("the eighth requirement is mobile should have memory slot");
	}
	public void android() {
	System.out.println("the ninth requirement is mobile should be upgrade to android version");
	}
	public void camera() {
		System.out.println("the tenth requirement is mobile should have camera ");
		
	}

}
