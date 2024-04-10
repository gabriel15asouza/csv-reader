import java.io.*;
import java.util.ArrayList;

public class CSVReader {

    public static void main(String[] args) {

        String path = "C:\\Users\\gabal\\OneDrive\\Área de Trabalho\\GABRIEL\\FATEC\\BD\\2 SEM\\csv-reader\\JavaRead\\Materials\\test.csv";
        String line = "";

        try{
            ArrayList<Person> people = new ArrayList<>();
            CSV csv = new CSV(people);
            BufferedReader br = new BufferedReader((new FileReader(path)));
            int i=0;


            while((line = br.readLine()) != null ) {
                if (i!=0) {
                    String[] values = line.split(";");
                    System.out.println("Nome: " + values[0] + ", Idade: " + values[1]);
                    Person person = new Person(values[0], values[1]);
                    csv.adicionarElemento(person);
                    i++;
                } else {
                    String[] indice = line.split(";");
                    i++;
                }
            }
            br.close();
//            for (i=0; i<people.size(); i++) {
//                System.out.println(people.get(i).getName());
//            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}