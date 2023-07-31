package Tasks.Tasks200;

public class Task159
    {
        public static void main( String[] args )
            {
                String[] mas = new String[7];
                mas[0] = "понедельник";
                mas[1] = "вторник";
                mas[2] = "среда";
                mas[3] = "четверг";
                mas[4] = "пятница";
                mas[5] = "суббота";
                mas[6] = "воскресенье";

                for (String mm : mas)
                    {
                        if (mm.length() == 7)
                            {
                                System.out.println(mm);
                            }
                    }
            }
    }
