import java.io.*;

public class CSVReader {

    public static void main(String[] args) {

        String path = "C:\\Users\\gabal\\OneDrive\\Área de Trabalho\\GABRIEL\\FATEC\\BD\\2 SEM\\JavaRead\\Materials\\test.csv";
        String line = "";

        try{
            BufferedReader br = new BufferedReader((new FileReader(path)));
            int i=0;

            while((line = br.readLine()) != null ) {
                String var = "person" + i;
                String[] values = line.split(";");
                System.out.println("Data: "+ values[0]+", Hora: "+ values[1], );
//                Person var  = new Person(values[0], values[1]);
                Person person  = new Person(values[0], values[1]);
                System.out.println(person.getName());
                i++;
            }




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}