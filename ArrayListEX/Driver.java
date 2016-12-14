import java.util.ArrayList;
public class Driver
{

    public static void main(String[] args)
    {
        //declares list
        ArrayList <Animal> myAnimals = new ArrayList<Animal>();
        int myRand = 0;
        //adds cat or dog to list
        for(int i  = 0; i < 5; i++)
        {
            myRand = (int) (Math.random()*2)+1;
            //adds dog to list
            if(myRand == 1)
            {
                Dog dog = new Dog();
                myAnimals.add(dog);
            }
            //adds dog to list
            if(myRand == 2)
            {

            }

        }
        // You can also add items at certain points of the like so
        Cat cat1 = new Cat();
        myAnimals.add(0,cat1);

        //you can also replace items by this line
        Dog dog1 = new Dog();
        myAnimals.set(0,dog1);

        //.remove removes item from list
        myAnimals.remove(0);
        //check for final size 
        int finalsize = myAnimals.size();
        //Use this when you want access a random item from your list.
        int rand1 = (int) Math.random()*myAnimals.size();
    }

}
