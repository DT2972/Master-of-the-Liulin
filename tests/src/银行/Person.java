package ����;

import java.math.BigDecimal;

public class Person {

	/*
	 * console�н����û������Լ���Ϣ����ʾ��
	 * 1.��Ҫ�߱���¼���ܡ�3���������ϵͳ�Զ��Ƴ�����ʾ��
	 * 2.�����޸ĸ�����Ϣ�����������š����
	 * 3.���/ȡ��
	 * 4.ת��
	 * 5.���ݸ��˴���������ȥ���������ȣ�����ϸ��  �Զ���
	 * 6.����ͨ�����ӡ����ϸ��
	 * 7.����������Ҫ��ʾ�˻����䶯�����µĻ�����ϸ�������㣬����ʾ�ȴ�����ۿ�ʧ��
	 * 8.��Ϣ
	 */
	private String name;
	private int age;
	private char sex;
	private int BankAccount;
	private int BankPassword;
	private int Login;
	private int Password;
	private double  Interest_Adjustments= 0.0435;//����
	private String DaiKuanDate;
	private BigDecimal MouthMoney=new BigDecimal(6000);//�¹���
	private BigDecimal Money=new BigDecimal(100000);//���п��ʲ�
	Person(){}
	public String getName() {
		return name;
	}
	public Person(String name, int age, char sex, int bankAccount, int bankPassword, int login, int password
			) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		BankAccount = bankAccount;
		BankPassword = bankPassword;
		Login = login;
		Password = password;
//		DaiKuanDate=DaiKuanDate;
//		Money = money;
	}
	
	public String getDaiKuanDate() {
		return DaiKuanDate;
	}
	public void setDaiKuanDate(String daiKuanDate) {
		DaiKuanDate = daiKuanDate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getBankAccount() {
		return BankAccount;
	}
	public void setBankAccount(int bankAccount) {
		BankAccount = bankAccount;
	}
	public int getBankPassword() {
		return BankPassword;
	}
	public void setBankPassword(int bankPassword) {
		BankPassword = bankPassword;
	}
	public int getLogin() {
		return Login;
	}
	public void setLogin(int login) {
		Login = login;
	}
	public int getPassword() {
		return Password;
	}
	public void setPassword(int password) {
		Password = password;
	}
	
	public double getInterest_Adjustments() {
		return Interest_Adjustments;
	}
	public void setInterest_Adjustments(double interest_Adjustments) {
		Interest_Adjustments = interest_Adjustments;
	}
	public BigDecimal getMouthMoney() {
		return MouthMoney;
	}
	public void setMouthMoney(BigDecimal mouthMoney) {
		MouthMoney = mouthMoney;
	}
	public BigDecimal getMoney() {
		return Money;
	}
	public void setMoney(BigDecimal money) {
		Money = money;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public  String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", BankAccount=" + BankAccount
				+ ", BankPassword=" + BankPassword + ", Login=" + Login + ", Password=" + Password
				+ ", Interest_Adjustments=" + Interest_Adjustments + ", DaiKuanDate=" + DaiKuanDate + ", MouthMoney="
				+ MouthMoney + ", Money=" + Money + "]";
	}

	
	
	
}
