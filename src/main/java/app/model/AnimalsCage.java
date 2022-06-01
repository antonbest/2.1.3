package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private Animal animal;
    private Animal animal2;
    private Timer timer;

    public AnimalsCage(@Qualifier("dog") Animal animal,@Qualifier("cat") Animal animal2,@Qualifier("timer") Timer timer){
        this.animal=animal;
        this.animal2=animal2;
        this.timer=timer;


    }


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }


    public Timer getTimer() {
        return timer;
    }


}
