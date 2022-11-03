package arquivos;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Arquivos {

    public static void main(String[] args) {
        //Passo 01- Quem é o arquivo, onde ele está?
        String arquivo = "C:\\Users\\22282470\\java-armazenamento\\teste.txt";

        //Passo 02- Criar um objeto Path
        Path path = Paths.get(arquivo);

        //Passo 03- Criar um escritor
        try {
            BufferedWriter bw = Files.newBufferedWriter(
                    path,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
        //Passo 04- Passar o conteúdo que será escrito no arquivo
        bw.write("TA NA HORA DO JAIR");
        bw.newLine();
        bw.write("TA NA HORA DO JAIR");
        bw.newLine();
        bw.write("JA");
        bw.newLine();
        bw.write("IR");
        bw.newLine();
        bw.write("EMBORA");
        bw.newLine();
        
        //Passo 05- Fechando o arquivo
        bw.close();
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "O arquivo não foi encontrado");
        }
        
    }

}
