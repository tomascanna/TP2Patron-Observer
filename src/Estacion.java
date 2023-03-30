public class Estacion {
    public void consultarClima(WeatherData wd){
        wd.notifyObserver();
        wd.getHumidity();
        wd.getPressure();
        wd.getTemperature();
        wd.measurementsChanged();
    }
}
