package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ尡 ���۵Ǿ����ϴ�.");
		
		try {
			//������ (�۾�����, �������) 5�� ���� ���߱�
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			//InterruptedException�� RuntimeException �� ��ӹ��� �ʾұ� ������
			// �ݵ�� try~catch ������ ���� ó���� �ؾ� ���������� �����Ѵ�.
			e.printStackTrace();
		}
		
		System.out.println("���� �޼ҵ尡 ���� �˴ϴ�.");
	}
}
