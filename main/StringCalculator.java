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
		List<Integer> list = new ArrayList<Integer>();
		for(String i : a){
			if(Integer.parseInt(i) < 0)
				list.add(Integer.parseInt(i));
		}
		if(!list.isEmpty())
			throw new Exception("Negative number:" + list);
	}

}
