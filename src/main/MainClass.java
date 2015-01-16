package main;

public class MainClass {

	public static void main(String[] args) {
		//int[] array = {1,2,3,4};
		Integer[] array = new Integer[5];
		for(int i = 0; i < array.length; i++){
			array[i] = i+1;
		}
		for (int i : array){
			StringBuffer outString = new StringBuffer("Hello, World number ");
			outString.append(i);
			outString.append("!");
			System.out.println(outString.toString());			
		}
	}

}
