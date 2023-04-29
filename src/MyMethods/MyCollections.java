package MyMethods;

import School.Bag;
import School.PencilBox;

import java.util.Random;

public class MyCollections
    {
        public static int[] getMasRandomInteger(int size, int bound)
            {
                int[] mas = new int[size];

                Random random = new Random();
                for (int i = 0; i < mas.length; i++)
                    {
                        mas[i] = random.nextInt(bound);
                    }

                return mas;
            }

        public static int getRandomFromTo(int i_from, int i_to)
            {
                if (i_to<i_from) return i_from;

                int rr = 0;

                int bound = i_to - i_from + 1;

                Random random = new Random();
                rr = i_from + random.nextInt(bound);

                return rr;
            }

        public static String[] getColors()
            {
                String[] mas = new String[10];

                mas[0] = "�������";
                mas[1] = "���������";
                mas[2] = "������";
                mas[3] = "�������";
                mas[4] = "�������";
                mas[5] = "�����";
                mas[6] = "����������";
                mas[7] = "�����";
                mas[8] = "������";
                mas[9] = "����������";

                return mas;
            }

        public static String[] getFirms()
            {
                String[] mas = new String[10];

                mas[0] = "Berlingo";
                mas[1] = "Brauberg";
                mas[2] = "Centropen";
                mas[3] = "Hatber";
                mas[4] = "Erich Krause";
                mas[5] = "Herlitz Loop";
                mas[6] = "Ergoflex";
                mas[7] = "ZNATOK";
                mas[8] = "Tiger Family";
                mas[9] = "SkyName";

                return mas;
            }

        public static String[] getPupilsNames()
            {
                String[] mas = new String[20];

                mas[0] = "����";
                mas[1] = "���";
                mas[2] = "�����";
                mas[3] = "����";
                mas[4] = "������";
                mas[5] = "����";
                mas[6] = "����";
                mas[7] = "���";
                mas[8] = "������";
                mas[9] = "�����";
                mas[10] = "�����";
                mas[11] = "�����";
                mas[12] = "������";
                mas[13] = "������";
                mas[14] = "����";
                mas[15] = "����";
                mas[16] = "����";
                mas[17] = "����";
                mas[18] = "������";
                mas[19] = "����";

                return mas;
            }

        public static Bag getRandomBag()
            {
                Bag bag = new Bag();

                int nn;
                Random random = new Random();

                String[] firms = getFirms();
                nn = random.nextInt( firms.length);
                bag.firm = firms[nn];

                String[] colors = getColors();
                nn = random.nextInt( colors.length);
                bag.color = colors[nn];

                bag.pencilBox = new PencilBox();

                return bag;
            }
    }
