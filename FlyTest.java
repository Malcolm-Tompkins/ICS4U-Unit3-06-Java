/*
* This program test classes.
*
* @author  Malcolm Tompkins
* @version 1.0
* @since    2021-12-30
*/

/**
* FlyTest.
*/
final class FlyTest {
    /**
    * Constant.
    */
    public static final int SPEED1 = 209;

    /**
    * Constant.
    */
    public static final int SPEED2 = 456;

    /**
    * Constant.
    */
    public static final int FOUR = 4;

    /**
    * Constant.
    */
    public static final int FIVE_THOUSAND = 5000;

    /**
     * Prevent instantiation
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private FlyTest() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Main.
    *
    * @param args are null.
    */
    public static void main(String[] args) {
        final Airplane jet1 = new Airplane();
        jet1.setSpeed(SPEED1);
        System.out.println("The speed of the first jet is: "
                + jet1.getSpeed());
        final Jet jet2 = new Jet();
        jet2.setSpeed(SPEED2);
        System.out.println("The speed of the second jet is: "
                + jet2.getSpeed());
        int counter = 0;
        while (counter < FOUR) {
            jet2.accelerate();
            System.out.println(jet2.getSpeed());
            if (jet2.getSpeed() > FIVE_THOUSAND) {
                biplane.setSpeed(biplane.getSpeed() * 2);
            } else {
                jet2.accelerate();
            }
            counter++;
        }
        System.out.println(jet1.getSpeed());
    }
}
