package animals;

import food.Food;

//утка
public class Duck extends Herbivore implements Run, Swim, Voice{
    String voice = "Кря - кря.";
    @Override
    public void run(){
        System.out.println("Утка ходит по берегу: " + voice);
    }
    @Override
    public void swim(){
        System.out.println("Утка плавает в пруду.");
    }
    @Override
    public void getVoice(String voice){
        System.out.println("Утка издает звук.");
    }
    @Override
    public void eat(Food food){

    }
}
