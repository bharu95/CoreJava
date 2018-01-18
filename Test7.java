import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test7 {

	public static void main(String[] args) {
		String input1 = "MAN";
		int sum = 0;
		// {A=0, B=1, C=1, D=2, E=3, F=5, G=8, H=13, I=21, J=34, K=55, L=89, M=144,
		// N=233, O=377, P=610, Q=987, R=1597, S=2584, T=4181, U=6765, V=10946, W=17711,
		// X=28657, Y=46368, Z=75025}

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		hm.put(alphabets.charAt(0), 0);
		hm.put(alphabets.charAt(1), 1);
		// System.out.println(hm.get('A')+ hm.get('B'));
		for (int i = 2; i < alphabets.length(); i++) {
			int val = hm.get(alphabets.charAt(i - 1)) + hm.get(alphabets.charAt(i - 2));
			hm.put(alphabets.charAt(i), val);
		}
		
		for (int i = 0; i < input1.length(); i++) {

			if (hm.containsKey(input1.charAt(i))) {
				sum = sum + hm.get(input1.charAt(i));
				// System.out.println(sum);
			}
		}
		
		System.out.println(sum); 
		
		Set<Character> k=hm.keySet();
		System.out.println("==============");
		for(Character c:k)
		System.out.println(c);
		
		Collection<Integer> v=hm.values();
		System.out.println("==============");
		for(Integer cc:v)
			
		System.out.println(cc);
		
		Set<Map.Entry<Character,Integer>> s=hm.entrySet();
		System.out.println("===============");
		/*for(Entry<Character, Integer> ss:s) {
			
			System.out.println(ss);
*/			
			
			Iterator it=s.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
		}
	}
	
	
	

}
