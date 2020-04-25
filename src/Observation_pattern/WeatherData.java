package Observation_pattern;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList observers;
    private float temp;
    private float humidity;
    private float perssure;
    public WeatherData(){
        observers =new ArrayList();
    }
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        int i=observers.indexOf(observer);
        if (i>0){
            observers.remove(i);
        }
    }
    public void notifyObservers(){
        for (int i=0;i<observers.size();i++){
            Observer observer= (Observer) observers.get(i);
            observer.update(temp,humidity,perssure);
        }
    }
    public void measurementsChange(){
        notifyObservers();
    }
    public void setmeasurements(float temp,float humidity,float perssure){
        this.temp=temp;
        this.humidity=humidity;
        this.perssure=perssure;
        measurementsChange();
    }
}