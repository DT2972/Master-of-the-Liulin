package ����;

import java.util.Scanner;

public class Handler {

	public Handler(Person person) {
		while(true){//ѭ�����ò˵���ʾ�ķ���
			show(person);
		}
	}
	Handler(){}
	public void show(Person person) {
		System.out.println("\t\t��ӭ"+person.getName().charAt(0)+"����"+"��¼��ϵͳ");
		System.out.println("============����ϵͳ============");
		System.out.println("	1���޸ĸ�����Ϣ");
		System.out.println("	2�����");
		System.out.println("	3��ȡ��");
		System.out.println("	4��ת��");
		System.out.println("	5���鿴������Ϣ");
		System.out.println("	6������");
		System.out.println("	7���˳�����");
		System.out.println("==============================");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch (a) {
		case 1:
			OperateMenu.changeUserInfo(person);
			break;
		case 2:
			OperateMenu.saveMoney(person);
			break;
		case 3:
			OperateMenu.drawMoney(person);
			break;
		case 4:
			OperateMenu.account(person);
			break;
		case 5:
			OperateMenu.Info(person);
			break;
		case 6:
			OperateMenu.Loan(person);
			break;
		case 7:
			System.exit(0);//�˳�����
			break;
		default:
			System.out.println("����Ĳ�����Ų���...");
			break;
		}
	}
	
}
