package Rooms;
import Game.Runner;
import People.Person;


public class OnionRoom extends Room {

    public OnionRoom(int x, int y) {
        super(x, y);

    }
    /**
     * enters a special room with lots of onions.
     * @param x the Person entering
     */
    public void enterOnion(Person x)
    {
        System.out.println("It ain't ogre yet");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }


}
