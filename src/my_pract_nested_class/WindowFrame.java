package my_pract_nested_class;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowFrame {
	public static void main(String[] args) {
		
		Frame frame=new Frame();
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				
				System.out.println(" window closing ");
				System.exit(0);
				
			}
			
			
		});
		frame.add(new Label("hello  every one"));

		frame.setSize(2000,2000);
		frame.setVisible(true);
	}

}
