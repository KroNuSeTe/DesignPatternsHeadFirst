package DecoratorPattern.JavaIODecorator;

import java.io.*;

public class InputTest{

    public static void main(String[] args) throws IOException{

        int c;

        try{
            InputStream in = new UpperToLowercase(
                new BufferedInputStream(
                    new FileInputStream("DecoratorPattern/JavaIODecorator/test.txt")));
            
            while((c = in.read()) >= 0 ){
                System.out.print((char)c);
            }

            in.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}