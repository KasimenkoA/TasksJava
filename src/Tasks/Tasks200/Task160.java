package Tasks.Tasks200;

public class Task160
    {
        public static void main( String[] args )
            {
                String[] mas = {"�������", "���������", "������", "�������", "�������", "�����", "����������"};

                for (String cc : mas)
                    {
                        if (cc.startsWith( "�" )) continue;

                        System.out.println(cc);
                    }
            }
    }
