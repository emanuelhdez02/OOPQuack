public class Zoo {
    String favoriteFood = "bacon";

    public static void main(String[] args) {
//        Zoo lol = new Zoo();
//        lol.sleep("Tigger");
//        Zoo pol = new Zoo();
//        pol.eat("Tigger", "meat");
//        pol.eat("Tigger", "bacon");
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");


        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("pasta");


        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        rarity.eat("chips");


        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("leaves");
        gemma.eat("meat");

        Bee stinger = new Bee("Stinger");
        stinger.eat("pollen");

        Animal[] animals = {tigger, pooh, rarity, gemma, stinger};

        Zookeeper zoebot = new Zookeeper("Zoebot");

        zoebot.feedAnimals(animals, "tortas");

    }

//    public void sleep(String name) {
//        System.out.println(name + " sleeps for 8 hours");
//    }
//
//    public void eat(String name, String food){
//        System.out.println(name + " eats " + food);
//        if( food == favoriteFood){
//            System.out.println("YUM!!! Tigger wants more bacon");
//        }else{
//            sleep(name);
//        }
//    }

}


