package Tasks.Tasks200;

public class Task160
    {
        public static void main( String[] args )
            {
                String[] mas = {"красный", "оранжевый", "желтый", "зеленый", "голубой", "синий", "фиолетовый"};

                for (String cc : mas)
                    {
                        if (cc.startsWith( "о" )) continue;

                        System.out.println(cc);
                    }
            }
    }
