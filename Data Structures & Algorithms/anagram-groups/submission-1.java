class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<List<String>>();
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        
        for(int i =0;i<strs.length;i++){
            int[] arr = new int[26];
            char[] str = strs[i].toCharArray();
            
            for(int j =0;j<str.length;j++){
                arr[str[j]-'a']++;
            }
            String key = Arrays.toString(arr);
            if(map.containsKey(key)){    
                map.get(key).add(strs[i]);
            }else{
                List<String> firstString = new ArrayList<String>();
                firstString.add(strs[i]);
                map.put(key,firstString);
            }
            
        }
        map.forEach((k, v) -> ans.add(v));
        return ans;
    }
}
