public class fibb {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,45,67,89,90};
        int target=67;
        System.out.println(binsrch(arr,target,0,arr.length-1));
//        System.out.println(fibo(7));
    }
//    static int fibo(int n){
//        if(n<2){
//            return n;
//        }
//        return fibo(n-2)+fibo(n-1);
//    }
    static int binsrch(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]>target){
            return binsrch(arr,target,s,m-1);
        }

            return binsrch(arr,target,m+1,e);

    }
}
