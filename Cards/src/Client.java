
public class Client {
	private int money;
	
	public Client(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void showMoney() {
		System.out.println("Ваш баланс после игры равен 0.");
	}
}
