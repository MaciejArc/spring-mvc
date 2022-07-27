package pl.nowak.springmvc.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.nowak.springmvc.dto.Weather;
import pl.nowak.springmvc.service.WeatherService;
import pl.nowak.springmvc.dto.weatherDto.WeatherDto;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class WeatherController {

private WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    public String chuck(Model model, HttpServletRequest request){
        String country = request.getParameter("country");

        Weather weather;
        if (country==null){
            weather = weatherService.getWeather("Polska");
        }else {
            weather = weatherService.getWeather(country);
        }
        model.addAttribute("weather",weather.toString());
        return "weather";
    }
}
