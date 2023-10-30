package Tasks.Tasks250;

import java.net.MalformedURLException;
import java.net.URL;

public class Task241
    {
        public static void main( String[] args ) throws MalformedURLException
            {
                URL url = new URL( "https://www.google.com/" );

                System.out.println( "URL: " + url.toString() );
                System.out.println( "Протокол: " + url.getProtocol() );
                System.out.println( "Полномочия: " + url.getAuthority() );
                System.out.println( "Имя файла: " + url.getFile() );
                System.out.println( "Хост: " + url.getHost() );
                System.out.println( "Путь: " + url.getPath() );
                System.out.println( "Порт: " + url.getPort() );
                System.out.println( "Порт по умолчанию: " + url.getDefaultPort() );
                System.out.println( "Запрос: " + url.getQuery() );
                System.out.println( "Ссылка: " + url.getRef() );
            }
    }
