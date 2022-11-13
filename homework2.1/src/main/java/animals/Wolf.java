package animals;

import food.Food;
import food.Grass;
import food.Meat;

//волк
public class Wolf extends Carnivorous implements Voice, Run {
   private String voice = "Аааа - уууу.";
   public void setVoice(String voice){
       this.voice = voice;
   }
    @Override
    public String getVoice(){
       // System.out.println("Волк воет: " + voice);
        return "Волк воет: " + voice;
    }
    @Override
    public void run() {
        System.out.println("Волк бегает по волъеру.");
    }
    @Override
    public void eat(Food food){
        String meat = "Волк кушает мясо!!!";
        boolean isEat = food instanceof Meat;
        if(isEat) {
            System.out.println(meat);
        }
        else{
            System.out.println("Опасно!!! Волк будет голодный.");
        }
    }
}
