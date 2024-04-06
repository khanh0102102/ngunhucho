package jvk2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollBar;


public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton QL_Order;
	private JButton QL_Kho;
	private JButton QL_NV;
	private JButton buton_donuong;
	private JButton buton_douong;
	private JButton buton_monanvat;
	private JButton butonban21_1;
	private JButton butonban20_1;
	private JButton butonban19_1;
	private JButton butonban18_1;
	private JButton butonban17_1;
	private JButton butonban16_1;
	private JButton butonban15_1;
	private JButton butonban14_1;
	private JButton butonban13_1;
	private JButton butonban12_1;
	private JButton butonban11_1;
	private JButton butonban10_1;
	private JButton butonban9_1;
	private JButton butonban8_1;
	private JButton butonban7_1;
	private JButton butonban6_1;
	private JButton butonban5_1;
	private JButton butonban4_1;
	private JButton butonban3_1;
	private JButton butonban2_1;
	private JButton butonban1_1;
	
	private JButton butontang2;
	
	private JPanel panel_2_1;
	private JPanel panel_2_2;
	private JPanel panel_2_3;
	private JPanel panel_oder_do_nuong;
	private JPanel panel_oder_do_uong;
	private JPanel panel_oder;
	private JPanel panel_3_1_tang2;
	private JPanel panel_bill;
	private JPanel panel_oder_mon_an_vat;
	private JPanel panel_3_3;
	private JPanel panel_3_1_tang1;
	private JPanel cardPanel_3;
	private JButton butontang1;
	
	private JButton butonban21;
	private JButton butonban20;
	private JButton butonban19;
	private JButton butonban18;
	private JButton butonban17;
	private JButton butonban16;
	private JButton butonban15;
	private JButton butonban14;
	private JButton butonban13;
	private JButton butonban12;
	private JButton butonban11;
	private JButton butonban10;
	private JButton butonban9;
	private JButton butonban8;
	private JButton butonban7;
	private JButton butonban6;
	private JButton butonban5;
	private JButton butonban4;
	private JButton butonban3;
	private JButton butonban2;
	private JButton butonban1;
	private JPanel panel_3_2;
	

	
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1674, 821);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel cardPanel_1 = new JPanel();
		cardPanel_1.setBounds(0, 0, 1660, 37);
		contentPane.add(cardPanel_1);
		cardPanel_1.setLayout(null);
		
		QL_Order = new JButton("Trang Order");
		QL_Order.setBackground(new Color(255, 0, 0));
		QL_Order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2_2.setVisible(false);
				panel_2_1.setVisible(true);
				panel_2_3.setVisible(false);
				panel_3_1_tang2.setVisible(false);
				panel_3_1_tang1.setVisible(true);
				panel_3_3.setVisible(false);
			}
		});
		QL_Order.setBounds(0, 0, 167, 37);
		cardPanel_1.add(QL_Order);
		
		QL_Kho = new JButton("Trang QL Kho");
		QL_Kho.setBackground(new Color(0, 128, 255));
		QL_Kho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2_2.setVisible(true);
				panel_2_1.setVisible(false);
				panel_2_3.setVisible(false);
				panel_3_2.setVisible(true);
				panel_3_1_tang1.setVisible(false);
				panel_3_3.setVisible(false);
				
			}
		});
		QL_Kho.setBounds(167, 0, 167, 37);
		cardPanel_1.add(QL_Kho);
		
		QL_NV = new JButton("Trang QL NV");
		QL_NV.setBackground(new Color(0, 255, 64));
		QL_NV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2_2.setVisible(false);
				panel_2_1.setVisible(false);
				panel_2_3.setVisible(true);
				panel_3_2.setVisible(false);
				panel_3_1_tang1.setVisible(false);
				panel_3_1_tang2.setVisible(false);
				panel_3_3.setVisible(true);
			}
		});
		QL_NV.setBounds(334, 0, 167, 37);
		cardPanel_1.add(QL_NV);
		
		JPanel cardPanel_2 = new JPanel();
		cardPanel_2.setBounds(0, 37, 165, 747);
		contentPane.add(cardPanel_2);
		cardPanel_2.setLayout(null);
		
		panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(255, 0, 0));
		panel_2_1.setBounds(0, 0, 167, 747);
		cardPanel_2.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		butontang1 = new JButton("Tầng 1");
		butontang1.setBackground(new Color(255, 0, 0));
		butontang1.setFont(new Font("Tahoma", Font.PLAIN, 33));
		butontang1.setBounds(10, 11, 147, 68);
		panel_2_1.add(butontang1);
		
		butontang2 = new JButton("Tầng 2");
		butontang2.setBackground(new Color(128, 255, 255));
		butontang2.setFont(new Font("Tahoma", Font.PLAIN, 33));
		butontang2.setBounds(10, 97, 147, 70);
		panel_2_1.add(butontang2);
		panel_2_1.setVisible(true);
		
		panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(0, 128, 192));
		panel_2_2.setBounds(0, 0, 167, 747);
		cardPanel_2.add(panel_2_2);
		panel_2_2.setVisible(false);
		
		panel_2_3 = new JPanel();
		panel_2_3.setBackground(new Color(0, 255, 0));
		panel_2_3.setBounds(0, 0, 167, 747);
		cardPanel_2.add(panel_2_3);
		panel_2_3.setVisible(false);
		
		cardPanel_3 = new JPanel();
		cardPanel_3.setBounds(165, 37, 1485, 747);
		contentPane.add(cardPanel_3);
		cardPanel_3.setLayout(null);
		
		panel_3_1_tang1 = new JPanel();
		panel_3_1_tang1.setBackground(new Color(255, 0, 0));
		panel_3_1_tang1.setLayout(null);
		panel_3_1_tang1.setBounds(0, 0, 908, 381);
		cardPanel_3.add(panel_3_1_tang1);
		
		butonban1 = new JButton("Bàn 1");
		butonban1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban1.setBounds(24, 24, 94, 86);
		panel_3_1_tang1.add(butonban1);
		
		butonban2 = new JButton("Bàn 2");
		butonban2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban2.setBounds(128, 24, 94, 86);
		panel_3_1_tang1.add(butonban2);
		
		butonban3 = new JButton("Bàn 3");
		butonban3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban3.setBounds(231, 24, 94, 86);
		panel_3_1_tang1.add(butonban3);
		
		butonban4 = new JButton("Bàn 4");
		butonban4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban4.setBounds(335, 24, 94, 86);
		panel_3_1_tang1.add(butonban4);
		
		butonban5 = new JButton("Bàn 5");
		butonban5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban5.setBounds(439, 24, 94, 86);
		panel_3_1_tang1.add(butonban5);
		
		butonban6 = new JButton("Bàn 6");
		butonban6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban6.setBounds(543, 24, 94, 86);
		panel_3_1_tang1.add(butonban6);
		
		butonban7 = new JButton("Bàn 7");
		butonban7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban7.setBounds(647, 24, 94, 86);
		panel_3_1_tang1.add(butonban7);
		
		butonban9 = new JButton("Bàn 9");
		butonban9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban9.setBounds(24, 121, 94, 86);
		panel_3_1_tang1.add(butonban9);
		
		butonban8 = new JButton("Bàn 8");
		butonban8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban8.setBounds(751, 24, 94, 86);
		panel_3_1_tang1.add(butonban8);
		
		butonban10 = new JButton("Bàn 10");
		butonban10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban10.setBounds(128, 121, 94, 86);
		panel_3_1_tang1.add(butonban10);
		
		butonban11 = new JButton("Bàn 11");
		butonban11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban11.setBounds(232, 121, 94, 86);
		panel_3_1_tang1.add(butonban11);
		
		butonban12 = new JButton("Bàn 12");
		butonban12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban12.setBounds(335, 121, 94, 86);
		panel_3_1_tang1.add(butonban12);
		
		butonban13 = new JButton("Bàn 13");
		butonban13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban13.setBounds(439, 121, 94, 86);
		panel_3_1_tang1.add(butonban13);
		
		butonban14 = new JButton("Bàn 14");
		butonban14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban14.setBounds(543, 121, 94, 86);
		panel_3_1_tang1.add(butonban14);
		
		butonban15 = new JButton("Bàn 15");
		butonban15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban15.setBounds(647, 121, 94, 86);
		panel_3_1_tang1.add(butonban15);
		
		butonban16 = new JButton("Bàn 16");
		butonban16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban16.setBounds(751, 121, 94, 86);
		panel_3_1_tang1.add(butonban16);
		
		butonban17 = new JButton("Bàn 17");
		butonban17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban17.setBounds(24, 218, 94, 86);
		panel_3_1_tang1.add(butonban17);
		
		butonban18 = new JButton("Bàn 18");
		butonban18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban18.setBounds(128, 218, 94, 86);
		panel_3_1_tang1.add(butonban18);
		
		butonban19 = new JButton("Bàn 19");
		butonban19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban19.setBounds(232, 218, 94, 86);
		panel_3_1_tang1.add(butonban19);
		
		butonban20 = new JButton("Bàn 20");
		butonban20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban20.setBounds(335, 218, 94, 86);
		panel_3_1_tang1.add(butonban20);
		
		butonban21 = new JButton("Bàn 21");
		butonban21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban21.setBounds(439, 218, 94, 86);
		panel_3_1_tang1.add(butonban21);
		
		panel_3_3 = new JPanel();
		panel_3_3.setLayout(null);
		panel_3_3.setBounds(0, 0, 908, 381);
		cardPanel_3.add(panel_3_3);
		
		panel_oder_mon_an_vat = new JPanel();
		panel_oder_mon_an_vat.setBackground(new Color(255, 128, 128));
		panel_oder_mon_an_vat.setLayout(null);
		panel_oder_mon_an_vat.setBounds(0, 428, 908, 319);
		cardPanel_3.add(panel_oder_mon_an_vat);
		
		panel_bill = new JPanel();
		panel_bill.setBounds(907, 0, 337, 747);
		cardPanel_3.add(panel_bill);
		panel_bill.setLayout(null);
		
		panel_3_1_tang2 = new JPanel();
		panel_3_1_tang2.setBackground(new Color(128, 255, 255));
		panel_3_1_tang2.setLayout(null);
		panel_3_1_tang2.setBounds(0, 0, 908, 381);
		cardPanel_3.add(panel_3_1_tang2);
		
		butonban1_1 = new JButton("Bàn 1");
		butonban1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban1_1.setBounds(24, 24, 94, 86);
		panel_3_1_tang2.add(butonban1_1);
		
		butonban2_1 = new JButton("Bàn 2");
		butonban2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban2_1.setBounds(128, 24, 94, 86);
		panel_3_1_tang2.add(butonban2_1);
		
		butonban3_1 = new JButton("Bàn 3");
		butonban3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban3_1.setBounds(231, 24, 94, 86);
		panel_3_1_tang2.add(butonban3_1);
		
		butonban4_1 = new JButton("Bàn 4");
		butonban4_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban4_1.setBounds(335, 24, 94, 86);
		panel_3_1_tang2.add(butonban4_1);
		
		butonban5_1 = new JButton("Bàn 5");
		butonban5_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban5_1.setBounds(439, 24, 94, 86);
		panel_3_1_tang2.add(butonban5_1);
		
		butonban6_1 = new JButton("Bàn 6");
		butonban6_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban6_1.setBounds(543, 24, 94, 86);
		panel_3_1_tang2.add(butonban6_1);
		
		butonban7_1 = new JButton("Bàn 7");
		butonban7_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban7_1.setBounds(647, 24, 94, 86);
		panel_3_1_tang2.add(butonban7_1);
		
		butonban9_1 = new JButton("Bàn 9");
		butonban9_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban9_1.setBounds(24, 121, 94, 86);
		panel_3_1_tang2.add(butonban9_1);
		
		butonban8_1 = new JButton("Bàn 8");
		butonban8_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban8_1.setBounds(751, 24, 94, 86);
		panel_3_1_tang2.add(butonban8_1);
		
		butonban10_1 = new JButton("Bàn 10");
		butonban10_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban10_1.setBounds(128, 121, 94, 86);
		panel_3_1_tang2.add(butonban10_1);
		
		butonban11_1 = new JButton("Bàn 11");
		butonban11_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban11_1.setBounds(232, 121, 94, 86);
		panel_3_1_tang2.add(butonban11_1);
		
		butonban12_1 = new JButton("Bàn 12");
		butonban12_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban12_1.setBounds(335, 121, 94, 86);
		panel_3_1_tang2.add(butonban12_1);
		
		butonban13_1 = new JButton("Bàn 13");
		butonban13_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban13_1.setBounds(439, 121, 94, 86);
		panel_3_1_tang2.add(butonban13_1);
		
		butonban14_1 = new JButton("Bàn 14");
		butonban14_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban14_1.setBounds(543, 121, 94, 86);
		panel_3_1_tang2.add(butonban14_1);
		
		butonban15_1 = new JButton("Bàn 15");
		butonban15_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban15_1.setBounds(647, 121, 94, 86);
		panel_3_1_tang2.add(butonban15_1);
		
		butonban16_1 = new JButton("Bàn 16");
		butonban16_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban16_1.setBounds(751, 121, 94, 86);
		panel_3_1_tang2.add(butonban16_1);
		
		butonban17_1 = new JButton("Bàn 17");
		butonban17_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban17_1.setBounds(24, 218, 94, 86);
		panel_3_1_tang2.add(butonban17_1);
		
		butonban18_1 = new JButton("Bàn 18");
		butonban18_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban18_1.setBounds(128, 218, 94, 86);
		panel_3_1_tang2.add(butonban18_1);
		
		butonban19_1 = new JButton("Bàn 19");
		butonban19_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban19_1.setBounds(232, 218, 94, 86);
		panel_3_1_tang2.add(butonban19_1);
		
		butonban20_1 = new JButton("Bàn 20");
		butonban20_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban20_1.setBounds(335, 218, 94, 86);
		panel_3_1_tang2.add(butonban20_1);
		
		butonban21_1 = new JButton("Bàn 21");
		butonban21_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban21_1.setBounds(439, 218, 94, 86);
		panel_3_1_tang2.add(butonban21_1);
		
		panel_oder = new JPanel();
		panel_oder.setLayout(null);
		panel_oder.setBounds(0, 380, 908, 48);
		cardPanel_3.add(panel_oder);
		
		buton_monanvat = new JButton("Món ăn vặt");
		buton_monanvat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_oder_mon_an_vat.setVisible(true);
				panel_oder_do_nuong.setVisible(false);
				panel_oder_do_uong.setVisible(false);
				
			}
		});
		buton_monanvat.setBackground(new Color(255, 128, 128));
		buton_monanvat.setFont(new Font("Tahoma", Font.PLAIN, 17));
		buton_monanvat.setBounds(0, 0, 127, 48);
		panel_oder.add(buton_monanvat);
		
		buton_douong = new JButton("Đồ uống");
		buton_douong.setBackground(new Color(128, 0, 0));
		buton_douong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_oder_mon_an_vat.setVisible(false);
				panel_oder_do_nuong.setVisible(false);
				panel_oder_do_uong.setVisible(true);
				
			}
		});
		buton_douong.setFont(new Font("Tahoma", Font.PLAIN, 17));
		buton_douong.setBounds(127, 0, 115, 48);
		panel_oder.add(buton_douong);
		
		buton_donuong = new JButton("Đồ nướng");
		buton_donuong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_oder_do_nuong.setVisible(true);
				panel_oder_mon_an_vat.setVisible(false);
				panel_oder_do_uong.setVisible(false);
			}
		});
		buton_donuong.setBackground(new Color(255, 0, 128));
		buton_donuong.setFont(new Font("Tahoma", Font.PLAIN, 17));
		buton_donuong.setBounds(242, 0, 115, 48);
		panel_oder.add(buton_donuong);
		
		panel_oder_do_uong = new JPanel();
		panel_oder_do_uong.setBackground(new Color(128, 0, 0));
		panel_oder_do_uong.setLayout(null);
		panel_oder_do_uong.setBounds(0, 428, 908, 319);
		cardPanel_3.add(panel_oder_do_uong);
		
		panel_oder_do_nuong = new JPanel();
		panel_oder_do_nuong.setBackground(new Color(255, 0, 128));
		panel_oder_do_nuong.setLayout(null);
		panel_oder_do_nuong.setBounds(0, 428, 908, 319);
		cardPanel_3.add(panel_oder_do_nuong);
		
		panel_3_2 = new JPanel();
		panel_3_2.setBackground(new Color(255, 255, 255));
		panel_3_2.setLayout(null);
		panel_3_2.setBounds(0, 0, 908, 381);
		cardPanel_3.add(panel_3_2);

	}
}
