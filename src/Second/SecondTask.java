package Second;

import java.io.*;

public class SecondTask {
    public static void main(String[] args) {
        String filePath = "/Users/akotkova/IdeaProjects/task/src/Second/textFile";
        String targetWord = "осенний";
        String replacementWord = "весенний";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            File tempFile = new File("/Users/akotkova/IdeaProjects/task/src/Second/tempfile.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;

            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replaceAll(targetWord, replacementWord);

                writer.write(modifiedLine);
                writer.newLine();
            }
            reader.close();
            writer.close();

            File originalFile = new File(filePath);
            originalFile.delete();

            tempFile.renameTo(originalFile);

            System.out.println("Изменения успешно выполнены");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
