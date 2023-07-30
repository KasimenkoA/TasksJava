package Tasks.Tasks50;

public class Task31
    {
        public static void main( String[] args )
            {
                int yy = 0;

                for (int xx = 0; xx < 10; xx++)
                    {
                        for (int zz = 0; zz < 10; zz++)
                            {
                                yy = getY(xx,zz);
                                System.out.println("xx = " + xx + ", zz = " + zz + ", yy = " + yy);
                            }

                    }
            }

        private static int getY( int xx, int zz )
            {
                return (xx/7 + zz*8);
            }
    }
