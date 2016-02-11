package reader;

import java.util.Scanner;

public class FileReader {

    public FileReader() {
    }

    public Result readFile(String path) throws IllegalFileException{
        int row = 0;
        int colum = 0;
        String textResult = null;
        int cont = 0;

        try {
            Scanner sc = new Scanner(path);
            while (sc.hasNext()){
                if (cont == 0) {
                    row = sc.nextInt();
                    colum = sc.nextInt();
                    sc.nextLine();
                }else{
                    textResult += sc.nextLine()+"\n\r";
                }
                cont++;
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new IllegalFileException();
        }


		return new Result(textResult, row, colum);
    }

}
