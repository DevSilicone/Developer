package day39_arraylist04;

import java.util.*;

public class X02_UniqueValues {

	public static void main(String[] args) {
		
		// ## Unique Values ##  Very popular questions ???
		
		
		/** List<int[]> nums;	*/			//=> this is also possible - each value in array list now - we can vigulate it.
		
		List<Integer> nums = new ArrayList<>();
		nums.add(10);nums.add(10);nums.add(7);nums.add(8);
		nums.add(8);nums.add(3);nums.add(4);nums.add(8);
		
		System.out.println(nums);
		
		
		
		
		// find NON duplicate - unique(DISTINCT) values. if there 2 A A. -> [10, 10, 7, 8, 8, 4, 8] -> [10, 7, 8, 3, 4] 
		List<Integer> unique1 = new ArrayList<>();					//==> pull non unique value first
		
		for(Integer num : nums) {									//==> for each numbers in num
			// assign num to unique1 if nums is not there already
			if(!unique1.contains(num)) {							//==> eger unique orada degilse container
				unique1.add(num);									//==> bunu ekle
			}
		}
		System.out.println(unique1.toString());
		
		
		
		
		
		// 2. find unique(appearing once) values // => [10, 10, 7, 8, 8, 4, 8] -> [10, 7, 8, 3, 4] 
		
		List<Integer> unique2 = new ArrayList<>();
		
		for(int i = 0; i < nums.size(); i++) {
			int count = 0;
			Integer value = nums.get(i);
			for(int k = 0; k < nums.size(); k++) {
				if(nums.get(k) == value && i != k) {
					count++;
					break;
				}
			}
		
		if(count == 0) {
			unique2.add(value);
			
		}
			
	}
		
		System.out.println(unique2);
		
		
		
		
	}

}
