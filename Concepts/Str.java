import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        // String method and substring 
        String name = "Piyush bhatt";
        // char x = 'A';
        // if (x >= 90) {
        //     System.out.println("G");
        // } else {
        //     System.out.println("S");
        // }

        // System.out.println(name.length());
        // System.out.println(name.charAt(6));
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());
        // System.out.println(name.replace("i", "e"));
        // System.out.println(name.substring(0, 6));
        

        Scanner sc = new Scanner(System.in);

        //length of arr
        // int n = sc.nextInt();
        // sc.nextLine(); // consume leftover newline

        // char [] ch = new char[n];
        
        // // input as string "algo"
        // String st = sc.nextLine();

        // for(int i=0; i<n; i++){
        //     ch[i] = st.charAt(i);
        // };

        // Toogle(ch);

        // reverse char []

        //length of arr
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        char [] ch = new char[n];
        
        // // input as string "algo"
        String st = sc.nextLine();

        for(int i=0; i<n; i++){
            ch[i] = st.charAt(i);
        };

        reverse(ch);

        sc.close();
    }

    //Toogle function
    public static void Toogle(char[] ch){
        for(int i=0; i<ch.length; i++){
            //to check uppercase
            if (ch[i] >= 65 && ch[i] <= 90) {
                ch[i] = (char)(ch[i] + 32);
                System.out.print(ch[i]);
            } else {
                ch[i] = (char)(ch[i] - 32);
                System.out.print(ch[i]);
            }
        }
    };

    //Reverse Function
    public static void reverse(char[] ch) {
        for(int i=ch.length-1; i>=0; i--){
            System.out.print(ch[i]);
        }
    };
}
