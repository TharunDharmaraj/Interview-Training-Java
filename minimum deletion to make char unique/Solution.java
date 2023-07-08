package minimum deletion to make char unique;

class Solution {
    public int minDeletions(String str) {
   int count = 0;
		HashMap<Character,Integer> hm = new HashMap<>();
		Set<Integer> st = new HashSet<>();
		int len = str.length();
		for(int i = 0 ; i < len ; i++){
			char ch = str.charAt(i);
			if(hm.containsKey(ch)){
				hm.put(ch,hm.get(ch)+1);
			}else{
				hm.put(ch,1);
			}
		}
		for(Map.Entry<Character,Integer> element : hm.entrySet()){
			int value = element.getValue();
			if(st.contains(value)){
				while(st.contains(value)){
					count++;
					value--;
					if(value == 0){
						break;
					}
				}
				if(value != 0){
					st.add(value);
				}
			}else{
				st.add(value);
			}
		}
		return count;
    }
}
