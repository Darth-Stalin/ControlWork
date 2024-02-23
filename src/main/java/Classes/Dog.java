package Classes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;


public class Dog extends Pet implements TypicalDog{

    public Dog(Calendar birthday, String name, ArrayList<String> skills) {
        super(birthday, name, skills);
    }

    public Dog(Calendar birthday, String name) { super(birthday, name); }
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
    public void sit() {
        if (skills.contains("sit")) System.out.println(this.name + " the " + this.getClass().toString().replace("class Classes.","") + " sits.");
        else System.out.println(this.name + " the " + this.getClass().toString().replace("class Classes.","") + " cannot sit.");
    }

    @Override
    public void roll() {
        if (skills.contains("roll"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " rolls.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot roll.");
    }

    @Override
    public void fetch() {
        if (skills.contains("fetch"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " fetches.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot fetch.");
    }

    @Override
    public void bark() {
        if (skills.contains("bark"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " barks.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot bark.");
    }

    @Override
    public void stay() {
        if (skills.contains("stay"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " stays.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot stay.");
    }

    @Override
    public void paw() {
        if (skills.contains("paw"))
            System.out.println(this.name + " the " + this.getClass().
                    toString().replace("class Classes.","") + " paws.");
        else System.out.println(this.name + " the " + this.getClass().
                toString().replace("class Classes.","") + " cannot paw.");
    }


    @Override
    public void learnCommand(String cmd) {
        ArrayList<String> availableCommands = new ArrayList<String>();
        for (Method method: TypicalDog.class.getDeclaredMethods()) {
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

