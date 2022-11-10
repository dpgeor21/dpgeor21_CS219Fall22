package Chap9ImmutableObjects;

public class Main {

    public static void main(String[] args) {
        String s = "hello";
        String t = new String("hello");

        //You cant edit a string so you can just make a copy of it
        String s1 = Character.toUpperCase(s.charAt(0)) + s.substring(1);

        // string builder - multiple strings

        // character objects are also immutable

        char ch = 'z';
        Character ch12 = 'z';
        //Character ch3 = new Character('a'); // this might become an error in the future because it's not needed

        int x = 33; // x is primitive here
        Integer y = 33; // y refers to the object 33
       // Integer y1 = new Integer(33);

        double pi = 3.14159; // primitive
        Double pi1 = 3.14159;

        Boolean flag = false; // immutable
        Long ll = 43L;

        // Every primitive type is a wrapper class (Double, Long, Integer, etc.) for their
        // respective type
        // taking a primitive value and wrapping it in an object is autoboxing
        // taking an object and turning it into its primitive type os auto-unboxing

        Student student1 = new Student("Daniel", "George",
                                          "123", "DG");
        // student.first = ERROR
        //student1.nickname = "Dan"; // this works because nickname is not private not anymore because I changed it

        Student student2 = new Student("First", "Last", "ID", "Nickname");

        System.out.println(student1); // toString is implicitly called here
        System.out.println(student2);
    }
}