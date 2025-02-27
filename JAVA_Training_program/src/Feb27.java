class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for(String x : strs){
            while(!x.startsWith(result)){
                result = result.substring(0,result.length()-1);
            }
        }
        return result;
        
        // String result = strs[0];
        // for(String x: strs){
        //     char[] lets = x.toCharArray();
        //     int i = 0;
        //     while(i<lets.length && i<result.length() && lets[i]==result.charAt(i)){
        //         i++;
        //     }
        //     result = result.substring(0,i);
        // }
        // return result;
    }
}