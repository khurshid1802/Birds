package bird;

import medium.Pigeon;
import medium.Sparrow;
import medium.Swallow;
import notfly.Chicken;
import notfly.Ostrich;
import notfly.Penguin;
import prey.Eagle;
import prey.Falcon;
import prey.Kestrel;
import water.Hawk;
import water.Partridge;
import water.Sparrowhawk;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Birds[] birds = new Birds[200];
        Random random = new Random();

        for (int i = 0; i < 200; i++) {
            Thread.sleep(100);
            System.out.print(i+". ");
            int t = random.nextInt(11) +1;
            switch (t){
                case 1 ->{
                    birds[i] = new Pigeon( "Kabutar");
                    System.out.println(birds[i].name+"\n");
                    birds[i].fly();
                }
                case 2 ->{
                    Sparrow sparrow = new Sparrow("Chumchuq");
                    System.out.println(sparrow+"\n");
                }
                case 3 ->{
                    Swallow swallow = new Swallow("Qaldirg'och");
                    System.out.println(swallow+"\n");
                }
                case 4 ->{
                    Chicken chicken = new Chicken("Tovuq");
                    System.out.println(chicken+"\n");
                }
                case 5 ->{
                    Ostrich ostrich = new Ostrich("Tuyaqush");
                    System.out.println(ostrich+"\n");
                }
                case 6 ->{
                    Partridge partridge = new Partridge("Tustovuq");
                    System.out.println(partridge+"\n");
                }
                case 7 ->{
                    Eagle eagle = new Eagle("Burgut");
                    System.out.println(eagle+"\n");
                }
                case 8 ->{
                    Falcon falcon = new Falcon("Lochin");
                    System.out.println(falcon+"\n");
                }
                case 9 ->{
                    Hawk hawk = new Hawk("Qirg'iy");
                    System.out.println(hawk+"\n");
                }
                case 10 ->{
                    Kestrel kestrel = new Kestrel("Tasqara");
                    System.out.println(kestrel+"\n");
                }
                case 11 ->{
                    Sparrowhawk sparrowhawk = new Sparrowhawk("Chag'alak");
                    System.out.println(sparrowhawk+"\n");
                }
                case 12 ->{
                    Penguin penguin = new Penguin("Pingvin");
                    System.out.println(penguin+"\n");
                }
            }
        }
    }
}