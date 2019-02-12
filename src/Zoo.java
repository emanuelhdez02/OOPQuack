public class Zoo {
    String favoriteFood = "bacon";

    public static void main(String[] args) {
//        Zoo lol = new Zoo();
//        lol.sleep("Tigger");
//        Zoo pol = new Zoo();
//        pol.eat("Tigger", "meat");
//        pol.eat("Tigger", "bacon");
//        Tiger tigger = new Tiger("Scoop");
//        tigger.eat("meat");
//        tigger.eat("kibble");
//        tigger.eat("pasta");
//
//        Bear pooh = new Bear("Pooh");
//        pooh.eat("fish");
//        pooh.eat("lasgana");

    }

    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String name, String food){
        System.out.println(name + " eats " + food);
        if( food == favoriteFood){
            System.out.println("YUM!!! Tigger wants more bacon");
        }else{
            sleep(name);
        }
    }

}


