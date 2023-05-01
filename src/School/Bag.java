package School;

public class Bag
    {
        public String color;
        public String firm;
        public PencilBox pencilBox;
        public String[] textBooks;

        public void getInfo()
            {
                System.out.println("Портфель " + this.firm + " цвет " + this.color + ".");
                System.out.println("В портфеле:");
                pencilBox.getInfo();
                System.out.println("Учебники:");
                for (String ss: this.textBooks)
                    {
                        System.out.println(ss);
                    }
            }
    }


