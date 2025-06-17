/**
 * This Java program processes a given string in two main steps:
 * 1. Extracts characters at even indices, reverses the resulting string.
 * 2. Removes specific unwanted characters from the reversed string.
 *
 * Purpose:
 * This could simulate filtering or obfuscating data by removing
 * unwanted characters from a patterned, reversed string.
 */


public class EvenString {
public static void main(String[] args)
{
    String s="friufjkuifkwfuerkvijeyewehep9ofduqfkcvaoByfxkuieemkskgus1akrfwfnehiuehaiHlifuraakduboeackceqezazfiLs";
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<s.length();i++)
    {
        if(i%2==0)
        {
            sb.append(s.charAt(i));
        }
    }
    sb.reverse();
    System.out.println(sb);
    String del ="akfeiu";
    StringBuilder part2 = new StringBuilder();
    for(int i=0;i<sb.length();i++)
    {
        char ch = sb.charAt(i);
        if(del.indexOf(ch)==-1)
        {
            part2.append(ch);
        }
    }
    System.out.println(part2);
}
 
}
