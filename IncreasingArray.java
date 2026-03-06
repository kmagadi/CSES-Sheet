import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IncreasingArray
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));

        int n = Integer.parseInt( br.readLine() );
        if( n == 0 )
        {
            System.out.println( 0 );
            return;
        }

        StringTokenizer st = new StringTokenizer( br.readLine() );
        long[] a = new long[ n ];

        for( int i = 0; i < n; i++ )
        {
            a[ i ] = Long.parseLong( st.nextToken() );
        }

        System.out.println( increasingNum( a ) );
    }

    private static long increasingNum( long[] a )
    {
        long totalMoves = 0;

        for( int i = 1; i < a.length; i++ )
        {
            if ( a[ i ] < a[ i - 1 ] )
            {
                long diff = a[ i - 1 ] - a[ i ];
                totalMoves += diff;
                a[ i ] = a[ i - 1 ];
            }
        }

        return totalMoves;
    }
}