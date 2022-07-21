class Solution {
    public int fact(int n){
        int f=1;
        for(int i=n;i>=2;i--){
            f*=i;
        }
        return f;
    }
    public String getPermutation(int n, int k){
        LinkedList<Integer> ls=new LinkedList<>();
        for(int i=1;i<=n;i++){
            ls.add(i);
        }
        int m=n;
        String s="";
        int ft=fact(n);
        while(true){
            int gp_size=ft/n;
            int pos=(k-1)/gp_size;
            s+=ls.get(pos);
            ls.remove(pos);
            ft=ft/n;
            n--;
            if(k>((pos)*gp_size)){
                k-=((pos)*gp_size);
            }
            else{
                k=gp_size*(pos)-k;
            }
            if(s.length()==m){
                break;
            }
        }
        return s;
    }
}