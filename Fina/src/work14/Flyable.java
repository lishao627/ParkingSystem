package work14;

import org.w3c.dom.ls.LSOutput;

interface Flyable {
 void work();
}
class Bird implements Flyable{
    @Override
    public void work() {
        System.out.println("Äñ¶ùÕ¹³á·ÉÏè~");
    }
}
class Airplane implements  Flyable{
    @Override
    public void work() {
        System.out.println("·É»úºäÃùÉı¿Õ~");
    }
}
class  Main{
    public static void main(String[] args) {
        Flyable[] flyables=new Flyable[2];
        flyables[0]=new Bird();
        flyables[1]=new Airplane();
for(Flyable f:flyables){
    f.work();
}
    }
}