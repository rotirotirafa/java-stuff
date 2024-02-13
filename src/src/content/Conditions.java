package content;

public class Conditions {

    public boolean checkAge(int age) {
        if (age > 18) {
            System.out.println("is major");
            return true;
        } else {
            System.out.println("Under Age");
            return false;
        }
    }
}
