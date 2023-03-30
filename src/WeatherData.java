import java.lang.reflect.Array;
import java.util.ArrayList;

public class WeatherData implements Subject{
    private static ArrayList<Observer> observer = new ArrayList<Observer>();
    private String temperature;
    private String pressure;
    private String humidity;
    private String messuramentsChanged;

    public WeatherData(){}
    @Override
    public void registerObserver(Observer observer) {
        this.observer.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        this.observer.remove(observer);
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public void setMessuramentsChanged(String messuramentsChanged) {
        this.messuramentsChanged = messuramentsChanged;
    }

    public void notifyObserver(){
        for (int i=0;i<observer.size();i++){
            observer.get(i).update();
        }
    };
    public void getTemperature(){
        System.out.println("Esta es la temperatura "+this.temperature);
    };
    public void getHumidity(){
        System.out.println("Esta es la humedad: "+this.humidity);
    };
    public void getPressure(){
        System.out.println("Esta es la presión: "+this.pressure);
    };
    public void measurementsChanged(){
        System.out.println("Esta es la cambio en el terreno"+this.messuramentsChanged);
    };
}
