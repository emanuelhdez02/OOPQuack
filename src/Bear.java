public class Bear extends Animal{
    public String name;
    public String favoriteFood;

    //Constructor
    public Bear(String name) {
        super(name, "fish");
    }

    public void sleep() {
        System.out.println(name + " hibernates for 4 months");
    }

    public void eat(String food){

        System.out.println(this.name + " eats " + food);

        if( food == favoriteFood){

            System.out.println("YUM!!! "+ this.name + " wants more " + food);

        }else{

            sleep();

        }

    }
}


