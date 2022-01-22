package com.test.springboot;

public class swimCoach implements Coach{
	FortunateServices fs;
	String name;
	String email;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setFs(FortunateServices fs) {
		this.fs = fs;
	}

	@Override
	public String doWorkout() {
		// TODO Auto-generated method stub
		return "Swim 75m";
	}
	
	@Override
	public String doFortunate() {
		return fs.doFortunate();
	}
}
