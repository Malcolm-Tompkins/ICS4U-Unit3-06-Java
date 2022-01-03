/*
* This program is a Airplane class.
*
* @author  Malcolm Tompkins
* @version 1.0
* @since   2021-12-29
*/

/**
 * Airplane.
 */
public class Airplane {
    /**
    * Speed variable.
    */
    private int speed;

    /**
    * Construct.
    */
    public Airplane() {
        speed = 0;
    }

    /**
    * Setter.
    *
    * @param newSpeed discription.
    */
    public void setSpeed(final int newSpeed) {
        this.speed = newSpeed;
    }

    /**
    * Getter.
    *
    * @return returnValue good.
    */
    public int getSpeed() {
        return this.speed;
    }
}
