package Tasks.Tasks50;

public class Task18
    {
        public static void main( String[] args )
            {
                String[] mas_c = new String[3];
                String[] mas_f = new String[3];

                mas_c[0] = "�������";
                mas_c[1] = "������";
                mas_c[2] = "�����";

                mas_f[0] = "������";
                mas_f[1] = "�������";
                mas_f[2] = "����";

                for (int i = 0; i < mas_c.length; i++)
                    {
                        for (int j = 0; j < mas_f.length; j++)
                            {
                                System.out.println("" + mas_c[i] + " " + mas_f[j]);
                            }
                    }
            }
    }
