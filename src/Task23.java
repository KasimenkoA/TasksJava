public class Task23
    {
        public static void main( String[] args )
            {
                String[] mas = new String[3];

                mas[0] = "январь";
                mas[1] = "февраль";
                mas[2] = "март";

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

                System.out.println("Самая длинная строка: " + ssMax);
                System.out.println("Длина строки: " + nnMax);
            }
    }
