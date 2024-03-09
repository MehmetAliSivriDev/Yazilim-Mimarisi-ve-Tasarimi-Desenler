import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CityList {

    Date now = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    String timeString = dateFormat.format(now);

    public List<City> getCities(){

        System.out.println("Data loading, please wait...");

        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println(timeString);

        List<City> cities = new ArrayList<City>();

        cities.add(new City("İstanbul"));
        cities.add(new City("Ankara"));
        cities.add(new City("Kırklareli"));

        return cities;

    }
}
