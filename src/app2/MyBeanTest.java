package app2;
/*
oop�� ����Ǿ� �ִ� ���α׷�
- oopƯ���� �����ϱ� ���� ����Ŭ������ �����ϰ� MyBeanStyleXXX Ŭ�������� ����ϴ� �Ű������� Ÿ����
 ���� Ÿ������ �����ϸ� �������� �����Ѵ�.
- ���Ǵ� ��ü�� ����Ǵ��� ������ ��ü�� ����ϴ� ������ �ڵ带 �����ϴ� ������ �پ���.
- �׷��� ���� ��ü�� �����ϴ� �������� �����ؼ� �����ϰ� �ִ�.
- ���Ǵ� ��ü�� �ٲ�븶�� ��ü�� ���� �����ϴ� �ڵ带 ��� �����ؾ� �Ѵٴ� ������ �����Ѵ�.
- ����ϴ� ������ ���� new�ؼ� ��ü�� �����ϴ� �ڵ�� �������� �ϴ� �ڵ��̴�.
*/
public class MyBeanTest {
	public static void main(String[] args) {
		MyBeanStyleA obj = new MyBeanStyleA();
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("**************************");
		obj.hello("����");
		obj.hello("����");
		System.out.println("**************************");
	}
	public static void show(MyBeanStyle obj) {
		System.out.println("=========================");
		obj.hello("����");
		obj.hello("����");
		System.out.println("=========================");
	}
}
