package program.Application;

import program.Model.Feature;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import static java.awt.SystemColor.menu;
import static program.Model.Feature.LoadData;

public class Application {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws SQLException, IOException, ParserConfigurationException, TransformerException {
        Feature feature = new Feature();
    while (true){
        menu();
        int choice = input.nextInt();
    switch (choice){
        case 1 -> feature.LoadData();
        case 2 -> feature.writeJson();
        case 3 -> feature.writeXml();
        case 4 -> {System.out.println("enter name:");
                     String name = input.next();
                feature.findByName(name);
        }
        case 5 ->System.exit(0);
}
    }
    }
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1.Load Data");
        System.out.println("2.Write File Json");
        System.out.println("3.Write File Xml");
        System.out.println("4. Find By name");
        System.out.println("5.Exit");
    }
}
