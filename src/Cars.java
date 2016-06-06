import java.util.*;

public class Cars {

    float mTopSpeed;
    int mNumberOfDoors;

    public static void main(String[] args) {
        Cars toyonda = new Cars();
        toyonda.printDetails();
    }

    public Cars() {
        Random rand = new Random();
        //how to get rando float - http://stackoverflow.com/questions/6078157/random-nextfloat-is-not-applicable-for-floats
        float carTopSpeed = rand.nextFloat() * (250f - 50f) + 50f;
        int carNumberOfDoors = rand.nextInt(10);
        mTopSpeed = carTopSpeed;
        mNumberOfDoors = carNumberOfDoors;
    }

    public void printDetails() {
        System.out.println("Your car has a top speed of " + mTopSpeed + " mph, and for some reason has " + mNumberOfDoors + " doors.");

    }
}