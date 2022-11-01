import com.skillbox.airport.Airport;

public class Main
{
    public static void main(String[] args)
    {
        Airport Savino = Airport.getInstance();

        //System.out.println(Savino.getAllAircrafts()); // работает, но всё в одну строку

        for (int i = 0; i < Savino.getAllAircrafts().size(); i++)
        {
            System.out.println(Savino.getAllAircrafts().get(i));
        }
    }
}