import java.util.HashSet;
import java.util.Set;

/**
 * Created by mkale on 7/15/17.
 */
public class FirstDuplicate {

	public static void main(String[] args) {
		int [] p = {1, 1, 2, 2, 1};
		int [] q = {2, 3, 3, 1, 5, 2};
		System.out.println(firstDuplicate(q));
	}
	
	static int firstD(int[] a) {
		Set<Integer> s = new HashSet();
		for (int i=0; i<a.length; i++) {
			if(s.add(new Integer(a[i])) ==false){
				return a[i];
			}
		}
		return -1;
	}
	
	static int firstDuplicate(int[] a) {
		int pos [] = new int[2];
		
		pos[0] = -1;
		pos[1] = -1;
		
		for (int i=0; i<a.length; i++){
			for(int j = i+1; j<a.length; j++){
				if(a[i]==a[j]) {
					if(pos[1] == -1 || pos[1] > j) {
						pos[0] = i;
						pos[1] = j;
					}
					break;
				}
			}
		}
		return pos[1]==-1?-1:a[pos[1]];
	}
}


	