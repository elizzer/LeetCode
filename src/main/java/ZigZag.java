public class ZigZag {
    public String convert(String s, int numRows){
        char result[]= new char[s.length()];



        int k=0;
        int j=0;


        for(int i=0;i<numRows;i++){
            j=i;
            result[k++]=s.charAt(j);
            while(j<s.length()){
                int x=2*(numRows-i)-2;
                if(x!=0 && j+x<s.length()){
                    j+=x;
                    result[k++]=s.charAt(j);
                } else if (j+x>s.length()) {
                    break;
                }
                x=2*(i+1)-2;
                if(x!=0 && j+x<s.length()){
                    j+=x;
                    result[k++]=s.charAt(j);
                }else if (j+x>s.length()) {
                    break;
                }
            }
        }

        return result.toString();
    }
}
