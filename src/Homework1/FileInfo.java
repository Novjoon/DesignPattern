package Homework1;

import java.util.Date;

public class FileInfo {
	String name;
	String type;
	int size;
	Date modifiedDate;

	@Override
	public String toString() {
		return "FileInfo [name=" + name + ", type=" + type + ", size=" + size + ", modifiedDate=" + modifiedDate + "]";
	}

	public FileInfo(String name, String type, int size, Date modifiedDate) {
		this.name = name;
		this.type = type;
		this.size = size;
		this.modifiedDate = modifiedDate;
	}
	
	public FileInfo() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public int getSize() {
		return size;
	}
	
	public Date getModifiedDate() {
		return modifiedDate;
	}
	
}
