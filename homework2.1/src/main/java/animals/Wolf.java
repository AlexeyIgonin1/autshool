package animals;

import food.Food;

//волк
public class Wolf extends Carnivorous implements Voice, Run {
    String voice = "Аааа - уууу.";

    @Override
    public void getVoice(String voice){

        System.out.println("Волк воет: " + voice);
    }
    @Override
    public void run() {
        System.out.println("Волк бегает по волъеру.");
    }
    @Override
    public void eat(Food food){

    }
}
