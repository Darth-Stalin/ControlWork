package Classes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;


public class Cat extends Pet implements TypicalCat{

    public Cat(Calendar birthday, String name, ArrayList<String> skills) {
        super(birthday, name, skills);
    }

    public Cat(Calendar birthday, String name) {
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
    public void meow() {
        if (skills.contains("meow"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " meows.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot meow.");
    }

    @Override
    public void scratch() {
        if (skills.contains("scratch"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " scratches.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot scratch.");
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
    public void sit() {
        if (skills.contains("sit")) System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " sits.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot sit.");
    }

    @Override
    public void pounce() {
        if (skills.contains("pounce"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " pounces.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot pounce.");
    }

    @Override
    public void learnCommand(String cmd) {
        ArrayList<String> availableCommands = new ArrayList<String>();
        for (Method method: TypicalCat.class.getDeclaredMethods()) {
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

