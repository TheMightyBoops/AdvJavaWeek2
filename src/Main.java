public class Main {

    public static void main(String [] args) {
        FileInput inData = new FileInput("test.txt");
        FileOutput outData = new FileOutput("out.txt");
        String line;
        String newLine;
        char key = 'A';

        while((line = inData.fileReadLine()) != null) {


            char[] letters = line.toCharArray();
            for(int i = 0; i < letters.length; ++i) {
                //letters[i] = (char)((int)letters[i] + 5);
                letters[i] = (char)((int)letters[i] ^ (int) key);
            }

            outData.fileWrite(new String(letters));
        }

        inData.fileClose();
        outData.fileClose();
        inData = new FileInput("out.txt");
        while((line = inData.fileReadLine()) != null) {


            char[] letters = line.toCharArray();
            for(int i = 0; i < letters.length; ++i) {
                //letters[i] = (char)((int)letters[i] - 5);
                letters[i] = (char)((int)letters[i] ^ (int) key);
            }

            outData.fileWrite(new String(letters));

        }

    }


}
