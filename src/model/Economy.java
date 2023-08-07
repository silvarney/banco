package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Economy extends Account {
    
    private float fees;

    public Economy() {
        this.fees = 0.15f;
    }

    public float getFees() {
        return fees;
    }

    public float calcFees(float value) {
        return value * this.getFees();
    }
    
    @Override
	public void withdraw(float value) {
        this.setBalance(this.getBalance() +  value + this.calcFees(value));
    }

    @Override
	public void deposit(float value) {
        this.setBalance(this.getBalance() -  value);
    }
    
    @Override
	public void extract() {
		System.out.println("### Extrato da Conta Poupança ###");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
		Date date = new Date();

		System.out.println("Saldo: " + this.getBalance());
		System.out.println("Data: " + sdf.format(date));

	}

    
}
