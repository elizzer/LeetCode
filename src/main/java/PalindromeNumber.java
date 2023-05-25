

//Given an integer x, return true if x is a
// palindrome
//, and false otherwise.

public class PalindromeNumber {
    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        int _x=0;
        int temp=x;
        while (temp!=0) {
            _x = _x * 10 + temp % 10;
            temp = temp / 10;
        }
        return x==_x;
    }

    public static boolean Solution(int x){
        if(x<0 || x!=0 && x%10==0) return false;

        int check=0;
        while (x>check){
            check=check*10+x%10;
            x/=10;
        }
        System.out.println(check);
        System.out.println(x);
        return (x==check || x==check/10);
    }

}
