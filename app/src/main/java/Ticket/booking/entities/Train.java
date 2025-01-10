package Ticket.booking.entities;

import java.util.List;
import java.util.Map;

public class Train {
    private String trainId;

    private String trainNo;

    private List<List<Integer>> seats;

    private Map<String, String> Station_Time;

    private List<String> stations;

    public Train(String trainId, String trainNo, List<List<Integer>> seats, Map<String, String> Station_Time, List<String> stations){
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.seats = seats;
        this.Station_Time = Station_Time;
        this.stations = stations;
    }

    public Train() {

    }

    public List<List<Integer>> getSeats(){
        return seats;
    }

    public void setSeats (List<List<Integer>> seats){
        this.seats = seats;
    }

    public String getTrainId(){
        return trainId;
    }

    public void setTrainId(){
        this.trainId = trainId;
    }

    public Map<String, String> getStation_Time(){
        return Station_Time;
    }

    public String getTrainNo(){
        return trainNo;
    }

    public void setTrainNo(String trainNo){
        this.trainNo = trainNo;
    }

    public void setStation_Time(Map<String, String> Station_Time){
        this.Station_Time = Station_Time;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations){
        this.stations = stations;
    }

    public String getTrainInfo(){
        return String.format("Train ID : %s Train No: %s", trainId, trainNo);
    }


}
