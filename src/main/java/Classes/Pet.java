package Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public abstract class Pet extends Animal {

    protected Pet(Calendar birthday, String name, ArrayList<String> skills) {
        super(birthday, name, skills);
    }

    protected Pet(Calendar birthday, String name) {
        super(birthday, name);
    }

    @Override
    public Calendar getBirthday() {
        return super.getBirthday();
    }

    @Override
    public String getName() {
        return super.getName();
    }


}