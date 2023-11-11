package Tasks.Tasks250;

import java.util.ArrayList;
import java.util.Random;

class Hero249
    {
        private int power;
        private int defense;
        private int magic;

        public Hero249( int power, int defense, int magic )
            {
                this.power = power;
                this.defense = defense;
                this.magic = magic;
            }

        public int getPower()
            {
                return power;
            }

        public void setPower( int power )
            {
                this.power = power;
            }

        public int getDefense()
            {
                return defense;
            }

        public void setDefense( int defense )
            {
                this.defense = defense;
            }

        public int getMagic()
            {
                return magic;
            }

        public void setMagic( int magic )
            {
                this.magic = magic;
            }
    }

public class Task249
    {
        public static void main( String[] args )
            {
                ArrayList<Hero249> arrayList = new ArrayList<>();

                Random random = new Random();

                for (int i = 0; i < 10; i++)
                    {
                        arrayList.add( new Hero249(random.nextInt(100),random.nextInt(100),random.nextInt(100)) );
                    }

                for (Hero249 hero : arrayList)
                    {
                        System.out.println("Hero. Power: " + hero.getPower() + ". Defense: " + hero.getDefense() +
                                ". Magic: " + hero.getMagic() + ".");
                    }
            }
    }
