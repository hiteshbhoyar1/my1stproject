package velocity_p;

 class Multiclass {
	 public void bank() {
		 System.out.println("sbi is one of the bank ");
	 }
}
 class branch extends Multiclass{
	 public void bank1() {
		 System.out.println("it has most no. of branches ");
	 }
 }
 class co_branch extends branch {
	 public void other() {
		 System.out.println("many banks are connected to sbi");
	 }
	 
 }
