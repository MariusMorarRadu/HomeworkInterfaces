package Animals;

public class Cat implements Animal {

    @Override
    public String walk() {
        return "Cat is walking";
    }

    @Override
    public String eat() {
        return "Cat is eating";
    }

    @Override
    public String talk() {
        return "Cat is talking";
    }
}
