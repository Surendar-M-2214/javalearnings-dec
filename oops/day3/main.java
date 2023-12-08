package day3;

public class main {
    public static void main(String[] args) {
     son suray=new son();
     daughter vinu=new daughter();
     suray.career();
     suray.greetings();
     suray.partner();
     vinu.career();
     vinu.greetings();
     vinu.partner();

      work su=new suray();
      work vp= (work) new vinu();
        su.name();
        su.age();
        su.work();
        vp.name();
        vp.age();
        vp.work();
}}
