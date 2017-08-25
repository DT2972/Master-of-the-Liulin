package 银行;

import java.math.BigDecimal;

public class Person {

	/*
	 * console中接收用户输入以及信息的显示。
	 * 1.需要具备登录功能。3次输入错误，系统自动推出并提示。
	 * 2.可以修改个人信息，不包括卡号。余额
	 * 3.存款/取款
	 * 4.转账
	 * 5.根据个人储户存量金额，去评估贷款额度（评估细则  自定）
	 * 6.贷款通过后打印贷款细则
	 * 7.还款。还款后需要显示账户余额变动，及新的还款明细，若余额不足，则提示先存款，否则扣款失败
	 * 8.调息
	 */
	private String name;
	private int age;
	private char sex;
	private int BankAccount;
	private int BankPassword;
	private int Login;
	private int Password;
	private double  Interest_Adjustments= 0.0435;//利率
	private String DaiKuanDate;
	private BigDecimal MouthMoney=new BigDecimal(6000);//月工资
	private BigDecimal Money=new BigDecimal(100000);//银行卡资产
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
