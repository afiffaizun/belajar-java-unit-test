package test;

public class Calculator {
	
	public Integer divide(Integer first, Integer second) {
		if (second == 0) {
			throw new IllegalArgumentException("Tidak bisa dibagi angka 0");
			
		} else {
			return first / second;
		}
	}
	
	public Integer add(Integer first, Integer second) {
		return first + second;
	}

}
