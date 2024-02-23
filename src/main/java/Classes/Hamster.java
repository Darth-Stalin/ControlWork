package Classes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;


public class Hamster extends Pet implements TypicalHamster{

    public Hamster(Calendar birthday, String name, ArrayList<String> skills) {
        super(birthday, name, skills);
    }

    public Hamster(Calendar birthday, String name) {
        super(birthday, name);
    }
    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public Calendar getBirthday() {return super.getBirthday(); }

    @Override
    public String getName() {return super.getName();}

    @Override
    public String toString() {return super.toString();}


    @Override
    public void roll() {
        if (skills.contains("roll"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " rolls.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot roll.");
    }

    @Override
    public void spin() {
        if (skills.contains("spin"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " spins.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot spin.");
    }

    @Override
    public void hide() {
        if (skills.contains("hide"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " hides.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot hide.");

    }

    @Override
    public void learnCommand(String cmd) {
        ArrayList<String> availableCommands = new ArrayList<String>();
        for (Method method: TypicalHamster.class.getDeclaredMethods()) {
            availableCommands.add(method.getName());
        }
        if (availableCommands.contains(cmd)) {
            if (this.skills.contains(cmd)) {
                System.out.println(this.name + " the " +
                        this.getClass().toString().replace("class Classes.","") +
                        " already can " + cmd + ".");
            }
            else{
                this.skills.add(cmd);
                System.out.println(this.name + " the " +
                        this.getClass().toString().replace("class Classes.","")
                        + " now can " + cmd+ ".");
            }
        }
        else  System.out.println("Unknown or inapplicable command.");
    }
}

