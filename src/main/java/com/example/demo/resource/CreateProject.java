package com.example.demo.resource;

public class CreateProject {
	public String email;
	public String title;
	public String description;
	public CreateProject()
	{
		
	}
	public CreateProject(String email,String title,String description)
	{
		super();
		this.email=email;
		this.title=title;
		this.description=description;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description=description;
	}
}
