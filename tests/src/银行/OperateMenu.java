package 银行;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Scanner;


public class OperateMenu {

	public static void changeUserInfo(Person person) {
		
		System.out.println("********************");
		System.out.println("	1、修改姓名：");
		System.out.println("	2、修改年龄：");
		System.out.println("	3、修改登录密码：");
		System.out.println("	4、修改银行卡密码：");
		System.out.println("	5、返回上一级");
		System.out.println("********************");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		switch (b) {
		case 1:
			System.out.println("请输入要修改的姓名：");
			String c=(String)sc.next();
			person.setName(c);
			System.out.println("修改成功！请重新登录");
			
			break;
		case 2:
			System.out.println("请输入要修改的年龄：");
			int d=sc.nextInt();
			person.setAge(d);
			System.out.println("修改成功！请重新登录");
			
			break;
		case 3:
			System.out.println("您的用户名为："+person.getLogin());
			System.out.println("请输入要修改的登录密码：");
			int e=sc.nextInt();
			person.setPassword(e);
			System.out.println("修改成功！请重新登录");
			
			break;
		case 4:
			System.out.println("您的银行卡号为："+person.getBankPassword());
			System.out.println("请输入要修改的银行卡密码：");
			int f=sc.nextInt();
			person.setBankPassword(f);
			System.out.println("修改成功！请重新登录");
			
			break;
		case 5:
			new Handler(person);
			break;
		default:
			System.out.println("输入有误，请重新输入...");
			break;
		}
	
		}
	
	public static void saveMoney(Person person) {
		System.out.println("=============存款=============");
		try {
			System.out.println("您的银行卡号为："+person.getBankAccount());
			System.out.println("请输入银行卡密码：");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			if(a==person.getBankPassword()){
				System.out.println("请输入存钱金额：");
				BigDecimal b=sc.nextBigDecimal();
				person.setMoney( b.add(person.getMoney()));
				System.out.println("存钱成功");
			}else {
				System.out.println("银行卡密码输入错误！");
			}
		} catch (Exception e) {
		}
		new Handler(person);
		
	}
	public static void drawMoney(Person person) {
		System.out.println("=============取款=============");
		try {
			
			System.out.println("您的银行卡号为："+person.getBankAccount());
			System.out.println("请输入银行卡密码：");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			if(a==person.getBankPassword()){
				System.out.println("请输入取款金额：");
				BigDecimal b=sc.nextBigDecimal();
				person.setMoney(person.getMoney().subtract(b));;
				System.out.println("取钱成功");
			}else {
				System.out.println("银行卡密码输入错误！");
			}
		} catch (Exception e) {
		}
		new Handler(person);
	}
	public static void login(){
		Person person=new Person("董跳跳",22,'男',12345,123,123,123);
		
			int loginNum = 0;
			while(loginNum<3)
	        {
				Scanner sc=new Scanner(System.in);
				
	            System.out.println("请输入用户名:");
	            int a=sc.nextInt();
	            System.out.println("请输入密码:");
	            int b=sc.nextInt();
	            if(a==person.getLogin()&&b==person.getPassword())
	            {
	                System.out.println("成功登陆系统");
	                System.out.println("………………………………………………………………..........");
	                System.out.println("\t\t\t欢迎使用中国银行");
	                new Handler(person);
	              
	            }else
	            {
	                System.out.println(" 用户名或者 密码错误请重新 输入");
	                loginNum++;
	            }
	        }
			 if(loginNum>=3)
		        {
		            System.out.println("输入错误3次，退出系统");
		            System.exit(0);
		        }
	        }
	
	public static void account(Person person) {
		Person person1 = new Person("崔凯萌",23,'男',123456,123,1234,1234);
		System.out.println("=============转账=============");
		System.out.println("请输入要转入的用户名：");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==person1.getLogin()){
			System.out.println("请输入要转入的银行卡号：");
			int b=sc.nextInt();
			if(b==person1.getBankAccount()) {
				System.out.println("您的银行卡号为："+person.getBankAccount());
				System.out.println("您要转给的用户为："+person1.getName().charAt(0)+"*"+person1.getName().charAt(2));
				System.out.println("您要转入的银行卡卡号为："+person1.getBankAccount());
				System.out.println("请输入您的银行卡密码：");
				int c=sc.nextInt();
				if(c==person.getBankPassword()) {
					System.out.println("请输入转账金额：");
					BigDecimal d=sc.nextBigDecimal();
					person.setMoney(person.getMoney().subtract(d));
					person1.setMoney(person1.getMoney().add(d));
					System.out.println("转账成功！");
			}else System.out.println("银行卡密码输入不正确");
	
			}else System.out.println("您输入的卡号不对");
     }else System.out.println("您输入的用户名不存在");
					
	}
	public static void Info(Person person) {
		
		System.out.println( " [name=" + person.getName() + ", \t\tage=" + person.getAge() + ", \t\tsex=" + person.getSex() + ",\n BankAccount=" + person.getBankAccount()
				+ ", \t\tBankPassword=" + person.getBankPassword() + ",\t\t Login=" + person.getLogin() + ",\n Password=" + person.getPassword()
				+ ",\t\t Interest_Adjustments=" + person.getInterest_Adjustments() + ",\t\t DaiKuanDate=" + person.getDaiKuanDate() + ", \nMouthMoney="
				+ person.getMouthMoney() + ", \t\tMoney=" + person.getMoney() + "]");
		
	}

	public static void Loan(Person person) {
		System.out.println("=============贷款=============");
		Scanner sc=new Scanner(System.in);

		System.out.println("贷款细则说明：");
		System.out.println("1、贷款数额是根据您的月工资加您的银行存款决定的");
		System.out.println("2、还款期限超过贷款年限时，银行会降低您的信用度和信用卡额度");
		System.out.println("=============================");
		System.out.println("您是否需要贷款：yes or no");
		String y="yes";
		String yn=sc.next();
		if(yn.equals(y)) {
			float allmoney=(person.getMoney().add(person.getMouthMoney())).floatValue();
			float xx=allmoney/100000;
			int a=Math.round(xx);
			switch(a) {
			case 1: 
				System.out.println("根据您的情况，你最多可以贷款"+allmoney*1.5);
				OperateMenu.Interst(person);
				break;
			case 2 : 
				System.out.println("根据您的情况，你最多可以贷款"+allmoney*1.5);
				OperateMenu.Interst(person);
				break;
			case 3 : 
				System.out.println("根据您的情况，你最多可以贷款"+allmoney*1.5);
				OperateMenu.Interst(person);
				break;
			case 4 : 
				System.out.println("根据您的情况，你最多可以贷款"+allmoney*1.5);
				OperateMenu.Interst(person);
				break;
			case 5 : 
				System.out.println("根据您的情况，你最多可以贷款"+allmoney*1.5);
				OperateMenu.Interst(person);
				break;
			case 6 : 		
			case 7 : 
			case 8 : 
			case 9 : 
				System.out.println("根据您的情况，你最多可以贷款"+allmoney*1.8);
				OperateMenu.Interst(person);
				break;	
				
			default:
				System.out.println("根据您的情况，您不可以贷款，谢谢您的使用");
				break;
		}
		}else {
			System.out.println("谢谢您的使用");
			new Handler(person);
		}
			
	}
	public static void Interst(Person person) {
		Scanner sc=new Scanner(System.in);
		DecimalFormat a = new DecimalFormat("#.00%");
		float allmoney=(person.getMoney().add(person.getMouthMoney())).floatValue();
		String getinterest = a.format(person.getInterest_Adjustments());
	//	NumberFormat.getPercentInstance().format(person.getInterest_Adjustments())
		System.out.println("请输入您要贷款的数额");
		float b=sc.nextFloat();
		if(b<=allmoney*1.5) {
			System.out.println("您最多可贷款2年");
			System.out.println("请输入贷款期限");
			String d=sc.next();
			switch(d) {
			case "0.1":
			case "0.2":
			case "0.3":
			case "0.4":
				System.out.println("当前贷款利率为"+getinterest);
				break;
			case "0.5":
			case "0.6":
			case "0.7":
				System.out.println("当前贷款利率为"+(a.format((person.getInterest_Adjustments()+0.0020 ))));
				break;
			case "0.8":
			case "0.9":
			case "1.0":
				System.out.println("当前贷款利率为"+(a.format((person.getInterest_Adjustments()+0.0045 ))));
				break;
			case "1.1":
			case "1.2":
			case "1.3":
			case "1.4":
			case "1.5":
				System.out.println("当前贷款利率为"+(a.format((person.getInterest_Adjustments()+0.0060 ))));
				break;
			case "1.6":
			case "1.7":
			case "1.8":
			case "1.9":
			case "2.0":
				System.out.println("当前贷款利率为"+(a.format( (person.getInterest_Adjustments()+0.0090))));
				break;
			default:
				System.out.println("贷款失败，谢谢您的使用");
				break;
			}
			person.setMoney(person.getMoney().add(new BigDecimal(b)));
			System.out.println("您确定要贷款吗？");
			String y="yes";
			String yn=sc.next();
			if(yn.equals(y)) {
				System.out.println("贷款成功，谢谢使用。*^_^* ");
			}else {
				System.out.println("贷款失败，谢谢您的使用");
			}
			
		}else {
			new Handler(person);
		}
	
	}

}		

		
	

