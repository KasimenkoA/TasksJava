package Tasks.Tasks200;

import java.util.Scanner;

public class Task180
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("������� ����� ��������: ");
                String ss = scanner.nextLine().toLowerCase();

                switch (ss)
                    {
                        case "�������":
                        case "������":
                        case "�������":
                            System.out.println("����");
                            break;
                        case "����":
                        case "������":
                        case "���":
                            System.out.println("�����");
                            break;
                        case "����":
                        case "����":
                        case "������":
                            System.out.println("����");
                            break;
                        case "��������":
                        case "�������":
                        case "������":
                            System.out.println("�����");
                            break;
                        default:
                            System.out.println("�� ����������");
                    }
            }
    }
