package day4;

public class except {
    public static void main(String[] args) {

        try{
            int res= divide(5,0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("na run agitey tha irupen");
        }
    }
    static int divide(int a, int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Zero la" +
                    " divide pana " +
                    "mudiyathu da " +
                    "vendruu");
        }
        return a/b;
    }
}
