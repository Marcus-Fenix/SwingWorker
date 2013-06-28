import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;


public class WorkerFrame extends JFrame {
	
	public static JLabel txtResultadoWorker;
	private SwingWorkerEjemplo w;
	private JButton btn;
	private JProgressBar bar;
	private JTextField txt;
	
	public WorkerFrame(){
		this.setTitle("Ejemplo Worker");
		this.setSize(500, 500);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		txtResultadoWorker = new JLabel("Resultado de Worker Aqui");
		txtResultadoWorker.setBounds(50, 20, 300, 100);
		txt = new JTextField();
		txt.setBounds(50, 200, 300, 30);
		this.add(txt);
		this.add(this.txtResultadoWorker);
		btn = new JButton("Ejecutar");
		bar = new JProgressBar(0,100);
		bar.setBounds(50, 300, 300, 50);
		this.add(bar);
		btn.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				w = new SwingWorkerEjemplo(bar);
				w.start = true;
				w.execute();
			}
		});
		btn.setBounds(100, 100, 100, 100);
		this.add(btn);
	}

}
