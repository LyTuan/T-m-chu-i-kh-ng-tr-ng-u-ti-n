package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String avgs[]){
		HashMap <String,String> hm = new HashMap<>();
		hm.put("1", "Tuan");
		hm.put("2","hoc");
		hm.put("3", "Truong");
		hm.put("3","dh");
		for(Map.Entry<String, String> m: hm.entrySet()){
			System.out.println(m.getKey()+"   "+m.getValue());
		}
	}
}
