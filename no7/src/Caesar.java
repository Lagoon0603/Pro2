public class Caesar {
    public static void main(String[] args) {
        boolean isEncrypt = args[0].equals("true"); 
        
        int k = Integer.parseInt(args[1]); 

        int shift = 0;
        if (isEncrypt) {
            shift = k;
        } else {
            shift = -k;
        }
        
        shift = (shift % 26 + 26) % 26; 

        StringBuffer result = new StringBuffer();

        for (int i = 2; i < args.length; i++) {
            String word = args[i];
            
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j); 
                
                if (c >= 'a' && c <= 'z') {
                    char shifted = (char) ('a' + (c - 'a' + shift) % 26);
                    result.append(shifted); 
                } else {
                    result.append(c);
                }
            }
            
            if (i < args.length - 1) {
                result.append(" ");
            }
        }

        System.out.println(result.toString()); 
    }
}