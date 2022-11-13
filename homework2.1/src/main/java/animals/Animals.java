package animals;

import food.Food;
import food.Grass;

public class Animals implements Swim{
    int satiety = 0;

    public int getSatiety() {
        return satiety;
    }
    public int getEnergy(Food food){
        if(food instanceof Grass) {
            return 1;
        }
        else{
            return 2;
        }
    }

    public void eat(Food food){

    }
    public String getVoice() {
        return null;
    }

    @Override
    public void swim() {

    }
}
