package com.example.Libruary;

public class ReaderLogic {
    public static void main(String[] args) {

    }
public void  takeBook(Reader reader,int... number){
    System.out.println(reader.getName()+" прочитал : ");
    for (int numbers: number){
        System.out.println(numbers);
    }
}

}
