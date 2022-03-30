package com.company;

import Book.Book;
import Book.FictionBook;
import Book.ProgrammingBook;

public class Main {
static int sum = 0;
static int total = 0;
static int count =0;
    public static void main(String[] args) {
	// write your code here
        ProgrammingBook[] programmingBooks = new ProgrammingBook[5];
        programmingBooks[0] = new ProgrammingBook("123abc","số đỏ",12.000,"Vũ Trọng Phụng","java","chuaXD");
        programmingBooks[1] = new ProgrammingBook("222ikl","tắt đèn",55.000,"Ngô Tất Tố","C++","chuaXD");
        programmingBooks[2] = new ProgrammingBook("abc124","bước đường cùng",45.000,"Nguyễn Công Hoan","java","chuaXD");
        programmingBooks[3] = new ProgrammingBook("dcs456","tuổi thơ dữ dội",35.000,"phùng Quán","pHp","chuaXD");
        programmingBooks[4] = new ProgrammingBook("d09kj6","gió đầu mùa",35.000,"Thạch Lam","java","chuaXD");


        FictionBook[] fictionBooks =new FictionBook[5];
        fictionBooks[0] = new FictionBook("asd123","nỗi buồn chiến tranh",23.000,"Bảo Ninh","văn học");
        fictionBooks[1] = new FictionBook("ddd432","những ngày thơ ấu",55.000,"Nguyên Hồng","văn học");
        fictionBooks[2] = new FictionBook("12kk32","vợ nhặt",44.000,"Kim Lân","văn học");
        fictionBooks[3] = new FictionBook("da2232","vang bóng một thời",56.000,"Nguyễn Tuân","văn học");
        fictionBooks[4] = new FictionBook("dfh432","chí phéo",78.000,"Nam Cao","văn học");


        for (int i=0;i< programmingBooks.length;i++){
         sum += programmingBooks[i].getPrice();
         if (programmingBooks[i].getLanguage().equals("java")){
             count++;
         }
        }

        for (int j=0;j< fictionBooks.length;j++){
            total += fictionBooks[j].getPrice();
        }
        double totalBook = sum + total;
        System.out.println("tổng tiền của sách là "+totalBook+" vnd");
        System.out.println("số lượng sách java là "+count+" book");
    }

}
