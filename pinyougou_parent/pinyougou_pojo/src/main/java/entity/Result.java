package entity;

import java.io.Serializable;

public class Result implements Serializable{
	private boolean success;
	private String messges;
	public Result(boolean success, String messges) {
		super();
		this.success = success;
		this.messges = messges;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessges() {
		return messges;
	}
	public void setMessges(String messges) {
		this.messges = messges;
	}
	
	
	
	

}
