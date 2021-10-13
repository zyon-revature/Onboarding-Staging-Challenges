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
		
		
	}

}
0.