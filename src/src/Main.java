import content.Variables;

public class Main {
    public static void main(String[] args) {
        //type name = value;
        int age;
        age = 28;

        //var name = value; defined scope;
        var name = "Rafael";
        var surname = " Rotiroti";

        Variables variables = new Variables();

        String printName = variables.fullName(name, surname);
        System.out.println(printName);

        Integer printAge = variables.age(age);
        System.out.println(printAge);

        String printYearBorn = variables.YearOfBirthDate(age);
        System.out.println(printYearBorn);
    }
}