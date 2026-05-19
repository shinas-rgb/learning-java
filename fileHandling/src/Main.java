import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Main {
  public static void main(String[] args) {

    // try {
    // File fileObj = new File("file.txt");
    // if (fileObj.createNewFile()) {
    // System.out.println("File created successfully " + fileObj.getName());
    // } else {
    // System.out.println("FIle already exists");
    // }
    // } catch (IOException e) {
    // System.out.println("An error occured");
    // e.printStackTrace();
    // }

    // try (FileWriter writerObj = new FileWriter("file.txt")) {
    // writerObj.write("This is written from java!");
    // System.out.println("Successfully wrote to the file");
    // } catch (IOException e) {
    // System.out.println("An error occured");
    // e.printStackTrace();
    // }

    // try (FileWriter writerObj = new FileWriter("file.txt", true)) {
    // writerObj.write("This line is appended");
    // System.out.println("Successfully appended text");
    // } catch (IOException e) {
    // System.out.println("An error occured");
    // e.printStackTrace();
    // }

    // File fileObj = new File("file.txt");
    // try (Scanner readerObj = new Scanner(fileObj)) {
    // while (readerObj.hasNextLine()) {
    // String data = readerObj.nextLine();
    // System.out.println(data);
    // }
    // } catch (FileNotFoundException e) {
    // System.out.println("An error occured");
    // e.printStackTrace();
    // }

    // if (fileObj.delete()) {
    // System.out.println("Deleted file " + fileObj.getName());
    // } else {
    // System.out.println("Failed to delete file");
    // }

    // try (FileInputStream input = new FileInputStream("file.txt")) {
    // int i;
    // while ((i = input.read()) != -1) {
    // System.out.print((char) i);
    // }
    // } catch (IOException e) {
    // System.out.println("An error occured");
    // e.printStackTrace();
    // }

    // try (FileInputStream input = new FileInputStream("image.jpg");
    // FileOutputStream output = new FileOutputStream("copiedImage.jpg")) {
    // int i;
    // while ((i = input.read()) != -1) {
    // output.write(i);
    // }
    // System.out.println("File copied successfully");
    // } catch (IOException e) {
    // System.out.println("An error occured");
    // e.printStackTrace();
    // }

    // String txt = "New text";
    // try (FileOutputStream output = new FileOutputStream("file.txt")) {
    // output.write(txt.getBytes());
    // System.out.println("Successfully wrote to the file\n" + txt.getBytes());
    // } catch (IOException e) {
    // System.out.println("An error occured");
    // e.printStackTrace();
    // }

    // try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    // String line;
    // while ((line = br.readLine()) != null) {
    // System.out.println(line);
    // }
    // } catch (IOException e) {
    // System.out.println("An error occured");
    // e.printStackTrace();
    // }

    try (BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"))) {
      bw.write("First line");
      bw.newLine();
      bw.write("Second Line");
      System.out.println("Successfully wrote to the file");
    } catch (IOException e) {
      System.out.println("An error occured");
      e.printStackTrace();
    }
  }
}
