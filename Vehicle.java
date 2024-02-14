import java.util.ArrayList;
import java.util.List;

interface Drivable<T> {
  void setAction (String actionType, T actionValue);
  T getActionValue();

  default void executeAction() {
    System.out.println("Performing Action For: " + getActionValue());
  }
}

public class Vehicle<T> implements Drivable<T>{
  private T vehicleID;
  private String vehicleType;
  private String actionType;
  private T actionValue;

  public Vehicle(){}
  public Vehicle(T vehicleID, String vehicleType, String actionType, T actionValue){
    super();
    this.vehicleID= vehicleID;
    this.vehicleType= vehicleType;
    this.actionType= actionType;
    this.actionValue= actionValue;
  }
  public T getActionValue(){return actionValue;}
  public void setActionValue(T actionValue){this.actionValue=actionValue;}

  @Override
  public void setAction(String actionType, T actionValue){
    this.actionType= actionType;
    this.actionValue= actionValue;
  }

  @Override
  public void executeAction(){
    System.out.println("Vehicle with ID:" + vehicleID + " of type " + vehicleType + " execution action: " + actionType + " | Value: " + actionValue);
  }

  public static <U> void executeAction(List<Drivable<?>> vehicles){
    vehicles.forEach(Drivable::executeAction);
  }

  public static void main(String[] args){
    Vehicle<Integer> car= new Vehicle<Integer>(1, "Car", "Drive", 60);
    Vehicle<String> bike= new Vehicle<String>("B2", "Bike", "Pedal", "Fast");
    Vehicle<String> bus= new Vehicle<String>("B3", "Bus", "Stop", "Next Station");

    List<Drivable<?>> vehicles= new ArrayList<>();
    vehicles.add(car);
    vehicles.add(bike);
    vehicles.add(bus);

    executeAction(vehicles);
  }
}
