package singlecton;

public class singlecton {
	private static singlecton s = null;
	
	public static singlecton singlecton(){
			if(s == null) {
				s = new singlecton();
			}	
			return s;
		}
	
}
