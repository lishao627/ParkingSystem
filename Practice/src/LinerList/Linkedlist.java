package LinerList;

class node<T>{
    T data;
    node next;
    public node(){}
    public node(T data){
        this.data=data;
    }
    public node(T data,node next){
        this.data=data;
        this.next=next;
    }
}
public class Linkedlist<T> implements Listinterface<T>{
    node head;
    private int length;
    public Linkedlist(){
        head=new node();
        length=0;
    }
    public  void Init(int initsize){
        head.next=null;
    }
    public int length(){
        return this.length;
    }
    public  boolean isEmpty(){
        if(length==0){
            return true;
        }
        else {
            return false;
        }

    }
    public
}
