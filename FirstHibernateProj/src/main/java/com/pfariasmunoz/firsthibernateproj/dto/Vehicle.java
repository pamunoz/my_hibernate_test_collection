package com.pfariasmunoz.firsthibernateproj.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;

/**
 *
 * @author pablo
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "VEHICLE_TYPE",
        discriminatorType = DiscriminatorType.STRING
)
public class Vehicle implements Serializable {
    
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
