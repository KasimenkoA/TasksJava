package School;

public class Bag
    {
        public String color;
        public String firm;
        public PencilBox pencilBox;

        public void getInfo()
            {
                System.out.println("Ïמנעפוכü " + this.firm + " צגוע " + this.color + ".");
                System.out.println("Â ןמנעפוכו: ");
                pencilBox.getInfo();
            }
    }


