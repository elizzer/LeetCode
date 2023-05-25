public class RomanToInteger {

   public static int romanToInt(String s){
        int[] romanValues = new int[]{1, 5, 10, 50, 100, 500, 1000};
        int len=s.length();
        int result=0;
        for(int i=0;i<len;i++){
            char c= s.charAt(i);
            System.out.println(c);
            int value=getRomanOrder(c);
            value=romanValues[value];
            try{
                if(getRomanOrder(c)-getRomanOrder(s.charAt(i+1))<0){
                    value*=-1;
                }
                result+=value;
            }catch(IndexOutOfBoundsException e){
                result+=value;
            }

        }
        System.out.println();
        return result;
    }
    public static int getRomanOrder(char c){
        int _I=0,_V=1,_X=2,_L=3,_C=4,_D=5,_M=6;

        if(c=='M'){return _M;}
        else if(c=='D'){return _D;}
        else if(c=='C'){return _C;}
        else if(c=='L'){return _L;}
        else if(c=='X'){return _X;}
        else if(c=='V'){return _V;}
        else if(c=='I'){return _I;}
        else {
            return -1;
        }

    }

    public static int solution(String s){
       int len=s.length();
       int result=0,prev=0;
       for(int i=len-1;i>=0;i--){
           int value=0;
           char c=s.charAt(i);
           switch(c){
               case 'I':value= 1; break;
               case 'V':value= 5; break;
               case 'X':value= 10; break;
               case 'L':value= 50; break;
               case 'C':value= 100; break;
               case 'D':value= 500; break;
               case 'M':value= 1000; break;
           }
           if(value<prev){
               result-=value;
           }else{
               result+=value;
           }
           prev=value;
       }
       return result;
    }
}
