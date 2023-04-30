package School;

import MyMethods.MyCollections;

import java.util.Random;

public class PencilBox
    {
        public String color;
        public String[] items;

        public PencilBox()
            {
                String[] colors = MyCollections.getColors();
                int nn;
                Random random = new Random();
                nn = random.nextInt(colors.length);
                this.color = colors[nn];

                this.items = MyCollections.getRandomPencilBoxItems();
            }

        public void getInfo()
            {
                System.out.println("Пенал " + this.color + ".");
                System.out.println("Содержимое пенала:");

                for (int i = 0; i < this.items.length; i++)
                    {
                        System.out.println(this.items[i]);
                    }
            }
    }
