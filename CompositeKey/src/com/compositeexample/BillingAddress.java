package com.compositeexample;

import java.io.Serializable;

import javax.persistence.Embeddable;
 
@Embeddable
public class BillingAddress implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String street;
    private String city;
 
    public BillingAddress() {}
 
    public BillingAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }
 
    public String getStreet() {
        return street;
    }
 
    public void setStreet(String street) {
        this.street = street;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
     
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!this.getClass().equals(obj.getClass())) return false;
         
        BillingAddress obj2 = (BillingAddress)obj;
 
        if (this.street.equals(obj2.getStreet()) &&
            this.city == obj2.getCity()) {
            return true;
        }
        return false;
    }
 
    public int hashCode() {      
        int tmp = 0;
        tmp = (street + city).hashCode();
        return tmp;
    }
}