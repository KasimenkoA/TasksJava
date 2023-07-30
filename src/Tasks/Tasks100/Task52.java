package Tasks.Tasks100;

import School.Pupil;

import java.util.ArrayList;

public class Task52
    {
        public static void main( String[] args )
            {
                ArrayList<Pupil> arrayList1 = new ArrayList<>();
                for (int i = 0; i < 100; i++)
                    {
                        arrayList1.add( new Pupil() );
                    }

                ArrayList<Pupil> arrayList2 = new ArrayList<>();
                for (Pupil pupil : arrayList1)
                    {
                        if (pupil.name.equals( "Захар" )) arrayList2.add( pupil );
                    }

                for (Pupil pupil : arrayList2)
                    {
                        pupil.getInfo();
                    }
            }
    }


