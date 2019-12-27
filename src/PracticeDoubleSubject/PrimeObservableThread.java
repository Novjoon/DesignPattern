package PracticeDoubleSubject;

import java.util.ArrayList;


public class PrimeObservableThread implements Runnable, Subject {
	private static final int SLEEPTIME = 500;

	private int primeNumber;
	private int numCount;
	private boolean first = true;
	private boolean stopRunning = false;

	private ArrayList observers;

	public PrimeObservableThread() {
		observers = new ArrayList();
	}

	public int getPrimeNumber() {
		return primeNumber;
	}

	public void stopRunning() {
		stopRunning = true;
	}

	public void startRunning() {
		stopRunning = false;
		run();
	}

	private void generatePrimeNumber() {
		while (stopRunning == false) {
			if (first) {
				first = false;
				primeNumber = 2; // ù ��° �Ҽ��� 2
				System.out.println(primeNumber);
				numCount = 1; // ���� �ܰ���ʹ� 2�� ���ؼ� Ȧ���� Ȯ���ϹǷ� 1�� �ٲ㼭 ���� ���ڸ� 3���� ������ ��
			} else {
				numCount += 2; // 2�� ������ ¦���� �Ҽ��� �� �� ����. ���� Ȧ���� �˻�
				if (isPrimeNumber(numCount)) {
					primeNumber = numCount;
					System.out.println(primeNumber);
				}
			}
			try {
				Thread.sleep(SLEEPTIME);// 1�� ��
				notifyObservers();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private boolean isPrimeNumber(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		// TODO Auto-generated method stub

	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.updateText(""+getPrimeNumber());
		}
	}

	@Override
	public void run() {
		generatePrimeNumber();
	}
	
	
}
