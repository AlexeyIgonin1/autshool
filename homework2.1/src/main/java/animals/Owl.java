package animals;

import food.Food;
import food.Grass;
import food.Meat;

//филин
public class Owl extends Animals implements Voice, Run, Fly{
    private String voice =  "Уффф - уфф - уфф.";
    public void setVoice(String voice){
        this.voice = voice;
    }
    @Override
    public String getVoice(){
        //System.out.println("Филин издает звук: " + voice);
        return "Филин издает звук: " + voice;
    }
    @Override
    public void run(){
        System.out.println("Филин ходит по вальеру.");
    }
    @Override
    public void fly(){
        System.out.println("Филин летает.");
    }
    @Override
    public void eat(Food food){
        String meat = "Филин кушает мясо!!!";
        boolean isEat = food instanceof Meat;
        if(isEat) {
            System.out.println(meat);
        }
        else{
            System.out.println("Филин будет голодный!!!");
        }
    }
}
