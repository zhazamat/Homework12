public class Homework2 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("Your number: ");
        int rundomNumber = s.nextInt();
        int k=0;
        int[] myList = new int[10];
        for(int i=0;i< myList.length;i++){
            k=i*rundomNumber;
            System.out.println(i +" * "+ rundomNumber+" = " + k);
        }

    }

}
