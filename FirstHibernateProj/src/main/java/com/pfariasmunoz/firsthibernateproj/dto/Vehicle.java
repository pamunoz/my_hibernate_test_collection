package com.pfariasmunoz.firsthibernateproj.dto;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

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
    
    @ManyToMany(mappedBy = "vehicleList")
    private Collection<UserDetails> userlists = new ArrayList<>();

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

    public Collection<UserDetails> getUserlists() {
        return userlists;
    }

    public void setUserlists(Collection<UserDetails> userlists) {
        this.userlists = userlists;
    }
    
    
    
}
