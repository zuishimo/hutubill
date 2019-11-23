package Gui.Panel;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Util.CircleProgressBar;
import Util.ColorUtil;
import Util.FontUtil;
import Util.GUIUtil;

public class SpendPanel extends JPanel {

	//创建单例面板，声明一个静态属性，指向面板实例
	public static SpendPanel instance = new SpendPanel();
	
	public JLabel lMonthSpend = new JLabel("本月消费");
	public JLabel lTodaySpend = new JLabel("今日消费");
	public JLabel lAvgSpendDay = new JLabel("日均消费");
	public JLabel lMonthLeft = new JLabel("本月剩余");
	public JLabel lDayAvgAvailable = new JLabel("日均可用");
	public JLabel lMonthLeftDay = new JLabel("距离月末");
	
	public JLabel vMonthSpend = new JLabel("￥2300");
    public JLabel vTodaySpend = new JLabel("￥25");
    public JLabel vAvgSpendPerDay = new JLabel("￥120");
    public JLabel vMonthAvailable = new JLabel("￥2084");
    public JLabel vDayAvgAvailable = new JLabel("￥389");
    public JLabel vMonthLeftDay = new JLabel("15天");
	
	CircleProgressBar bar;
	
	private SpendPanel() {
		this.setLayout(new BorderLayout());
		bar = new CircleProgressBar();
		bar.setBackgroundColor(ColorUtil.blueColor);
		GUIUtil.setColor(ColorUtil.grayColor, lMonthSpend,lTodaySpend,lAvgSpendDay,lMonthLeft,lDayAvgAvailable,lMonthLeftDay,
				        vAvgSpendPerDay,vMonthAvailable,vDayAvgAvailable,vMonthLeftDay);
		
		GUIUtil.setColor(ColorUtil.blueColor, vMonthSpend,vTodaySpend);
		
		FontUtil.setFont(vMonthSpend,vTodaySpend);
		
		this.add(center1(),BorderLayout.CENTER);
		this.add(south(),BorderLayout.SOUTH);
	}
	
	private JPanel center1() {
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(west(),BorderLayout.WEST);
		p.add(center2(),BorderLayout.CENTER);
		return p;
	}
	
	private JPanel south() {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2,4));
		
		p.add(lAvgSpendDay);
		p.add(lMonthLeft);
		p.add(lDayAvgAvailable);
		p.add(lMonthLeftDay);
		
		p.add(vAvgSpendPerDay);
		p.add(vMonthAvailable);
		p.add(vDayAvgAvailable);
		p.add(vMonthLeftDay);
		
		return p;
	}
	
	private Component west() {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4,1));
		
		p.add(lMonthSpend);
		p.add(vMonthSpend);
		p.add(lTodaySpend);
		p.add(vTodaySpend);
		
		return p;
	}
	
	private Component center2() {
		return bar; 
	}
	
}
