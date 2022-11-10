package Chap9ImmutableObjects;

public class Student {

    // classes encapsulate related data
    // classes are blueprints for creating objects

    // private dat cannot be accessed from outside of the class
    private String first;
    private String last;
    private String id;
    // these are all instance variables (templates for an object)
    private String nickname;

    public Student(String first_, String last_, String id_, String nickname_){
        first = first_;
        last = last_;
        id = id_;
        nickname = nickname_;
    }


    // add a method
    // this method will return our data in a much easier way
    public String toString(){
        return last + ", " + first+ " " + "(" + nickname + ")";
    }

}
