package Tasks.Tasks100;

import School.Pupil;

import java.util.ArrayList;

public class Task51
    {
        public static void main(String[] args){
            Pupil pupil;
            ArrayList<Pupil> list3 = new ArrayList<>();
            ArrayList<Pupil> list4 = new ArrayList<>();
            ArrayList<Pupil> list5 = new ArrayList<>();

            for (int i = 0; i < 100; i++)
                {
                    pupil = new Pupil();
                    if (pupil.age<10) list3.add( pupil );
                    else if (pupil.age==10) list4.add( pupil );
                    else list5.add( pupil );
                }

            System.out.println("3 класс:");
            for (Pupil pup : list3)
                {
                    pup.getInfo();
                }
            System.out.println();

            System.out.println("4 класс:");
            for (Pupil pup : list4)
                {
                    pup.getInfo();
                }
            System.out.println();

            System.out.println("5 класс:");
            for (Pupil pup : list5)
                {
                    pup.getInfo();
                }
            System.out.println();
        }
    }


