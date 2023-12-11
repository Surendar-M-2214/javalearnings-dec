package day5;
 enum status{
     Running,Failed,Winning;
 }
 enum laptop{
     Macbook(2000),laptop(3000),desktop(5000);
     private int price;
     private laptop(int price){
        this.price=price;
     }

     public int getPrice() {
         return price;
     }

     public void setPrice(int price) {
         this.price = price;
     }


 }
public class enumer {
    public static void main(String[] args) {
//        status[] ss=status.values();
//        for (status s:ss) {
//            System.out.println(s);
//        }
        laptop lp=laptop.laptop;
        lp.setPrice(1000);
//        System.out.println(lp + " : " + lp.getPrice());
        for (laptop l:laptop.values()
             ) {
            System.out.println(l+" : "+ l.getPrice());
        }
    }
}
