import java.util.*;
public class triplets {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n ; i++) {
			a[i] = s.nextInt();
		}
		int c = 0;
		for(int i = 0; i < n ; i++) {
			for(int j = i+1; j < n ; j++) {
				for(int k = j+1; k < n ;k++) {
					if(a[i] < a[j] && a[j] < a[k]) {
						//System.out.println(a[i]+"  "+a[j]+" "+a[k]);
						c++;
					}
				}
			}
		}
		System.out.println(c);

	}

}
