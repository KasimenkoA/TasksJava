package School;

public class Bag
    {
        public String color;
        public String firm;
        public PencilBox pencilBox;
        public String[] textBooks;

        public void getInfo()
            {
                System.out.println("�������� " + this.firm + " ���� " + this.color + ".");
                System.out.println("� ��������:");
                pencilBox.getInfo();
                System.out.println("��������:");
                for (String ss: this.textBooks)
                    {
                        System.out.println(ss);
                    }
            }
    }


