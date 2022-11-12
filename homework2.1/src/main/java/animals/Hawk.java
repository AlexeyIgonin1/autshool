package animals;

import food.Food;

//ястреб
public class Hawk extends Carnivorous implements Fly, Voice, Run {
    String voice = "тив - тив - тив";
    @Override
    public void getVoice(String voice){
        System.out.println("Ястреб издает звук: " + voice);
    }
    @Override
    public void fly(){
        System.out.println("Ястреб летает в клетке.");
    }
    @Override
    public void run(){
        System.out.println("Ястреб ходит по земле.");
    }
    @Override
    public void eat(Food food){

    }


}
