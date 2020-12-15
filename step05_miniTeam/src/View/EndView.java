package View;
public class EndView {
	public static void printFoods(String [] f) {
		for (int i = 0; i < f.length; i++) {
			if (f[i] != null) {
				System.out.println(f[i]);
			}
		}
	}
}