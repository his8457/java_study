package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lottos {
	public static void main(String[] args) {
		
		//로또 N게임 뽑기
		int gameCount = 10;
		List<Map<Integer, Integer>> lottos = getLottos(gameCount);
		
		printLottos(lottos);
		
		
	}
	
	private static void printLottos(List<Map<Integer, Integer>> lottos) {
		Object[] keys = null;
		
		for(int i=0; i < lottos.size(); i++)
		{
			keys = lottos.get(i).keySet().toArray();
			Arrays.sort(keys);
			System.out.println(Arrays.toString(keys));
			if(i % 5 == 4) {
				System.out.println();
			}
		}
	}

	private static List<Map<Integer, Integer>> getLottos(int gameCount) {
		int minNum = 1;
		int maxNum = 45;
		
		double dbNum = Math.random();
		int number = 0;
		int count = 0;
		
		Map<Integer, Integer> lotto = null;
		List<Map<Integer, Integer>> lottos = new ArrayList<Map<Integer,Integer>>();
		
		for(int i = 0; i < gameCount; i++)
		{	
			lotto = new HashMap<Integer, Integer>();
			
			while(true) {
				dbNum = Math.random();
				number = minNum + (int)Math.round(dbNum * (maxNum-minNum));
				
				if(!lotto.containsKey(number)) {
					lotto.put(number, number);
					count++;
				}
				
				if(count==6) {
					break;
				}
			}
			lottos.add(lotto);
			count = 0;
		}
		
		return lottos;
	}
}
