package com.example.Libruary;

public class MainLogic {
    public static void main(String[] args) {

        ReaderLogic readerLogic = new ReaderLogic();
        Reader reader = new Reader("Андрей","Петров","Андреевич",
                "Математический","04/10/2000","69078976975980");
        readerLogic.takeBook(reader, 9);
        Reader reader1 = new Reader();
        reader1.setName("Ярослав");
        reader1.setFirstname("Капаченя");
        reader1.setSecondName("Игоревич");
        reader1.setDepartment("Математический");
        reader1.setDate("04.10.2008");
        reader1.setTelephoneNumber("+37568990987");
    }
}
