package Classes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;


public class Donkey extends PackAnimal implements TypicalDonkey{

    public Donkey(Calendar birthday, String name, ArrayList<String> skills) {
        super(birthday, name, skills);
    }

    public Donkey(Calendar birthday, String name) {
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
    public void walk() {
        if (skills.contains("walk"))
            System.out.println(this.name + " the " + this.getClass().toString().
                    replace("class Classes.","") + " walks.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot walk.");
    }

    @Override
    public void carryLoad() {
        if (skills.contains("carryLoad"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " carries the load.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot carry the load.");
    }

    @Override
    public void bray() {
        if (skills.contains("bray"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " brays.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot bray.");
    }

    @Override
    public void kick() {
        if (skills.contains("kick"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " kicks.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot kick.");
    }

    @Override
    public void learnCommand(String cmd) {
        ArrayList<String> availableCommands = new ArrayList<String>();
        for (Method method: TypicalDonkey.class.getDeclaredMethods()) {
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
