import java.util.Arrays;

public class LongestCommonPrefix {
    static public String longestCommonPrefix(String[] strs) {
        String lcp=strs[0];
        for(int i=1;i<strs.length;i++){
            int j=0;
            while(j<=Math.min(lcp.length()-1,strs[i].length()-1) && lcp.charAt(j)==strs[i].charAt(j) ){
                j++;
            }
            if(j==0){
                return "";
            }
            lcp=lcp.substring(0,j);
        }
        return lcp;
    }

    static public String solution(String[]  strs){
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        StringBuilder result = new StringBuilder();
        int len=Math.min(first.length(),last.length());
        for(int i=0;i<len;i++){
            if(first.charAt(i)==last.charAt(i)){
                result.append(first.charAt(i));
            }
            else{
                break;
            }
        }
        return result.toString();

    }
}
