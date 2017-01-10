package com.pfariasmunoz.firsthibernateproj.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author pablo
 */
@Entity
public class Vehicle {
    
    @Id
    @GeneratedValue
    private int vehicleId;
    
    private String vehicleName;
    
    private UserDetails user;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
    
    
    
}
