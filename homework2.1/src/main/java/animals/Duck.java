package animals;

import food.Food;
import food.Grass;


//утка
public class Duck extends Herbivore implements Run, Swim, Voice{
    private String voice = "Кря - кря.";

    public void setVoice(String voice){
        this.voice = voice;
    }

    @Override
    public void run(){
        System.out.println("Утка ходит по берегу!" );
    }
    public void swim(){
        String pl = "Утка плавает в пруду.";
        System.out.println(pl);
    }
    @Override
    public String getVoice(){
       // System.out.println("Утка издает звук: "+ voice);
        return "Утка издает звук: "+ voice;
    }
    @Override
    public void eat(Food food){
        //String grass = "Утка кушает траву!!!";
       // boolean isEat = food instanceof Grass;
        if(food instanceof Grass) {
            System.out.println("Утка кушает траву!!!");
            satiety =+ getEnergy(food);
        }
        else{
            System.out.println("Утка недовольно крякает!!!");
        }
    }


}
