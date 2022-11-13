package animals;

import food.Food;
import food.Grass;
import food.Meat;

//ястреб
public class Hawk extends Carnivorous implements Fly, Voice, Run {
   private String voice = "тив - тив - тив";
   public void setVoice(String voice){
       this.voice = voice;
   }
    @Override
    public String getVoice(){
        //System.out.println("Ястреб издает звук: " + voice);
        return "Ястреб издает звук: " + voice;
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
        String meat = "Ястреб ест мясо!!!";
        boolean isEat = food instanceof Meat;
        if(isEat) {
            System.out.println(meat);
        }
        else{
            System.out.println("Ястреб это не будет есть!!!");
        }
    }


}
