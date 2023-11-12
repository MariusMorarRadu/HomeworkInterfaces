package Animals;

public class Dog implements Animal{
    @Override
    public String walk() {
        return "Dog is walking";
    }

    @Override
    public String eat() {
        return "Dog is eating";
    }

    @Override
    public String talk() {
        return "Dog is talking";
    }
}
