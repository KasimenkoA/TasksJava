package Tasks.Tasks200;

public class Task175
    {
        public static void main( String[] args )
            {
                char ch = 'A';
                String ss = "AEIOU";
                String cur_ss;

                while (ch != 'Z')
                    {
                        cur_ss = String.valueOf( ch );
                        if (ss.contains( cur_ss ))
                            {
                                ch++;
                                continue;
                            }

                        System.out.println(ch);
                        ch++;
                    }
            }
    }
