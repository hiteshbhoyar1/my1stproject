package velocity_p;

public class HR_portal {

	public static void main(String[] args) {
		
		Emp_info SachinT= new Emp_info();
		SachinT.Ply_name= "Sachin Ramesh Tendulkar";
		SachinT.country= "india";
		SachinT.position=2;
		SachinT.grade='A';
		SachinT.income=10002369.236f;
		SachinT.employee_info();
		
		Emp_info RahulD= new Emp_info();
		RahulD.Ply_name= "Rahul Dravid";
		RahulD.country= "India";
		RahulD.position= 3;
		RahulD.grade='A';
		RahulD.income=10002365.23569874f;
		RahulD.employee_info();
		
		Emp_info AdamG= new Emp_info();
		AdamG.Ply_name= "Adam Gilchrist";
		AdamG.country= "Australia";
		AdamG.position= 6;
		AdamG.grade= 'b';
		AdamG.income= 100236.265894f;
		AdamG.employee_info();

	}

}
