public class Main {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();

        wd.registerObserver(new ForecastDisplay());
        wd.registerObserver(new CurrentConditionDisplay());
        wd.registerObserver(new ThirdPartyDisplay());
        wd.registerObserver(new StaticticsDisplay());

        wd.setHumidity("3");
        wd.setPressure("6");
        wd.setTemperature("24");
        wd.setMessuramentsChanged("400");
        Estacion e = new Estacion();
        e.consultarClima(wd);




    }
}