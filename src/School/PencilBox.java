package School;

import MyMethods.MyCollections;

import java.util.Random;

public class PencilBox
    {
        public String color;

        public PencilBox()
            {
                String[] colors = MyCollections.getColors();
                int nn;
                Random random = new Random();
                nn = random.nextInt(colors.length);
                this.color = colors[nn];
            }

        public void getInfo()
            {
                System.out.println("Пенал " + this.color + ".");
            }
    }
