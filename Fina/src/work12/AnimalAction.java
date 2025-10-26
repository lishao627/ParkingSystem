package work12;
interface AnimalAction {
  void eat();

  default void sleep(){
      System.out.println("ÕýÔÚË¯¾õ¡£¡£¡£");
  }
}
class Dog implements  AnimalAction{
    @Override
    public void eat() {
        System.out.println("¹·×Ð³Ô¹ÇÍ·");
    }
}