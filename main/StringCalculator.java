package main;

public class StringCalculator {

    private final String delimiter = ",|\n";
	
	public int add(String number)throws Exception{
		if (number.isEmpty()) return 0;
		
		findException(number);
		
		if(number.length() > 1){
			String a[] = number.split(delimiter);
			return findSum(a);
		}
		
		return Integer.parseInt(number);
	}
	
	private int findSum(String[] numbers){
		int sum = 0;
		for(String i : numbers){
			sum += Integer.parseInt(i);
		}
		return sum;
	}
	
	private void findException(String number) throws Exception{
		String a[] = number.split(delimiter);
		for(String i : a){
			if(Integer.parseInt(i) < 0)
				throw new Exception("Negative number");
		}
	}

}
