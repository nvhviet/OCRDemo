package abc;

import java.awt.List;
import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		java.util.List<Integer> test = new ArrayList<>();
		for(int i = 1; i<=10;++i){
			test.add(i);
		}
		
		System.out.println("Before");
		for(int i : test){
			System.out.println(i);
		}
		//chuyen 2, 3, 5, 6
		for(int i : new int[]{4,2,1}){//5 3 2, 6
			int obj = test.remove(i);
			test.add(0, obj);
		}
		System.out.println("After");
		for(int i : test){
			System.out.println(i);
		}
		//show change
	}

}
