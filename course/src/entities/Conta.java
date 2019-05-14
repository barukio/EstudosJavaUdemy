package entities;

public class Conta {
	private int nc;
	private String nome;
	private double value;
	
	public Conta() {
	}
	public Conta(int nc, String nome, double initialValue) {
		this.nc = nc;
		this.nome = nome;
		deposit(initialValue);
	}
	
	public Conta(int nc, String nome) {
		this.nc = nc;
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public double getValue() {
		return value;
	}
	public int getNc() {
		return nc;
	}
	
	public void deposit(double amount) {
		value += amount;
	}
	public void withdraw(double amount) {
		value -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ nc
				+ ", Holder: "
				+ nome
				+ ", Balance: $ "
				+ String.format("%.2f", value);
	}
	
	
}
