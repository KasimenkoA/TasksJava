package School;

public class Bag
    {
        public String color;
        public String firm;
        public PencilBox pencilBox;

        public void getInfo()
            {
                System.out.println("�������� " + this.firm + " ���� " + this.color + ".");
                System.out.println("� ��������: ");
                pencilBox.getInfo();
            }
    }


