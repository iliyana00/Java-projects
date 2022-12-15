import com.sun.tools.javac.Main;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Set;

public class AntivirusAlgoInJava {
    int count = 0;
    int size = 0;
    int occur = 0;
    HashMap hashMap = new HashMap();
    void readPattern(String filename) throws Exception {
        try
        {
            FileReader in = new FileReader(filename);
            BufferedReader br = new BufferedReader(in);
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                hashMap.put(line.substring(0, line.indexOf("/")), line.substring(line.indexOf("/") + 1, line.length()));
                ++i;
            }
            size = i;
            br.close();
        }
        catch(Exception e)
        {
            //System.out.println("Hello"+e);
        }
    }
    void searchVirus(String file) throws Exception {
        FileReader in = new FileReader(file);
        BufferedReader br = new BufferedReader(in);
        String line;
        while ((line = br.readLine()) != null) {
            Set keys = hashMap.keySet();
            count++;
            boolean containsKey = keys.contains(String.valueOf(count));
            if (containsKey) {
                String virus = (String) hashMap.get(String.valueOf(count));
                if (line.indexOf(virus) > -1) {
                    occur++;
                }
            }
        }
        br.close();
        if (size == occur) {
            JOptionPane.showMessageDialog(null, "Error", "Virus Detected ", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Clean File", "No Virus Found ", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void main(String []nix) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("Nimbus".equals(info.getName())) {

                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
        }
        try {
            AntivirusAlgoInJava fr = new AntivirusAlgoInJava();
            fr.readPattern("definitions.txt");
            fr.searchVirus("virus.exe");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
