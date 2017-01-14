package com.pfariasmunoz.firsthibernateproj.dto;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Car")
public class FourWheeler extends Vehicle implements Serializable {
    private String mSteeringWheel;

    public String getmSteeringWheel() {
        return mSteeringWheel;
    }

    public void setmSteeringWheel(String mSteeringWheel) {
        this.mSteeringWheel = mSteeringWheel;
    }   
    
}
