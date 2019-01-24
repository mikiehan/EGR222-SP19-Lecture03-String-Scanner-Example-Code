public class StringExample {
    public static void main(String[] args) {
        // index     012345678901
        String s1 = "Stuart Reges";
        String s2 = "Marty Stepp";

        System.out.println(s1.length());         // 12
        System.out.println(s1.indexOf("e"));     // 8
        System.out.println(s1.substring(7, 10)); // "Reg"

        String s3 = s2.substring(1, 7);
        System.out.println(s3.toLowerCase());    // "arty s"

        System.out.println(s2);
        System.out.println(s3);

//         index       0123456789012345678901
        String book = "Building Java Programs";
//
//        //How to extract Java?
        System.out.println(book.substring(9,13));
//        //How to extract Programs?
        System.out.println(book.substring(14));

        //What will output?
        String s = "Aceyalone";
        System.out.println(s.toUpperCase());
        System.out.println(s);
        //How to modify s?


        s = s.toUpperCase();
        System.out.println(s);

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1 == str2);   // false
        System.out.println(str1.equals(str2)); //true


        String str3 = "hello";
        String str4 = "hello";

        System.out.println(str3 == str4);   // true
        System.out.println(str3.equals(str4)); //true

    }
}