package Homework1;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    String[] names = { "CompareModifiedDate", "CompareFileType", "CompareFileName", "Main", "CompareSize"  };
    String[] types = { "java", "java", "class", "java", "Class" };
    int[] sizes = { 120, 80, 150, 85, 100 };
    String[] dateStrings = { "2019-09-13T21:59:00", "2019-09-12T21:59:00",
                             "2019-09-13T16:54:00", "2019-09-12T21:54:00", "2019-09-13T11:59:00" };

    // �տ��� ���ǵ� ���� �̸�, Ÿ��, ũ��, ��¥ ������ �̿��ؼ� FileInfo �迭 ���� 
    public FileInfo[] createFileInfoArrays() {
        FileInfo[] fileLists = new FileInfo[names.length];
        SimpleDateFormat dateTimeInstance = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        for (int i = 0; i < fileLists.length; i++) {
            Date date = dateTimeInstance.parse(dateStrings[i], new ParsePosition(0));
            fileLists[i] = new FileInfo(names[i], types[i], sizes[i], date);
        }
        return fileLists;
    }

    public void printFileLists(FileInfo[] fileLists) {
    	for (int i=0; i<fileLists.length; i++) 
    	System.out.println(fileLists[i].getName()+"\n"+fileLists[i].getSize()+"\n"+fileLists[i].getType()+"\n"+fileLists[i].getModifiedDate()+"\n");
        // �ڵ� �߰�
    }

    public static void main(String[] args) {
        Main m = new Main();
        FileInfo[] fileLists = m.createFileInfoArrays();
        System.out.println("���� ����Ʈ");
        m.printFileLists(fileLists);

        System.out.println("--------------------------");
        System.out.println("�̸����� ����Ʈ");
        Sorter sort = new Sorter();
        FileInfo[] nameList = (FileInfo[]) sort.bubbleSort(fileLists);
        m.printFileLists(nameList);

        System.out.println("--------------------------");
        System.out.println("Ÿ������ ����Ʈ");
        sort.setCompare(new Typesort());
        FileInfo[] typeList = (FileInfo[]) sort.bubbleSort(fileLists);
        m.printFileLists(typeList);
        
        System.out.println("--------------------------");
        System.out.println("���������� ����Ʈ");
        sort.setCompare(new Sizesort());
        FileInfo[] sizeList = (FileInfo[]) sort.bubbleSort(fileLists);
        m.printFileLists(sizeList);
        
        System.out.println("--------------------------");
        System.out.println("��¥���� ����Ʈ");
        sort.setCompare(new Datesort());
        FileInfo[] dateList = (FileInfo[]) sort.bubbleSort(fileLists);
        m.printFileLists(dateList);
        // ������ �ڵ� �߰�
    }
}
