package model;

abstract class Account {
    
    private String number, bank = "Banco do Brasil";
    private float balance = 100;
    private boolean status = true;

    public String getBank() {
        return bank;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public abstract void withdraw(float value);

    public abstract void deposit(float value);

    public abstract void extract();

}
