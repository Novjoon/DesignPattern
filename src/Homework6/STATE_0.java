package Homework6;

public class STATE_0 implements State {
	MainWindow mw;

	public STATE_0(MainWindow mw) {
		this.mw = mw;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void returnChanges() {
		// TODO Auto-generated method stub
		mw.setMsgText("");
	}

	@Override
	public void selectBeverage() {
		// TODO Auto-generated method stub
		mw.setMsgText("돈을 넣은 후에 눌러주세요");
	}

	@Override
	public void addHundred() {
		// TODO Auto-generated method stub
		mw.setBalance(mw.getBalance() + 100);
		mw.setState(mw.State_Less_500);
		mw.setBalanceText();
	}

	@Override
	public void addFiveHundred() {
		// TODO Auto-generated method stub
		mw.setBalance(mw.getBalance() + 500);
		mw.setState(mw.State_500);
		mw.setBalanceText();
	}

	@Override
	public void addThousand() {
		// TODO Auto-generated method stub
		mw.setBalance(mw.getBalance() + 1000);
		mw.setState(mw.State_Eqal_Or_More_1000);
		mw.setBalanceText();
	}

}
