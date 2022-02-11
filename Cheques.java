package com.payments;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "chequeNo")
public class Cheques extends payments {

	@Column(name="chequeName")

	private String chequeName;

	public String getChequeName() {
		return chequeName;
	}

	public void setChequeName(String chequeName) {
		this.chequeName = chequeName;
	}
	
}
