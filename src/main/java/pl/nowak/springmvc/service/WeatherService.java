package pl.nowak.springmvc.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import pl.nowak.springmvc.dto.Weather;
import pl.nowak.springmvc.dto.weatherDto.WeatherDto;

import java.util.HashMap;
import java.util.Map;


@Configuration
public class WeatherService {
    private final String apiKey = "540275d90cd207e3a249a20ab7c65f33";
    private final String HttpApi = "https://api.openweathermap.org/data/2.5/weather?";

    public Weather getWeather(String country){
        Map<String, String> map = mapInit();

        RestTemplate rest = new RestTemplate();
        WeatherDto weatherDto = rest.getForObject(HttpApi + map.get(country) + "&appid=" + apiKey + "&units=metric&lang=pl", WeatherDto.class);

        return new Weather(weatherDto.getMain().getTemp(),weatherDto.getWind().getSpeed(),weatherDto.getMain().getPressure());

    }

    public Map<String,String> mapInit (){
     Map<String,String> country = new HashMap<>();
     country.put("Polska","lat=52&lon=19");
     country.put("Hiszpania","lat=40&lon=-3");
     country.put("Japonia","lat=35&lon=137");
     return country;

    }

}
