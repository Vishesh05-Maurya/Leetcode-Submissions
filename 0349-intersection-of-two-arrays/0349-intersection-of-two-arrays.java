class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> unique = new HashSet<>();
          Set<Integer> res = new HashSet<>();
// first we add all the element of first array in set
 for(int num:nums1){
    unique.add(num);
 }
// then in another set if the element of second array present in first then we add it.

for(int num : nums2){
    if(unique.contains(num)){
 res.add(num);
    }
}  

// convert hashset to array
int [] result= new int[res.size()];
int i=0;
for(int num : res){
    result[i++]=num;
}

   return result;     
    }
}