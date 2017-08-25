package 银行;

import java.util.Scanner;

public class Handler {

	public Handler(Person person) {
		while(true){//循环调用菜单显示的方法
			show(person);
		}
	}
	Handler(){}
	public void show(Person person) {
		System.out.println("\t\t欢迎"+person.getName().charAt(0)+"先生"+"登录此系统");
		System.out.println("============银行系统============");
		System.out.println("	1、修改个人信息");
		System.out.println("	2、存款");
		System.out.println("	3、取款");
		System.out.println("	4、转账");
		System.out.println("	5、查看个人信息");
		System.out.println("	6、贷款");
		System.out.println("	7、退出程序");
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
			System.exit(0);//退出程序
			break;
		default:
			System.out.println("输入的操作序号不对...");
			break;
		}
	}
	
}
