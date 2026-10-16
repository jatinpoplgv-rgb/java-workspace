package Stringbuilder1;

public class Reverse
{
	public static void main(String[] args) {
        String text = "java";

        StringBuilder sb = new StringBuilder(text);
        sb.reverse();

        System.out.println(sb);
    }
}
