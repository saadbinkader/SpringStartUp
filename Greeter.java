package net.therap.spring;

/**
 * Created with IntelliJ IDEA.
 * User: sk.saad
 * Date: 7/30/13
 * Time: 2:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Greeter {
    private Time time;

    public void setTime( Time time ) {
        this.time = time;
    }

    public void greet() {
        String currentTime = time.getCurrentTime();
        int hour = Integer.parseInt(currentTime.substring(0, 2));
        if ( hour < 12 )
            System.out.println( "Good Morning!!" );
        else if ( hour <  18 )
            System.out.println( "Good Afternoon!!" );
        else if ( hour < 21 )
            System.out.println( "Good Evening!!" );
        else
            System.out.println( "Good Night!!" );
    }
}
