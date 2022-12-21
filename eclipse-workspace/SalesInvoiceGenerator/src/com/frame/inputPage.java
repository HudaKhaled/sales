package com.frame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class inputPage extends JFrame implements ActionListener{

	protected JButton saveBtn ;
	protected JButton openBtn ;

	//private JTable table;
	protected JTextField invoiceNumTF;
	protected JTextField invoiceDateTF;

	protected JTextField CustomerNameTF;

	protected JTextField itemNameTF;
	protected JTextField itemPriceTF;
	protected JTextField CountTF;
	protected JTextArea  infoTA;


public inputPage() {
	super ("Invoice  Details");
	invoiceNumTF = new JTextField(10);
	add(new JLabel("invoice num: "));
	add(invoiceNumTF);
	
	invoiceDateTF = new JTextField(10);
	add(new JLabel("invoice date: "));
	add(invoiceDateTF);
	
	CustomerNameTF = new JTextField(10);
	add(new JLabel("customer name: "));
	add(CustomerNameTF);
	
	itemNameTF = new JTextField(12);
	add(new JLabel("item name: "));
	add(itemNameTF);
	
	itemPriceTF = new JTextField(15);
	add(new JLabel("item price: "));
	add(itemPriceTF);
	
	CountTF = new JTextField(10);
	add(new JLabel("count: "));
	add(CountTF);
	
	saveBtn = new JButton("save");
	add(saveBtn);
	saveBtn.setActionCommand("s");
	saveBtn.addActionListener(this);
	
	openBtn = new JButton("open");
	add(openBtn);
	openBtn.setActionCommand("o");
	openBtn.addActionListener(this);
	
	infoTA = new JTextArea(5, 15);
	add(new JLabel("invoice info: "));
	add(new JScrollPane(infoTA));

	add(infoTA);

	//btn.addActionListener(this);
	setVisible(true);
	setSize(500,500);
	setLocation(700,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new FlowLayout());
}

//
//public static void main(String[] args) {
//	inputPage f = new inputPage();
//	
//}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	switch (e.getActionCommand()) {
	case "s":
		saveFile();
		break;
		
	case "o":
		openFile();
		break;
	}
	
}

void openFile() {
	FileInputStream fis= null;
	JFileChooser fc = new JFileChooser();
	int result = fc.showOpenDialog(this);
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