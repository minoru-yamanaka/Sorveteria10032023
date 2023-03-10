import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;

public class Tela1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtV1;
	private JTextField txtV2;
	private JTextField txtV3;
	private JTextField txtV4;
	private JTextField txtP4;
	private JTextField txtP3;
	private JTextField txtP2;
	private JTextField txtP1;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela1() {
		setTitle("Sorveteria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[158px][90px][10px][123px]", "[23px][24px][23px][24px][24px][23px][21px]"));
		
		JLabel txtTipoDoSorvete = new JLabel("Tipo de Sorvete");
		txtTipoDoSorvete.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(txtTipoDoSorvete, "cell 0 0,grow");
		
		JLabel lblSorveteDeFrutas = new JLabel("Sorvete de Frutas");
		lblSorveteDeFrutas.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(lblSorveteDeFrutas, "cell 0 1,grow");
		
		JLabel lblChocolatefrutas = new JLabel("Chocolate/Frutas");
		lblChocolatefrutas.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(lblChocolatefrutas, "cell 0 2,grow");
		
		txtV1 = new JTextField();
		contentPane.add(txtV1, "cell 1 1,growx,aligny bottom");
		txtV1.setColumns(10);
		
		txtV2 = new JTextField();
		txtV2.setColumns(10);
		contentPane.add(txtV2, "cell 1 2,growx,aligny top");
		
		txtV3 = new JTextField();
		txtV3.setColumns(10);
		contentPane.add(txtV3, "cell 1 3,growx,aligny bottom");
		
		txtV4 = new JTextField();
		txtV4.setColumns(10);
		contentPane.add(txtV4, "cell 1 4,growx,aligny bottom");
		
		JLabel lblBola = new JLabel("Bola");
		lblBola.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(lblBola, "cell 0 3,grow");
		
		JLabel lblPoteDe = new JLabel("Pote de 2 litros");
		lblPoteDe.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(lblPoteDe, "cell 0 4,grow");
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setForeground(new Color(0, 0, 0));
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(lblTotal, "cell 1 5,grow");
		
		txtP4 = new JTextField();
		txtP4.setColumns(10);
		contentPane.add(txtP4, "cell 3 4,growx,aligny bottom");
		
		txtP3 = new JTextField();
		txtP3.setColumns(10);
		contentPane.add(txtP3, "cell 3 3,growx,aligny bottom");
		
		txtP2 = new JTextField();
		txtP2.setColumns(10);
		contentPane.add(txtP2, "cell 3 2,growx,aligny top");
		
		txtP1 = new JTextField();
		txtP1.setColumns(10);
		contentPane.add(txtP1, "cell 3 1,growx,aligny bottom");
		
		JLabel lblQtde = new JLabel("Qtde");
		lblQtde.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(lblQtde, "cell 1 0,alignx left,growy");
		
		JLabel lblPreoUnitrio = new JLabel("Preço Unitário");
		lblPreoUnitrio.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(lblPreoUnitrio, "cell 3 0,alignx right,growy");
		
		txtTotal = new JTextField();
		txtTotal.setEnabled(false);
		txtTotal.setColumns(10);
		contentPane.add(txtTotal, "cell 3 5,growx,aligny top");
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//recebo os valores
				//int v1 = Integer.parseInt(txtV1.getText ());
				//int v2 = Integer.parseInt(txtV2.getText ());
				//int v3 = Integer.parseInt(txtV3.getText ());
				//int v4 = Integer.parseInt(txtV4.getText ());
				Double v1  = Double.parseDouble(txtV1.getText ());	
				Double v2  = Double.parseDouble(txtV2.getText ());	
				Double v3  = Double.parseDouble(txtV3.getText ());	
				Double v4  = Double.parseDouble(txtV4.getText ());	
				
				Double p1  = Double.parseDouble(txtP1.getText ());
				Double p2  = Double.parseDouble(txtP2.getText ());
				Double p3  = Double.parseDouble(txtP3.getText ());
				Double p4  = Double.parseDouble(txtP4.getText ());
				
				//soma
				Double soma = ( v1 * p1 )+ ( v2 * p2 )+ ( v3 * p3 )+( v4 * p4 );
				
				//resultado 
				txtTotal.setText(String.valueOf(soma));
				
			}
		});
		contentPane.add(btnCalcular, "cell 1 6,grow");
		
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtV1.setText(null);
				txtV2.setText(null);
				txtV3.setText(null);
				txtV4.setText(null);
				
				txtP1.setText(null);
				txtP2.setText(null);
				txtP3.setText(null);
				txtP4.setText(null);
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnLimpar, "cell 3 6,grow");
	}
}
