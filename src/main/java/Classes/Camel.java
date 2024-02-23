package Classes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;


public class Camel extends PackAnimal implements TypicalCamel{

    public Camel(Calendar birthday, String name, ArrayList<String> skills) {
        super(birthday, name, skills);
    }

    public Camel(Calendar birthday, String name) {
        super(birthday, name);
    }
    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public Calendar getBirthday() {return super.getBirthday();}

    @Override
    public String getName() {return super.getName();}

    @Override
    public String toString() {return super.toString();}

    @Override
    public void sit() {
        if (skills.contains("sit"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " sits.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot sit.");
    }
    @Override
    public void walk() {
        if (skills.contains("walk"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " walks.");
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
    public void run() {
        if (skills.contains("run"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " runs.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot run.");
    }
    @Override
    public void learnCommand(String cmd) {
        ArrayList<String> availableCommands = new ArrayList<String>();
        for (Method method: TypicalCamel.class.getDeclaredMethods()) {
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
