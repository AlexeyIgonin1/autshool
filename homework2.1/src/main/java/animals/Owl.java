package animals;

import food.Food;

//филин
public class Owl extends Animals implements Voice, Run, Fly{
    String voice =  "Уффф - уфф - уфф.";
    @Override
    public void Voice(String voice){
        System.out.println("Филин издает звук: " + voice);
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

    }
}
