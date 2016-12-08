package player.models;

public class RandomLetter {
	static String[] letter = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "qu", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	static double[] probability = {0.127, 0.0906, 0.0817, 0.0751, 0.0697, 0.0675, 0.0633, 0.0609, 0.0599, 0.0425, 0.0403, 0.0278, 0.0276, 0.0241, 0.0236, 0.00223, 0.0202, 0.0197, 0.193, 0.0149, 0.0098, 0.0077, 0.0015, 0.0015, 0.0010, 0.0007};
	
	
	public static String generateLetter(){
		double r = Math.random();
		double cdf = 0.0;
		String s = null;
		for (int i = 0; i < letter.length; i++) {
		    cdf += probability[i];
		    if (r < cdf) {
		        s = letter[i];
		        break;
		    }
		}
		return s;
	}
}
