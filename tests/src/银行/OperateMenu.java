package ����;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Scanner;


public class OperateMenu {

	public static void changeUserInfo(Person person) {
		
		System.out.println("********************");
		System.out.println("	1���޸�������");
		System.out.println("	2���޸����䣺");
		System.out.println("	3���޸ĵ�¼���룺");
		System.out.println("	4���޸����п����룺");
		System.out.println("	5��������һ��");
		System.out.println("********************");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		switch (b) {
		case 1:
			System.out.println("������Ҫ�޸ĵ�������");
			String c=(String)sc.next();
			person.setName(c);
			System.out.println("�޸ĳɹ��������µ�¼");
			
			break;
		case 2:
			System.out.println("������Ҫ�޸ĵ����䣺");
			int d=sc.nextInt();
			person.setAge(d);
			System.out.println("�޸ĳɹ��������µ�¼");
			
			break;
		case 3:
			System.out.println("�����û���Ϊ��"+person.getLogin());
			System.out.println("������Ҫ�޸ĵĵ�¼���룺");
			int e=sc.nextInt();
			person.setPassword(e);
			System.out.println("�޸ĳɹ��������µ�¼");
			
			break;
		case 4:
			System.out.println("�������п���Ϊ��"+person.getBankPassword());
			System.out.println("������Ҫ�޸ĵ����п����룺");
			int f=sc.nextInt();
			person.setBankPassword(f);
			System.out.println("�޸ĳɹ��������µ�¼");
			
			break;
		case 5:
			new Handler(person);
			break;
		default:
			System.out.println("������������������...");
			break;
		}
	
		}
	
	public static void saveMoney(Person person) {
		System.out.println("=============���=============");
		try {
			System.out.println("�������п���Ϊ��"+person.getBankAccount());
			System.out.println("���������п����룺");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			if(a==person.getBankPassword()){
				System.out.println("�������Ǯ��");
				BigDecimal b=sc.nextBigDecimal();
				person.setMoney( b.add(person.getMoney()));
				System.out.println("��Ǯ�ɹ�");
			}else {
				System.out.println("���п������������");
			}
		} catch (Exception e) {
		}
		new Handler(person);
		
	}
	public static void drawMoney(Person person) {
		System.out.println("=============ȡ��=============");
		try {
			
			System.out.println("�������п���Ϊ��"+person.getBankAccount());
			System.out.println("���������п����룺");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			if(a==person.getBankPassword()){
				System.out.println("������ȡ���");
				BigDecimal b=sc.nextBigDecimal();
				person.setMoney(person.getMoney().subtract(b));;
				System.out.println("ȡǮ�ɹ�");
			}else {
				System.out.println("���п������������");
			}
		} catch (Exception e) {
		}
		new Handler(person);
	}
	public static void login(){
		Person person=new Person("������",22,'��',12345,123,123,123);
		
			int loginNum = 0;
			while(loginNum<3)
	        {
				Scanner sc=new Scanner(System.in);
				
	            System.out.println("�������û���:");
	            int a=sc.nextInt();
	            System.out.println("����������:");
	            int b=sc.nextInt();
	            if(a==person.getLogin()&&b==person.getPassword())
	            {
	                System.out.println("�ɹ���½ϵͳ");
	                System.out.println("������������������������������������������������..........");
	                System.out.println("\t\t\t��ӭʹ���й�����");
	                new Handler(person);
	              
	            }else
	            {
	                System.out.println(" �û������� ������������� ����");
	                loginNum++;
	            }
	        }
			 if(loginNum>=3)
		        {
		            System.out.println("�������3�Σ��˳�ϵͳ");
		            System.exit(0);
		        }
	        }
	
	public static void account(Person person) {
		Person person1 = new Person("�޿���",23,'��',123456,123,1234,1234);
		System.out.println("=============ת��=============");
		System.out.println("������Ҫת����û�����");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==person1.getLogin()){
			System.out.println("������Ҫת������п��ţ�");
			int b=sc.nextInt();
			if(b==person1.getBankAccount()) {
				System.out.println("�������п���Ϊ��"+person.getBankAccount());
				System.out.println("��Ҫת�����û�Ϊ��"+person1.getName().charAt(0)+"*"+person1.getName().charAt(2));
				System.out.println("��Ҫת������п�����Ϊ��"+person1.getBankAccount());
				System.out.println("�������������п����룺");
				int c=sc.nextInt();
				if(c==person.getBankPassword()) {
					System.out.println("������ת�˽�");
					BigDecimal d=sc.nextBigDecimal();
					person.setMoney(person.getMoney().subtract(d));
					person1.setMoney(person1.getMoney().add(d));
					System.out.println("ת�˳ɹ���");
			}else System.out.println("���п��������벻��ȷ");
	
			}else System.out.println("������Ŀ��Ų���");
     }else System.out.println("��������û���������");
					
	}
	public static void Info(Person person) {
		
		System.out.println( " [name=" + person.getName() + ", \t\tage=" + person.getAge() + ", \t\tsex=" + person.getSex() + ",\n BankAccount=" + person.getBankAccount()
				+ ", \t\tBankPassword=" + person.getBankPassword() + ",\t\t Login=" + person.getLogin() + ",\n Password=" + person.getPassword()
				+ ",\t\t Interest_Adjustments=" + person.getInterest_Adjustments() + ",\t\t DaiKuanDate=" + person.getDaiKuanDate() + ", \nMouthMoney="
				+ person.getMouthMoney() + ", \t\tMoney=" + person.getMoney() + "]");
		
	}

	public static void Loan(Person person) {
		System.out.println("=============����=============");
		Scanner sc=new Scanner(System.in);

		System.out.println("����ϸ��˵����");
		System.out.println("1�����������Ǹ��������¹��ʼ��������д�������");
		System.out.println("2���������޳�����������ʱ�����лή���������öȺ����ÿ����");
		System.out.println("=============================");
		System.out.println("���Ƿ���Ҫ���yes or no");
		String y="yes";
		String yn=sc.next();
		if(yn.equals(y)) {
			float allmoney=(person.getMoney().add(person.getMouthMoney())).floatValue();
			float xx=allmoney/100000;
			int a=Math.round(xx);
			switch(a) {
			case 1: 
				System.out.println("��������������������Դ���"+allmoney*1.5);
				OperateMenu.Interst(person);
				break;
			case 2 : 
				System.out.println("��������������������Դ���"+allmoney*1.5);
				OperateMenu.Interst(person);
				break;
			case 3 : 
				System.out.println("��������������������Դ���"+allmoney*1.5);
				OperateMenu.Interst(person);
				break;
			case 4 : 
				System.out.println("��������������������Դ���"+allmoney*1.5);
				OperateMenu.Interst(person);
				break;
			case 5 : 
				System.out.println("��������������������Դ���"+allmoney*1.5);
				OperateMenu.Interst(person);
				break;
			case 6 : 		
			case 7 : 
			case 8 : 
			case 9 : 
				System.out.println("��������������������Դ���"+allmoney*1.8);
				OperateMenu.Interst(person);
				break;	
				
			default:
				System.out.println("��������������������Դ��лл����ʹ��");
				break;
		}
		}else {
			System.out.println("лл����ʹ��");
			new Handler(person);
		}
			
	}
	public static void Interst(Person person) {
		Scanner sc=new Scanner(System.in);
		DecimalFormat a = new DecimalFormat("#.00%");
		float allmoney=(person.getMoney().add(person.getMouthMoney())).floatValue();
		String getinterest = a.format(person.getInterest_Adjustments());
	//	NumberFormat.getPercentInstance().format(person.getInterest_Adjustments())
		System.out.println("��������Ҫ���������");
		float b=sc.nextFloat();
		if(b<=allmoney*1.5) {
			System.out.println("�����ɴ���2��");
			System.out.println("�������������");
			String d=sc.next();
			switch(d) {
			case "0.1":
			case "0.2":
			case "0.3":
			case "0.4":
				System.out.println("��ǰ��������Ϊ"+getinterest);
				break;
			case "0.5":
			case "0.6":
			case "0.7":
				System.out.println("��ǰ��������Ϊ"+(a.format((person.getInterest_Adjustments()+0.0020 ))));
				break;
			case "0.8":
			case "0.9":
			case "1.0":
				System.out.println("��ǰ��������Ϊ"+(a.format((person.getInterest_Adjustments()+0.0045 ))));
				break;
			case "1.1":
			case "1.2":
			case "1.3":
			case "1.4":
			case "1.5":
				System.out.println("��ǰ��������Ϊ"+(a.format((person.getInterest_Adjustments()+0.0060 ))));
				break;
			case "1.6":
			case "1.7":
			case "1.8":
			case "1.9":
			case "2.0":
				System.out.println("��ǰ��������Ϊ"+(a.format( (person.getInterest_Adjustments()+0.0090))));
				break;
			default:
				System.out.println("����ʧ�ܣ�лл����ʹ��");
				break;
			}
			person.setMoney(person.getMoney().add(new BigDecimal(b)));
			System.out.println("��ȷ��Ҫ������");
			String y="yes";
			String yn=sc.next();
			if(yn.equals(y)) {
				System.out.println("����ɹ���ллʹ�á�*^_^* ");
			}else {
				System.out.println("����ʧ�ܣ�лл����ʹ��");
			}
			
		}else {
			new Handler(person);
		}
	
	}

}		

		
	

