import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Double> squares = new HashMap<>();
		Integer limit = 10;
		
		while(limit >= 0) {
			squares.put(limit, (double) (limit*limit));
			limit--;
		}
		
		for(Integer k: squares.keySet()) {
			System.out.printf("Number: %d -> Squared: %.2f%n", k, squares.get(k));
		}
		
		String str1 = "abcd", str2 = "dabc";
		StringBuffer combo1 = new StringBuffer(), combo2 = new StringBuffer();
		combo1.append(str1);
		combo1.append(str1);
		combo2.append(str2);
		combo2.append(str2);
		
		System.out.println(combo1);
		System.out.println(combo2);
		
		boolean isRotated = false;
		if(combo1.toString().contains(str2) && combo2.toString().contains(str1)) {
			isRotated = true;
			System.out.println(isRotated);
		}
		
		
	}

}
