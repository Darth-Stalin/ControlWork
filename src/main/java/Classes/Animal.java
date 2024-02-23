package Classes;

import java.util.ArrayList;
import java.util.Calendar;

public abstract class Animal {

    final int id;
    class Counter {
        private static int COUNTER = 0;
        private final int counter;

        public Counter() {
            counter = ++COUNTER ;
        }
        public int getId() {
            return counter;
        }
    }

    protected Calendar birthday;

    protected String name;

    protected ArrayList<String> skills;
    public Animal(Calendar birthday, String name) {
        Counter counter = new Counter();
        this.id = counter.getId();
        this.birthday = birthday;
        this.name = name;
    }
    public Animal(Calendar birthday, String name, ArrayList<String> skills) {
        Counter counter = new Counter();
        this.id = counter.getId();
        this.birthday = birthday;
        this.name = name;
        this.skills = skills;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public int getId() {
        return id;
    }
    public Calendar getBirthday() {
        return birthday;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return  this.getClass().toString().
                replace("class Classes.","") + "; " +
                "id=" + id + "; "  +
                "name = " + name + "; " +
                "date of birth = " + birthday.get(Calendar.YEAR) + "-" +
                (birthday.get(Calendar.MONTH)+1) +  "-" +
                birthday.get(Calendar.DAY_OF_MONTH)
//               + "; skills: " + skills.toString().
//                    replace("[","").
//                    replace("]","")
                ;
    }
    public void learnCommand(String cmd) {
        ArrayList<String> availableCommands = new ArrayList<String>();
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
