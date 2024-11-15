package numberbasedProgram63;

public class PascleTrinagel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPascleTriangel(5);

	}
	public static void getPascleTriangel(int row) {
		int tf=1;
		int tl=1;
		for(int i=(row-2);i>0;i--) {
			int tnext=tf+tl;
			System.out.print(tnext);
			
		}
		System.out.println(1);

	}

}
