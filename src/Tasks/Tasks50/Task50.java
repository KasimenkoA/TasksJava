package Tasks.Tasks50;

import School.Pupil;

import java.util.ArrayList;

public class Task50
    {
        public static void main( String[] args )
            {
                ArrayList<Pupil> arrayList = new ArrayList<>();
                for (int i = 0; i < 100; i++)
                    {
                        arrayList.add( new Pupil() );
                    }

                int sum_age = 0;
                for (Pupil pupil : arrayList)
                    {
                        pupil.getInfo();
                        sum_age += pupil.age;
                    }

                System.out.println();
                System.out.println("Средний возраст ученика: " + (sum_age/100) + " лет.");
            }
    }
