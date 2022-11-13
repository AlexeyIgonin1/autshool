package animals;

import food.Food;
import food.Grass;

//лошадь
public class Horse extends Herbivore implements Run, Voice {
    private String voice = "Ииии - го - го";
    public void setVoice(String voice){
        this.voice = voice;
    }
    @Override
    public void run(){

        System.out.println("Лошадь бегает, ходит.");
    }
    @Override
    public String getVoice(){
        //System.out.println("Лошать издает звук: " + voice);
        return "Лошать издает звук: " + voice;
    }
    @Override
    public void eat(Food food){
        String grass = "Лошать ест траву!!!";
        boolean isEat = food instanceof Grass;
        if(isEat) {
            System.out.println(grass);
        }
        else{
            System.out.println("Лошать это не будет есть!!!");
        }
    }
}
