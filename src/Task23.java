public class Task23
    {
        public static void main( String[] args )
            {
                String[] mas = new String[3];

                mas[0] = "������";
                mas[1] = "�������";
                mas[2] = "����";

                String ssMax = mas[0];
                int nnMax = mas[0].length();

                for (int i = 0; i < mas.length; i++)
                    {
                        if (mas[i].length() > nnMax )
                            {
                                ssMax = mas[i];
                                nnMax = mas[i].length();
                            }
                    }

                System.out.println("����� ������� ������: " + ssMax);
                System.out.println("����� ������: " + nnMax);
            }
    }
