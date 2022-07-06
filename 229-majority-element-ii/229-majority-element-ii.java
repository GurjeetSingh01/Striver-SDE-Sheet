class Solution{
public List<Integer> majorityElement(int[] nums){
int num1 = -1;
int num2 =-1;
int cnt1 =0;
int cnt2 =0;

for(int element:nums){
if(num1 == element) cnt1+=1;
else if(num2 == element) cnt2+=1;
else if(cnt1 ==0){
num1=element;
cnt1=1;
}
else if(cnt2==0){
num2 = element;
cnt2=1;
}
else {
cnt1--;
cnt2--;
}
}
ArrayList<Integer> list = new ArrayList<>();
cnt1 =0;
cnt2 = 0;
for(int num: nums){
if(num == num1) cnt1++;
else if(num==num2) cnt2++;
}
if(cnt1>nums.length/3) list.add(num1);
if(cnt2>nums.length/3) list.add(num2);
return list;
}}
  