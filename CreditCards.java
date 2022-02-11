package com.payments;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "cardNo")
public class CreditCards extends payments {
@Column(name="cardName")
private String cardName;

public String getCardName() {
	return cardName;
}

public void setCardName(String cardName) {
	this.cardName = cardName;
}

}
