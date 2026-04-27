import java.io.*;
import java.util.Scanner;
public class StudentData {
   public static void main(String[] args) {
    
    try{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        String name=sc.nextLine();
        System.out.print("Enter the age of the student: ");
        int age=sc.nextInt();
        System.out.print("Enter weight: ");
        float weight=sc.nextFloat();
        System.out.print("Enter Height: ");
        float height=sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter City: ");
        String city=sc.nextLine();
        System.out.print("Enter phone number: ");
        long phone=sc.nextLong();
        FileOutputStream fos=new FileOutputStream("studentdata.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeUTF(name);
        dos.writeInt(age);
        dos.writeFloat(weight);
        dos.writeFloat(height);
        dos.writeUTF(city);
        dos.writeLong(phone);
        dos.close();

        FileInputStream fis=new FileInputStream("studentdata.txt");
        DataInputStream dis=new DataInputStream(fis);
        System.out.println("\nStudent Information:");
        System.out.println("Name: "+dis.readUTF());
        System.out.println("Age: "+dis.readInt());
        System.out.println("Weight: "+dis.readFloat());
        System.out.println("Height: "+dis.readFloat());
        System.out.println("City: "+dis.readUTF());
        System.out.println("Phone: "+dis.readLong());

        dis.close();
    }
    catch(Exception e){
        System.out.println(e);
    }
   }    
}
