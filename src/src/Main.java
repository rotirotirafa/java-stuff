import content.Conditions;
import content.Variables;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        --------------- BEGIN Checking Variables ---------------------
         */
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
        /*
        --------------- END Checking Variables ---------------------
         */

        /*
        --------------- BEGIN Checking Conditions ------------------
         */

        Conditions conditions = new Conditions();

        Boolean printCheckAge = conditions.checkAge(age);
        System.out.println(printCheckAge);

         /*
        --------------- END Checking Conditions ------------------
         */
        
        /*
        --------------- BEGIN Checking ArrayList ------------------
         */
        ArrayList<String> skills = new ArrayList<String>();
        // ["Value 1","Value2","Value2"]

        skills.add("PHP");
        skills.add("Python");
        skills.add("Java");

        System.out.println(skills);
        System.out.println(skills.size());
    
        /*
        --------------- END Checking ArrayList ------------------
         */
        
        /*
        --------------- BEGIN Checking Loops ------------------
         */

        //FOR EACH
        skills.forEach(System.out::println);
        //or
        skills.forEach((skill) -> System.out.println(skill));

    }
    }
