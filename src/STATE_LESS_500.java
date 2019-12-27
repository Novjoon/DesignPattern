public class STATE_LESS_500 implements State {
	MainWindow mw;

	public STATE_LESS_500(MainWindow mw) {
		this.mw = mw;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void returnChanges() {
		// TODO Auto-generated method stub
		mw.setState(mw.State_0);
		mw.setMsgText("" + mw.getBalance() + "원을 반환합니다");
		mw.setBalance(0);
		mw.setBalanceText();
	}

	@Override
	public void selectBeverage() {
		// TODO Auto-generated method stub
		mw.setMsgText("1000원 이상을 넣은 후에 눌러주세요");
	}

	@Override
	public void addHundred() {
		// TODO Auto-generated method stub
		mw.setBalance(mw.getBalance() + 100);
		mw.setState(mw.State_500);
		mw.setBalanceText();

	}

	@Override
	public void addFiveHundred() {
		// TODO Auto-generated method stub
		mw.setBalance(mw.getBalance() + 500);
		mw.setState(mw.State_Less_1000);
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
