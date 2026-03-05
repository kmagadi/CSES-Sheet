import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingNumber
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
        long n = Long.parseLong( br.readLine() );

        String[] parts = br.readLine().split(" ");

        long[] a = new long[ ( int ) n - 1];

        for (int i = 0; i < n - 1; i++) {
            a[i] = Long.parseLong( parts[ i ]);
        }

        System.out.println( missingNum( n, a ));
    }
    private static long missingNum( long n, long[] a )
    {
        long sum = n * ( n + 1 ) / 2;

        for( long ele : a )
        {
            sum -= ele;
        }

        return sum;
    }
}