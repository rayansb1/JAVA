package Practice;

public class Test_Grading {

	public static void main(String[] args) {

		
		Grading Arr[] = new Grading [5];
		
		Kids kk1 = new Kids  ("Khalid", 98);
		
		
		undergradSt ug1= new undergradSt  ("Yasser","11223", 55, true);
		undergradSt ug2 = new undergradSt ("Mohamed","32434", 99, false);
		
		PostGrad pg1= new PostGrad  ("Ahmed","4324", 100, true);
		PostGrad pg2 = new PostGrad ("anas","324334", 89, false);
		
		Arr[0] = kk1;
		Arr[1] = ug1;
		Arr[2] = ug2;
		Arr[3] = pg1;
		Arr[4] = pg2;
		
		
		System.out.println(" The results are");
		for (int i = 0; i < Arr.length; i++) {
			Arr[i].computeGrade();
		}
		
		
		
	}
}


