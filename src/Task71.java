import School.Pupil;

public class Task71
    {
        public static void main( String[] args )
            {
                int size = 100;
                Pupil[] pupils = new Pupil[size];
                for (int i = 0; i < pupils.length; i++)
                    {
                        pupils[i] = new Pupil();
                    }

                int max_age = Integer.MIN_VALUE;
                for (Pupil pupil : pupils)
                    {
                        if (pupil.age > max_age) max_age = pupil.age;
                    }
                System.out.println("Максимальный возраст: " + max_age);

                for (Pupil pupil : pupils)
                    {
                        if (pupil.age == max_age)
                            {
                                System.out.println("Ученик " + pupil.name + ", возраст " + pupil.age);
                            }
                    }
            }
    }
