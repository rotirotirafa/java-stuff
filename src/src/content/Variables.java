package content;

import java.util.Calendar;

public class Variables {

    Calendar calendar = Calendar.getInstance();

    public String fullName(String Name, String Surname){
        return Name + Surname;
    }

    public Integer age(int Age){
        return Age;
    }

    public String YearOfBirthDate(int Age) {
        int actualYear = calendar.get(Calendar.YEAR);
        int result = Age - actualYear;
        return String.format("Born at %s ", Math.abs(result));
    }
}
