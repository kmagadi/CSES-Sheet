import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeirdNum
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
        long n = Long.parseLong(br.readLine());

        StringBuilder sb = new StringBuilder();

        sb.append( n + " " );

        weirdNum( n, sb );

        System.out.println( sb.toString() );
    }
    private static void weirdNum( long n, StringBuilder sb )
    {
        while( n != 1 )
        {
            if( n % 2 == 0 )
            {
                n = n / 2;
            }
            else
            {
                n = ( n * 3 ) + 1;
            }
            sb.append( n + " " );
        }
    }
}