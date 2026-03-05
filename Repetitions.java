import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repetitions
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
        String s = br.readLine();

        System.out.println( longestRepetition( s ));
    }
    private static int longestRepetition( String s )
    {
        int max = 1;
        int count = 1;

        for( int i = 1; i < s.length(); i++ )
        {
            if( s.charAt( i ) == s.charAt( i - 1 ))
            {
                count++;
            }
            else
            {
                max = Math.max( max, count );
                count = 1;
            }
        }

        return Math.max( max, count );
    }
}