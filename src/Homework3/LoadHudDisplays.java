package Homework3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadHudDisplays implements LoadDisplayInterface {

	ArrayList<String> list1 = new ArrayList<String>();
	String line = "";

	@Override
	public ArrayList<String> load(String fname) {
		// TODO Auto-generated method stub
		BufferedReader bRead;
		try {
			bRead = new BufferedReader(new FileReader(fname));
			String line="";
			try {
				System.out.println("¿©±â´ÙÀ×");
				while (true) {
					line = bRead.readLine();
					if(line==null)
						break;
					System.out.println(line);
					list1.add(line);
				}
				bRead.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list1;
	}

}
