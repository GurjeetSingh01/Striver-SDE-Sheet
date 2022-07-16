class Solution {
    public int compareVersion(String version1, String version2) {
        if (version1.equals(version2))
            return 0;
        
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        
        int max = Math.max(s1.length, s2.length);
        
        int[] i1 = new int[max];
        int[] i2 = new int[max];
        
        for (int i = 0; i < s1.length; i++) {
            i1[i] = Integer.valueOf(s1[i]);
        }
        for (int i = 0; i < s2.length; i++) {
            i2[i] = Integer.valueOf(s2[i]);
        }
        
        for (int i = 0; i < max; i++) {
            if (i1[i] > i2[i])
                return 1;
            if (i1[i] < i2[i])
                return -1;
        }
        
        return 0;
    }
}