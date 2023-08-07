package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Current extends Account {
    
    private float tax;
    private boolean card;

    public Current() {
        this.tax = 0.025f;
        this.card = false;
    }
    public float getTax() {
        return tax;
    }
    public void setTax(float tax) {
        this.tax = tax;
    }
    public boolean isCard() {
        return card;
    }
    public void setCard(boolean card) {
        this.card = card;
    }

    public float calcTax(float value) {
        return value * this.getTax();
    }

    @Override
	public void withdraw(float value) {
        this.setBalance(this.getBalance() + (value - this.calcTax(value)));
    }

    @Override
	public void deposit(float value) {
        this.setBalance(this.getBalance() - (value - this.calcTax(value)));
    }

    @Override
	public void extract() {
		System.out.println("### Extrato da Conta Corrente ###");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
		Date date = new Date();

        System.out.println("Saldo: "+this.getBalance());
		System.out.println("Cartão: "+this.isCard());
		System.out.println("Data: "+sdf.format(date));

	}
}
