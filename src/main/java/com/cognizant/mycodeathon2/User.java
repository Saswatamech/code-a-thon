package com.cognizant.mycodeathon2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    //*@GeneratedValue(strategy=GenerationType.AUTO)
    
    private Integer id;
    
    private Integer dollar20;

    private Integer dollar10;

    private Integer dollar5;
    
	private Integer dollar1;
    
    private Integer quarter;
    
    private Integer dime;
    
    private Integer penny;
    
   
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		System.out.println("id " + id);
		this.id = id;
	}

	public Integer getDollar20() {
		return dollar20;
	}

	public void setDollar20(Integer dollar20) {
		System.out.println("dollar20 " + dollar20);
		this.dollar20 = dollar20;
	}

	public Integer getDollar10() {
		return dollar10;
	}

	public void setDollar10(Integer dollar10) {
		System.out.println("dollar10 " + dollar10);
		this.dollar10 = dollar10;
	}

	public Integer getDollar5() {
		return dollar5;
	}

	public void setDollar5(Integer dollar5) {
		System.out.println("dollar5 " + dollar5);
		this.dollar5 = dollar5;
	}

	public Integer getDollar1() {
		return dollar1;
	}

	public void setDollar1(Integer dollar1) {
		System.out.println("dollar1 " + dollar1);
		this.dollar1 = dollar1;
	}

	public Integer getQuarter() {
		return quarter;
	}

	public void setQuarter(Integer quarter) {
		System.out.println("quarter " + quarter);
		this.quarter = quarter;
	}

	public Integer getDime() {
		return dime;
	}

	public void setDime(Integer dime) {
		System.out.println("dime " + dime);
		this.dime = dime;
	}

	public Integer getPenny() {
		return penny;
	}

	public void setPenny(Integer penny) {
		System.out.println("penny " + penny);
		this.penny = penny;
	}
	
	

	

}

