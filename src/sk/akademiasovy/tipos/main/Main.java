package sk.akademiasovy.tipos.main;

import sk.akademiasovy.tipos.Bet;
import sk.akademiasovy.tipos.Tipos;
import sk.akademiasovy.tipos.database.MySQLDatabase;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tipos tipos=new Tipos();
        tipos.printArray();

        MySQLDatabase mySQLDatabase=new MySQLDatabase();
        mySQLDatabase.testConnection();
        mySQLDatabase.insertValueIntoDrawHistory(tipos.getArr());
        mySQLDatabase.getNewBets();
        List<Bet> list=mySQLDatabase.getNewBets();
    }
}
