package assignment3;

public class Point {

	static double RA;
	static double SD;
	static double CP;
	static double CUT;
	static double FMT;
	static double AVG;
	
	

	public static double getAVG() {
		return AVG;
	}

	@Override
	public String toString() {
		return "Point RA: " + RA + "| SD: " + SD + "| CP: " + CP + "| CUT: " + CUT + "| FMT: " + FMT + "| AVG: "+ AVG;
	}

	

}
