package main;

public class StringCalculator {

    private final String delimiter = ",|\n";
	
	public int add(String number){
        if(number.length() == 1) return Integer.parseInt(number);
        if(number.length() > 1){
			String a[] = number.split(delimiter);
			return sum(a);
		}
		return 0;
	}

    public int sum(String[] numbers){
		int sum = 0;
		for(String i : numbers){
			sum += Integer.parseInt(i);
		}
		return sum;
	}

}
