import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Permutations
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));

        int n = Integer.parseInt( br.readLine() );
        if( n == 1 )
        {
            System.out.println(1);
        }
        else if( n < 4 )
        {
            System.out.println( "NO SOLUTION" );
        }
        else
        {
            StringBuilder sb = checkPermutation( n );

            if( sb.length() == 0 )
                System.out.println("NO SOLUTION");
            else
                System.out.println( sb.toString() );
        }
    }

    private static StringBuilder checkPermutation( long n )
    {
        StringBuilder sb = new StringBuilder();

        for( int i = 1; i <= n; i++ )
        {
            if( i % 2 == 0 )
            {
                sb.append( i + " " );
            }
        }
        for( int i = 1; i <= n; i++ )
        {
            if( i % 2 != 0 )
            {
                sb.append( i + " " );
            }
        }

        return sb;
    }
}
