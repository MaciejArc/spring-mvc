package pl.nowak.springmvc.dto;

public class Weather {
    private float temperature;
    private float windSpeed;
    private int pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public int getPressure() {
        return pressure;
    }

    public Weather() {
    }

    public Weather(float temperature, float windSpeed, int pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "temperature=" + temperature +
                ", windSpeed=" + windSpeed +
                ", pressure=" + pressure +
                '}';
    }
}
