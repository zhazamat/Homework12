public class Homework1 {
    public static void main(String[] args) {
//     String[] words={", kid.",
////             "That's where",
////              "and corners",
////              "Doors",
////               "you",
////               "they get"};
//        String fmt = "{%2d}: %s: ";
//for(int i=0;i<words.length;i++){
//        System.out.println(String.format(fmt,i+2));}


        String[] words={", kid.",
            "That's where",
              "and corners",
              "Doors",
               "you",
               "they get"};

        String fmt = "{%2d}:  ";

        for (int i = 0; i < words.length; ++i) {
            System.out.println(String.format(fmt, i + 1));





        }


    }
//    Doors and corners, kid. That's where they get you
}
