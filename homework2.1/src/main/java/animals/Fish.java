package animals;

import food.Food;
import food.Grass;

//рыба
public class Fish extends Carnivorous implements Swim {

    public void swim(){
        String pl = "Рыба плавает в пруду.";
        System.out.println(pl);

    }

    public void eat(Food food){
        String grass = "Рыба ест корм!!!";
        boolean isEat = food instanceof Grass;
        if(isEat) {
            System.out.println(grass);
        }
        else{
            System.out.println("Рыба это не будет есть!!!");
        }
    }
}
