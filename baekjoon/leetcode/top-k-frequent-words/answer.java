class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Node> map = new HashMap<String, Node>();
		
		for(String word : words) {
			if(map.containsKey(word)) {
				map.get(word).count++;
			} else {
				map.put(word, new Node(word));
			}
		}
		
		List<Node> list = new ArrayList<Node>();
		list.addAll(map.values());
		
		Collections.sort(list, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				if(o2.count > o1.count) {
					return 1;
				} else if(o1.count > o2.count) {
					return -1;
				} else if(o1.word.compareTo(o2.word) > 0){
					return 1;
				}
				
				return -1;
			}
		});		
		
		List<String> result = new ArrayList<String>();
		
		for(int i=0; i<k; i++) {
			result.add(list.get(i).word);
		}
        
        return result;
    }
}

class Node {
	int count;
	String word;
	
	public Node(String word) {
		this.word = word;
		this.count = 1;
	}
}