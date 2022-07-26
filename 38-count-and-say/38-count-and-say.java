class Solution {
   public String countAndSay(int n) {
        if(n==1)
            return "1";

        StringBuilder sb=new StringBuilder();

        
        String str=countAndSay(n-1);
       
        
        char c='0';
        int count=0;
        for (int i=0;i<str.length();i++){
            c=str.charAt(i);
            count=1;
            while ((i+1)<str.length()&&str.charAt(i+1)==c){
                count++;
                i++;
            }
            sb.append(count+""+c);
        }
        return sb.toString();
}
}

