package animals;

import food.Food;

//лошадь
public class Horse extends Herbivore implements Run, Voice {
    String voice = "Ииии - го - го";
    @Override
    public void run(){

        System.out.println("Лошадь бегает, ходит.");
    }
    @Override
    public void getVoice(String voice){
        System.out.println("Лошать издает звук: " + voice);
    }
    @Override
    public void eat(Food food){

    }
}
