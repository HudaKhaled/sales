package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFileChooser;

import com.frame.inputPage;

//package model;
//
public class FileOperations extends inputPage{
void openFile() {
	FileInputStream fis= null;
	JFileChooser fc = new JFileChooser();
	int result = fc.showSaveDialog(this);
	if (result == JFileChooser.APPROVE_OPTION) {
		String path = fc.getSelectedFile().getPath();
		try {
		 fis = new FileInputStream(path);
		int size = fis.available();
		byte[] b = new  byte[size];
		fis.read(b);
		infoTA.setText(new String (b));
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
}
		finally  {
			try {
			fis.close();}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}} 
		//catch(IOException e){}
	}
}

void saveFile() {
	JFileChooser fc = new JFileChooser();
	int result = fc.showOpenDialog(this);
	if (result == JFileChooser.APPROVE_OPTION) {
		String path = fc.getSelectedFile().getPath();
		FileOutputStream fos = null;
		try {
			 fos = new FileOutputStream(path);
			 byte[] b = CustomerNameTF.getText().getBytes();
			 byte[] c = itemNameTF.getText().getBytes();
			 byte[] d = invoiceNumTF.getText().getBytes();
			 byte[] e = invoiceDateTF.getText().getBytes();
			 byte[] f = itemPriceTF.getText().getBytes();
			 byte[] g = CountTF.getText().getBytes();
			 byte[] h = infoTA.getText().getBytes();

			// b = itemNameTF.getText().getBytes();
			 fos.write(b);
			 fos.write(c);
			 fos.write(d);
			 fos.write(e);
			 fos.write(f);
			 fos.write(g);
			 fos.write(h);
			

			 
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
}
		finally  {
			try {
			fos.close();}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	}
}
}
//}
