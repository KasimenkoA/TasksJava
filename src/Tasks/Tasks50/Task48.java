package Tasks.Tasks50;

import School.Pupil;

import java.util.ArrayList;

public class Task48
    {
        public static void main(String[] args){
            ArrayList<Pupil> pupils = new ArrayList<>();

            Pupil pupil1 = new Pupil();
            pupil1.name = "����";
            pupil1.age = 11;

            Pupil pupil2 = new Pupil();
            pupil2.name = "����";
            pupil2.age = 9;

            Pupil pupil3 = new Pupil();
            pupil3.name = "���";
            pupil3.age = 10;

            pupils.add( pupil1 );
            pupils.add( pupil2 );
            pupils.add( pupil3 );

            for (Pupil pupil : pupils)
                {
                    pupil.getInfo();
                }
        }
    }
