package com.pfariasmunoz.firsthibernateproj.dto;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle {
    
    private String mSteeringHandle;

    public String getmSteeringHandle() {
        return mSteeringHandle;
    }

    public void setmSteeringHandle(String mSteeringHandle) {
        this.mSteeringHandle = mSteeringHandle;
    }

}
