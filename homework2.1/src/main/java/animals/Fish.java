package animals;

import food.Food;

//рыба
public class Fish extends Herbivore implements Swim {
    @Override
    public void swim(){
        System.out.println("Рыба плавает в пруду.");
    }
    @Override
    public void eat(Food food){

    }
}
