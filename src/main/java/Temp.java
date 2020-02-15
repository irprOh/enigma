public class Temp {
    public static void main(String[] args) {
      //  System.out.println((char)(int)(('A')+3));
        String mama = "x";
        StringBuilder stringbuilder = new StringBuilder();
        char[] lettersInMamaBoard = mama.toCharArray();
        for(char newLetter: lettersInMamaBoard){
         //   int newLetter;
            switch (newLetter){
                case 'x': newLetter = 90;
                case 'y': newLetter = 'b';
                case 'z': newLetter = 'c';
                case 'X': newLetter = 'A';
                case 'Y': newLetter = 'B';
                case 'Z': newLetter = 'C';
          //     default: newLetter = (char) (newLetter + 3);
                }
            System.out.print((char)newLetter);
            stringbuilder.append((char) newLetter);
        }
 //       System.out.println(stringbuilder.toString());
    }
}
