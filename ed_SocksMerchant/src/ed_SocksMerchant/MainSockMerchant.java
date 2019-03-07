package ed_SocksMerchant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainSockMerchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20, 20, 50, 50};
		int result = sockMerchat(n, ar);
		System.out.println("RESULT: "+result);

	}
	
	static int sockMerchat(int n, int[] ar) {

		//Distinct Color
		HashMap<String, Integer> distinctColor = new HashMap<String, Integer>();
		for (int i = 0; i < ar.length; i++) {
			distinctColor.put(""+ar[i], 0);
		}
		
		//Count each color in array
		List key = new ArrayList(distinctColor.keySet());
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < key.size(); j++) {
				if (key.get(j).equals(""+ar[i])) {
					distinctColor.merge(key.get(j).toString(), 1, Integer::sum);
				}
			}	
		}
		
		//Count pair sock (divide each color by 2)
		int countPairs = 0;
		int divideTwo = 0;
		for (int i = 0; i < distinctColor.size(); i++) {
			countPairs += distinctColor.get(key.get(i).toString())/2;
		}
		
		return countPairs;
	}

}
