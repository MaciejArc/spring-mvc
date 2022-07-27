package pl.nowak.springmvc.dto.weatherDto;


public class WeatherDto {
    private WeatherMain main;
    private WeatherWind wind;


    public WeatherWind getWind() {
        return wind;
    }

    public WeatherMain getMain() {
        return main;
    }
}
