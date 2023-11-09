package com.pluralsight;
import java.util.Scanner;

import static com.pluralsight.Dealership.inventory;

public class UserInterface {
    static Scanner myScanner = new Scanner(System.in);
    Dealership dealership= new Dealership("SA Motors","Charlotte, NC", "1-800-5555");

    public UserInterface(){

    }
    public void display(){

    }
    public void processGetByPriceRequest(){

    }
    public void processGetByMakeModelRequest(){

    }
    public void processGetByYearRequest(){

    }
    public static void processGetByColorRequest(){
        System.out.println("Enter the color: ");
        String color = myScanner.nextLine();

        for (Vehicle vehicle: inventory){
            if(vehicle.getColor().equalsIgnoreCase(color.trim())){
                System.out.println( "VIN: " + vehicle.getVin() + " | Model: " + vehicle.getModel() + " | Make: " + vehicle.getMake() + " | Type: " + vehicle.getType() +
                        " | Year: " + vehicle.getColor() + " | Color: " + vehicle.getColor() + " | Odometer: " + vehicle.getColor() + " | Price: " + vehicle.getColor());
            }
        }
    }
    public void processGetByMileageRequest(){

    }
    public void processGetByVehicleTypeRequest(){

    }
    public void processGetAllVehiclesRequest(){

    }
    public void processAddVehicleRequest(){

    }
    public void processRemoveVehicleRequest(){

    }

}