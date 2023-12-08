public class first {
    public static void main(String[] args) {
//        ArrayList<String> list=new ArrayList<>();
//        list.add("suray");
//        System.out.println(list.size());
//        list.size();
        System.out.println(revStr("suray"));
        String rev="";

        char c='a';
        char v='f';
        rev=rev+c+v;
        System.out.println(rev);
    }

    static String revStr(String str){
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }
}
