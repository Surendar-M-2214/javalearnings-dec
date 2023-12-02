public class sumofn {
    public static void main(String[] args) {
        System.out.println(sum(5));;
    }

  static   int sum(int n) {
        int ans = n;

        ans =ans*( ans+1) / 2;
        return ans;
    }
}