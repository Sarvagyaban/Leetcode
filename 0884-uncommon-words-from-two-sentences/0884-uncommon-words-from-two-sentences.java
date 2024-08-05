class Solution {
    public String[] uncommonFromSentences(String s1, String s2) 
    {
     String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words1) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        for (String word : words2) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        List<String> uncommonWords = new ArrayList<>();   
        for (String word : wordCountMap.keySet()) 
        {
            int count = wordCountMap.get(word);
            if (count == 1) 
            {
            uncommonWords.add(word);
            }   
        }
        return uncommonWords.toArray(new String[0]);


    }
}