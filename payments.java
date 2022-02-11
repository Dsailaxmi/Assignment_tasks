package com.payments;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="paymentType", 
discriminatorType = DiscriminatorType.STRING)
@Entity(name="payments")
public class payments {

	@Id
	private int paymentsId;
	
	public int getPaymentsId() {
		return paymentsId;
	}
	public void setPaymentsId(int paymentsId) {
		this.paymentsId = paymentsId;
	}
	

}