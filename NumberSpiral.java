import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

public class NumberSpiral
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0)
        {
            String[] input = br.readLine().split(" ");
            long y = Long.parseLong(input[0]);
            long x = Long.parseLong(input[1]);

            long k = Math.max(x, y);
            long ans;

            if (k % 2 == 0)
            {
                if (y == k)
                {
                    ans = k * k - (x - 1);
                }
                else
                {
                    ans = (k - 1) * (k - 1) + y;
                }
            }
            else
            {
                if (x == k)
                {
                    ans = k * k - (y - 1);
                }
                else
                {
                    ans = (k - 1) * (k - 1) + x;
                }
            }

            sb.append(ans).append("\n");
        }

        System.out.print(sb);
    }
}