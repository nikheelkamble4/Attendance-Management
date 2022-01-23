package com.test.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attendance 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int attid;
    private String psid;
    private LocalDate attdate;
    private String con;
    private int hrs;
    
    public Attendance()
    {
    	
    }

	public Attendance(int attid, String psid, LocalDate attdate, String con, int hrs) 
	{
		this.attid = attid;
		this.psid = psid;
		this.attdate = attdate;
		this.con = con;
		this.hrs = hrs;
	}

	public int getAttid() 
	{
		return attid;
	}

	public void setAttid(int attid) 
	{
		this.attid = attid;
	}

	public String getPsid() 
	{
		return psid;
	}

	public void setPsid(String psid) 
	{
		this.psid = psid;
	}

	public LocalDate getAttdate() 
	{
		return attdate;
	}

	public void setAttdate(LocalDate attdate) 
	{
		this.attdate = attdate;
	}

	public String getCon() 
	{
		return con;
	}

	public void setCon(String con) 
	{
		this.con = con;
	}

	public int getHrs() 
	{
		return hrs;
	}

	public void setHrs(int hrs) 
	{
		this.hrs = hrs;
	}

    
}
