package main;

public class StringCalculator {

    private final String delimiter = ",|\n";
	
	public int add(String number){
        if(number.length() == 1) return Integer.parseInt(number);
        if(number.length() > 1){
			String a[] = number.split(delimiter);
			return Integer.parseInt(a[0]) + Integer.parseInt(a[1]);
		}
		return 0;
	}

}
