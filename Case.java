import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		System.out.println("Task Case");

		// Case1
		Scanner in = new Scanner(System.in);
		System.out.print("������� �����: ");
		int key = in.nextInt();
		// int key = 3; ���� �� ���������� ���� ������ � ���������� (scanner), ��
		// ��������� ��������� ����������
		switch (key) {
		case 1:
			System.out.println("�� ������� �����������");
			break;
		case 2:
			System.out.println("�� ������� �������");
			break;
		case 3:
			System.out.println("�� ������� �����");
			break;
		case 4:
			System.out.println("�� ������� �������");
			break;
		case 5:
			System.out.println("�� ������� �������");
			break;
		case 6:
			System.out.println("�� ������� �������");
			break;
		case 7:
			System.out.println("�� ������� �����������");
			break;

		default:
			System.out.println("error. ��� ����� ��������");
			break;
		}

		// Case3
		Scanner in = new Scanner(System.in);
		System.out.print("������� ���������� ����� ������: ");
		int N = in.nextInt();
		//int N = 7; //���� �� ���������� ���� ������ � ���������� (scanner), �� ���������� ��������� ����������
		switch (N) {
		case 1:
			System.out.println("����"); 
			break;
		case 2:
			System.out.println("����"); 
			break;
		case 3:
			System.out.println("�����"); 
			break;
		case 4:
			System.out.println("�����"); 
			break;
		case 5:
			System.out.println("�����"); 
			break;
		case 6:
			System.out.println("����"); 
			break;
		case 7:
			System.out.println("����"); 
			break;
		case 8:
			System.out.println("����"); 
			break;
		case 9:
			System.out.println("�����"); 
			break;
		case 10:
			System.out.println("�����"); 
			break;
		case 11:
			System.out.println("�����"); 
			break;
		case 12:
			System.out.println("����");
			break;
		case 13:
			System.out.println("����� ����� ��� �� ���������");
			break;
		default:
			System.out.println("error. ��� ����� ��������");
			break;
			}

		 // Case5
		int N = 5;
		double A = 4, B = 5, C = 0;
		switch (N) {
		case 1:
			C = A + B;
			break;
		case 2:
			C = A - B;
			break;
		case 3:
			C = A * B;
			break;
		case 4:
			C = A / B;
			break;
		default:
			System.out.println("������ ���� ��������");
			break;
			return; // �������� ������ �� ���������
			
		}

	System.out.println(C);

		// Case6
		Scanner in = new Scanner(System.in);
		System.out.print("������� ������� ��������� (1 - ��., 2 - ��., 3 - �., 4 - ��., 5 ��.): ");
		int N = in.nextInt();
		System.out.print("������� ��������: ");
		double A = in.nextInt();
//		//int N = 7; //���� �� ���������� ���� ������ � ���������� (scanner), �� ��������� ��������� ����������
//		//int N = 4;
//		//double A = 543, C = 0;
		double C = 0;
		switch (N) {
		case 1:
			C = A / 10; //����������
			System.out.println("����� �������: " + C + " �����(��)");
			break;
		case 2:
			C = A * 1000; //����������
			System.out.println("����� �������: " + C + " �����(��)");
			break;
		case 3:
			C = A; //������
			System.out.println("����� �������: " + C + " �����(��)");
			break;
		case 4:
			C = A / 1000; //�����������
			System.out.println("����� �������: " + C + " �����(��)");
			break;
		case 5:
			C = A / 100; //�����������
			System.out.println("����� �������: " + C + " �����(��)");
			break;
		default:
			System.out.println("error");
			break;
			
		}

		// Case10
		Scanner in = new Scanner(System.in);
		System.out.print("�������� �������� ����������� (�����, �����, ��, ������): ");
		String [] dir = {"�����","�����","��","������"}; 
		String C = in.next();
		System.out.print("������� �������: ");
		int N = in.nextInt(); // ���� ����������� -1, 0 ��� 1
		//int N = -1; ////���� �� ���������� ���� ������ � ���������� (scanner), �� ���������� ��������� ���������� 
		int ind = 0;
		//char [] dir = {'�','�','�','�'};
		//char C = '�';
		switch (C) {
		case "�����":
			ind = 0;
			break;
		case "�����":
			ind = 1;
			break;
		case "��":
			ind = 2;
			break;
		case "������":
			ind = 3;
			break;
		default: //������ �� ������������??
			System.out.println("error");
			break;
		}
		switch (N) {
		case 1:
			ind = ++ind % 4; break;
		case -1:
			ind = (--ind + 4) % 4; break;  

		}
		System.out.println(dir[ind]);

		// Case11
		Scanner in = new Scanner(System.in);
		System.out.print("�������� �������� ���������� �������� (�����, �����, ��, ������): ");
		String[] dir = { "�����", "�����", "��", "������" };
		String C = in.next();
		System.out.print("������� ������� N1: ");
		int N1 = in.nextInt(); // ���� ����������� N1 -1, 1 ��� 2
		System.out.print("������� ������� N2: ");
		int N2 = in.nextInt(); // ���� ����������� N2 -1, 1 ��� 2

		// int N1 = -1; ////���� �� ���������� ���� ������ � ���������� (scanner), ��
		// ���������� ��������� ����������
		// int N2 = -1; ////���� �� ���������� ���� ������ � ���������� (scanner), ��
		// ���������� ��������� ����������
		int ind = 0;
		// char [] dir = {'�','�','�','�'};
		// char C = '�';
		switch (C) {
		case "�����":
			ind = 0;
			break;
		case "�����":
			ind = 1;
			break;
		case "��":
			ind = 2;
			break;
		case "������":
			ind = 3;
			break;
		default: // ������ �� ������������??
			System.out.println("error");
			break;
		}
		switch (N1) {
		case 1:
			ind = ++ind % 4;
			break;
		case -1:
			ind = (--ind + 4) % 4;
			break;
		case 2:
			ind = (ind + 2) % 4;
			break;
		}
		switch (N2) {
		case 1:
			ind = ++ind % 4;
			break;
		case -1:
			ind = (--ind + 4) % 4;
			break;
		case 2:
			ind = (ind + 2) % 4;
			break;
		}

		System.out.println(dir[ind]);

		// Case12

		Scanner in = new Scanner(System.in);
		System.out.print("������� ������� ��������� (1 - R, 2 - D, 3 - L, 4 - S): ");
		int N = in.nextInt();
		System.out.print("������� ��������: ");
		double A = in.nextInt();
//		//int N = 7; //���� �� ���������� ���� ������ � ���������� (scanner), �� ��������� ��������� ����������
//		//int N = 4;
//		//double A = 543, C = 0;
		double xR = 0, xD = 0, xL = 0, xS = 0;
		switch (N) {
		case 1: //������ ������
			xR = A; //������� ������
			xD = A * 2; //������� �������
			xL = A * 2 * Math.PI; //������� �����
			xS = Math.PI * (A * A); //������� �������
			System.out.println("������ ����������: " + xR);
			System.out.println("������� ����������: " + xD);
			System.out.println("����� ����������: " + xL);
			System.out.println("������� ����������: " + xS);
			break;
		case 2: //������ �������
			xR = A / 2; //������� ������
			xD = A; //������� �������
			xL = A * Math.PI; //������� �����
			xS = (A * A) / 4 * Math.PI; //������� �������
			System.out.println("������ ����������: " + xR);
			System.out.println("������� ����������: " + xD);
			System.out.println("����� ����������: " + xL);
			System.out.println("������� ����������: " + xS);
			break;
		case 3: //������� �����
			xR = A / (2 * Math.PI); //������� ������
			xD = A / Math.PI; //������� �������
			xL = A; //������� �����
			xS = (A * A) / (4 * Math.PI); //������� �������
			System.out.println("������ ����������: " + xR);
			System.out.println("������� ����������: " + xD);
			System.out.println("����� ����������: " + xL);
			System.out.println("������� ����������: " + xS);
			break;
		case 4: //������� �������
			xR = Math.sqrt(A / Math.PI); //������� ������
			xD = Math.sqrt(A / Math.PI) * 2; //������� �������
			xL = Math.sqrt(A * 4 * Math.PI); //������� �����
			xS = A; //������� �������
			System.out.println("������ ����������: " + xR);
			System.out.println("������� ����������: " + xD);
			System.out.println("����� ����������: " + xL);
			System.out.println("������� ����������: " + xS);
			break;
		default:
			System.out.println("error");
			break;
			
		}

			
			
		}
		
		
	}

