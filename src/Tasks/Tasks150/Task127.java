package Tasks.Tasks150;

public class Task127
    {
        public static void main( String[] args )
            {
                Fruit apple = new Fruit( "apple","red",250 );
                System.out.println("Tasks.Tasks150.Fruit: " + apple.getName() + ", color: " + apple.getColor() + ", weight: " + apple.getWeight());
            }
    }

class Fruit
    {
        private String name;
        private String color;
        private int weight;

        public Fruit( String name, String color, int weight )
            {
                this.name = name;
                this.color = color;
                this.weight = weight;
            }

        public String getName()
            {
                return name;
            }

        public String getColor()
            {
                return color;
            }

        public int getWeight()
            {
                return weight;
            }
    }
