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

                mas[0] = "красный";
                mas[1] = "оранжевый";
                mas[2] = "желтый";
                mas[3] = "зеленый";
                mas[4] = "голубой";
                mas[5] = "синий";
                mas[6] = "фиолетовый";
                mas[7] = "белый";
                mas[8] = "черный";
                mas[9] = "коричневый";

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

                mas[0] = "Катя";
                mas[1] = "Оля";
                mas[2] = "Настя";
                mas[3] = "Лена";
                mas[4] = "Оксана";
                mas[5] = "Надя";
                mas[6] = "Даша";
                mas[7] = "Юля";
                mas[8] = "Наташа";
                mas[9] = "Света";
                mas[10] = "Захар";
                mas[11] = "Степа";
                mas[12] = "Руслан";
                mas[13] = "Андрей";
                mas[14] = "Вова";
                mas[15] = "Коля";
                mas[16] = "Дима";
                mas[17] = "Саша";
                mas[18] = "Максим";
                mas[19] = "Боря";

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
                bag.textBooks = getRandomTextbooks();

                return bag;
            }

        public static String[] getPencilBoxItems()
            {
                String[] items = new String[20];
                items[0] = "ручка синяя";
                items[1] = "карандаш";
                items[2] = "линейка";
                items[3] = "циркуль";
                items[4] = "резинка";
                items[5] = "точилка";
                items[6] = "ножницы";
                items[7] = "транспортир";
                items[8] = "маркер";
                items[9] = "ластик";
                items[10] = "клей-карандаш";
                items[11] = "кисточка";
                items[12] = "краски";
                items[13] = "калькулятор";
                items[14] = "фломастеры";
                items[15] = "клей";
                items[16] = "ручка красная";
                items[17] = "ручка черная";
                items[18] = "скрепки";
                items[19] = "закладки";

                return items;
            }

        public static String[] getRandomPencilBoxItems()
            {
                int size = 5;
                String[] items = getPencilBoxItems();
                String[] itemsNew = new String[size];

                int nn;
                Random random = new Random();

                for (int i = 0; i < size; i++)
                    {
                        nn = random.nextInt(items.length);
                        itemsNew[i] = items[nn];
                    }

                return itemsNew;
            }

        public static String[] getTextbooks()
            {
                String[] items = new String[10];
                items[0] = "Русский язык";
                items[1] = "Математика";
                items[2] = "Окружающий мир";
                items[3] = "Литературное чтение";
                items[4] = "История";
                items[5] = "География";
                items[6] = "Биология";
                items[7] = "Физика";
                items[8] = "Информатика";
                items[9] = "Английский";

                return items;
            }

        public static String[] getRandomTextbooks()
            {
                int size = 5;
                String[] items = getTextbooks();
                String[] itemsNew = new String[size];

                int nn;
                Random random = new Random();

                for (int i = 0; i < size; i++)
                    {
                        nn = random.nextInt(items.length);
                        itemsNew[i] = items[nn];
                    }

                return itemsNew;
            }
    }
