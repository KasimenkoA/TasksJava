package Tasks.Tasks50;

import java.util.Random;

public class Task17
    {
        public static void main( String[] args )
            {
                Random random = new Random();
                int nn = 0;
                String ss = "";

                for (int i = 0; i < 100; i++)
                    {
                        nn = random.nextInt(4);

                        switch (nn)
                            {
                                case 0:
                                    ss = "�����";
                                    break;
                                case 1:
                                    ss = "��";
                                    break;
                                case 2:
                                    ss = "�����";
                                    break;
                                case 3:
                                    ss = "������";
                                    break;
                                default:
                                    ss = "�� �������";
                            }

                        System.out.printf("�����: %d - %s\n", nn, ss);
                    }
            }
    }
