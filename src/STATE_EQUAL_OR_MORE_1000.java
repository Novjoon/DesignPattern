public class STATE_EQUAL_OR_MORE_1000 implements State {
	MainWindow mw;

	public STATE_EQUAL_OR_MORE_1000(MainWindow mw) {
		this.mw = mw;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void returnChanges() {
		// TODO Auto-generated method stub
		mw.setState(mw.State_0);
		mw.setMsgText("" + mw.getBalance() + "���� ��ȯ�մϴ�");
		mw.setBalance(0);
		mw.setBalanceText();

	}

	@Override
	public void selectBeverage() {
		// TODO Auto-generated method stub
		String msg = "���Ḧ �������ϴ�. ���ⱸ�� Ȯ���ϼ���.";
		mw.setBalance(mw.getBalance() - 1000);
		if (mw.getBalance() > 0) {
			msg = msg + " �Ž����� " + mw.getBalance() + "���� ��ȯ�մϴ�.";
			mw.setBalance(0);
		}
		mw.setBalanceText();
		mw.setMsgText(msg);
		mw.setState(mw.State_0);

	}

	@Override
	public void addHundred() {
		// TODO Auto-generated method stub
		mw.setBalance(mw.getBalance() + 100);
		mw.setState(mw.State_Eqal_Or_More_1000);
		mw.setBalanceText();

	}

	@Override
	public void addFiveHundred() {
		// TODO Auto-generated method stub
		mw.setBalance(mw.getBalance() + 500);
		mw.setState(mw.State_Eqal_Or_More_1000);
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
