class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(char c:s.toCharArray())
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        for(char c:t.toCharArray())
        {
            if(hmap.get(c)==null || hmap.get(c)==0)
                return false;
            else
                hmap.put(c,hmap.getOrDefault(c,0)-1);
        }
        for(char key:hmap.keySet())
            if(hmap.get(key)>0)
                return false;
        return true;
    }
}