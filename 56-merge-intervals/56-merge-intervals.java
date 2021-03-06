class Solution {
    public int[][] merge(int[][] intervals){
List<int[]> res = new ArrayList<>();
if(intervals.length ==0 || intervals == null)
return res.toArray(new int[0][]);
Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
int strt = intervals[0][0];
int end = intervals[0][1];
for(int[] i : intervals){
if(i[0] <=end){
end = Math.max(end, i[1]);
}
else{
res.add(new int[]{strt, end});
strt = i[0];
end = i[1];
}}
res.add(new int[]{strt, end});
return res.toArray(new int[0][]);
}}
