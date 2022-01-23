package com.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String userName;
    private String password;
    private String city;
    private String psid;

    public User() 
    {
    	
    }

	public User(int userId, String userName, String password, String city, String psid) 
	{
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.city = city;		this.psid = psid;
	}

	public int getUserId() 
	{
		return userId;
	}

	public void setUserId(int userId) 
	{
		this.userId = userId;
	}

	public String getUserName() 
	{
		return userName;
	}

	public void setUserName(String userName) 
	{
		this.userName = userName;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

	public String getPsid() 
	{
		return psid;
	}

	public void setPsid(String psid) 
	{
		this.psid = psid;
	}
    
    
  
}
