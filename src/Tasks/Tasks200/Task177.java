package Tasks.Tasks200;

import java.util.Scanner;

public class Task177
    {
        public static void main( String[] args )
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("������� ������ �� 1 �� 5: ");
                int nn = scanner.nextInt();

                switch (nn)
                    {
                        case 1:
                            System.out.println("�����");
                            break;
                        case 2:
                            System.out.println("�����������������");
                            break;
                        case 3:
                            System.out.println("������");
                            break;
                        case 4:
                            System.out.println("�������");
                            break;
                        case 5:
                            System.out.println("�����");
                            break;
                        default:
                            System.out.println("�� ����������");
                    }
            }
    }
