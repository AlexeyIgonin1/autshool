package employee;
import animals.*;
import food.*;

public class Worker{
    public static void feed(Animals animals, Food food){
        animals.eat(food);
    }

    /*public void getVoice(Animals animals){
        System.out.println(animals.getVoice());
        //return animals;
    }*/
    public void getVoice(Duck animals){
        System.out.println(animals.getVoice());
    }
    public void getVoice(Hawk animals){
        System.out.println(animals.getVoice());
        //return animals;
    }
    public void getVoice(Horse animals){
        System.out.println(animals.getVoice());
        //return animals;
    }
    public void getVoice(Wolf animals){
        System.out.println(animals.getVoice());
        //return animals;
    }
    public void getVoice(Owl animals){
        System.out.println(animals.getVoice());
    }



}
