package numberbasedProgram63;
import static java.lang.System.*;
public class PermutatioCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out.println(getCombination(12, 8));

	}
	
	public static int getPermutations(int n, int r){
		r=n-r;
		int perm=1;
		while(n>r) {
			perm*=n;
			n--;
		}
		return perm;
	}
	
	public static int getCombination(int n, int r) {
		int comb=getPermutations(n,r);
		out.println(comb+" permutations");
		while(r>1) {
			comb/=r;
			r--;
		}
		return comb;
	}
}
