package com.infy.dto;

public class DirectorDTO {
	
	private String directorId;
	private String directorName;
	private Integer bornIn;

	public String getDirectorId() {
		return directorId;
	}

	public void setDirectorId(String directorId) {
		this.directorId = directorId;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public Integer getBornIn() {
		return bornIn;
	}

	public void setBornIn(Integer bornIn) {
		this.bornIn = bornIn;
	}
	
	@Override
	public String toString() {
		return "Director: [Director Name: "+this.getDirectorName()+"]";
	}

}
