package com.pfariasmunoz.firsthibernateproj.dto;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

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
    
    @ManyToOne
    @NotFound(action = NotFoundAction.IGNORE)
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
