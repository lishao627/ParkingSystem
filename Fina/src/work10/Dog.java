package work10;

public class Dog extends Animal implements  RunnableAnimal{
    @Override
    public void makesound() {
        System.out.println("ÍúÍú£¡");
    }

    @Override
    public void run() {
        System.out.println("Ğ¡¹·ÔÚÅÜ£¡");
    }
}

