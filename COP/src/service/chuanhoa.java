package service;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class chuanhoa {

/*	public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println("Xau truoc khi chuan hoa: \n"+s);
        System.out.println("Xau sau khi chuan hoa: \n"+getRes(s.toLowerCase()).toString());
        System.out.println("");
    }
    */
   public static StringBuilder getRes(String s ){
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(s);
        StringBuilder sb = new StringBuilder(matcher.replaceAll(" "));
        if(sb.charAt(0) == ' ') sb.deleteCharAt(0);
        if( sb.charAt(sb.length()-1) == ' ') sb.deleteCharAt(sb.length()-1);
        
        for( int i = 0; i< sb.length(); i++ ){
            if( i < sb.length()-1 ){
                if( (sb.charAt(i) == ',' || sb.charAt(i) == '.' || sb.charAt(i) == '?' 
                        || sb.charAt(i) == ';' || sb.charAt(i) == ':' || sb.charAt(i) == '!')
                        && sb.charAt(i+1) != ' '){
                    sb.insert(i+1, " ");
                }
            }
        }
        
        for( int i = 0; i< sb.length(); i++ ){
            if( i < sb.length()-1 ){
                if( (sb.charAt(i+1) == ',' || sb.charAt(i+1) == '.' || sb.charAt(i+1) == '?' 
                        || sb.charAt(1+i) == ';' || sb.charAt(i+1) == ':' || sb.charAt(1+i) == '!')
                        && sb.charAt(i) == ' '){
                    sb.deleteCharAt(i);
                }
            }
        }
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        
        for( int i = 0; i< sb.length(); i++ ){
            if( i < sb.length()-2 ){
                if( sb.charAt(i) == '.' || sb.charAt(i) == '?' || sb.charAt(i) == '!'){
                    sb.setCharAt(i+2, Character.toUpperCase(sb.charAt(2+i)));
                }
            }
        }
        
        return sb;
        
    }
	
}
