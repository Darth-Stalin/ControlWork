package Classes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;


public class Horse extends PackAnimal implements TypicalHorse{

    public Horse(Calendar birthday, String name, ArrayList<String> skills) {
        super(birthday, name, skills);
    }

    public Horse(Calendar birthday, String name) {
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
    public void trot() {
        if (skills.contains("trot"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " trots.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot trot.");
    }
    @Override
    public void canter() {
        if (skills.contains("canter"))
            System.out.println(this.name + " the " + this.getClass().toString().
                    replace("class Classes.","") + " canters.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot canter.");
    }
    @Override
    public void gallop() {
        if (skills.contains("gallop"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " gallops.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot gallop.");

    }
    @Override
    public void jump() {
        if (skills.contains("jump"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " jumps.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot jump.");

    }
    @Override
    public void learnCommand(String cmd) {
        ArrayList<String> availableCommands = new ArrayList<String>();
        for (Method method: TypicalHorse.class.getDeclaredMethods()) {
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
