package Excercise_10;

public class Main_Exercise_10 {
    public static void main(String[] args) {
        Parent parent = new Parent("Parent's secret");
        System.out.println("Parent's secretData >> " + parent.getSecretData());
        Child child = new Child("Child secret");
        System.out.println("Child's secretData >> " + child.getSecretData());
    }
}
