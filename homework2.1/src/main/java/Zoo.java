import animals.*;
import employee.Worker;
import food.*;


public class Zoo {


    public static void main(String[] args){

        Wolf wolf = new Wolf(); //волк
        Owl owl = new Owl(); //филин
        Hawk hawk = new Hawk(); //ястреб
        Horse horse = new Horse(); //лошать
        Fish fish = new Fish(); //рыба
        Duck duck = new Duck(); //утка

        Worker worker = new Worker(); //работник

        Food food = new Food();//еда
        Grass grass = new Grass();//трава
        Meat meat = new Meat();//мясо

        duck.eat(grass);
        duck.getVoice();
        duck.run();
        duck.swim();

        System.out.println("************************************************************");

        wolf.eat(meat);
        wolf.getVoice();
        wolf.run();

        System.out.println("************************************************************");

        owl.eat(meat);
        owl.getVoice();
        owl.fly();
        owl.run();

        System.out.println("************************************************************");

        hawk.eat(meat);
        hawk.getVoice();
        hawk.fly();
        hawk.run();

        System.out.println("************************************************************");

        horse.eat(grass);
        horse.getVoice();
        horse.run();

        System.out.println("************************************************************");

        fish.eat(grass);
        fish.swim();

        System.out.println("************************************************************");

        worker.getVoice(duck);
        worker.getVoice(owl);
        worker.getVoice(hawk);
        worker.getVoice(horse);
        worker.getVoice(duck);
        //worker.getVoice(fish);

        System.out.println("************************************************************");

        worker.feed(duck,meat);
        worker.feed(duck,grass);
        worker.feed(owl, grass);
        worker.feed(owl,meat);
        worker.feed(hawk, meat);
        worker.feed(hawk, grass);
        worker.feed(horse, meat);
        worker.feed(horse,grass);
        worker.feed(fish, meat);
        System.out.println("************************************************************");
        for(Animals a: createPond()){
            a.swim();
        }

        }
    public static Animals[] createPond() {
        Animals[] pond = new Animals[2];
        pond[0] = new Duck();
        pond[1] = new Fish();
        return pond;

    }
}