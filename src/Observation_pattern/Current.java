package Observation_pattern;

public class Current implements Observer,DisplayElement {
    private final Subject WeatherData;
    private float temp;
    private float humidity;
    public Current(Subject WeatherData){
        WeatherData.registerObserver(this);
        this.WeatherData=WeatherData;
    }
    public void update(float temp, float humidity, float pressure){
        this.temp=temp;
        this.humidity=humidity;
        display();
    }
    public void display(){
        System.out.println("Currert:"+temp+"F degrees and"+humidity+"% humidity");
    }

}
