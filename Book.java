package com.wipro;

import java.util.Scanner;

public class Book {
	String bookTitle;
	String author;
	String isbnCode;
	double originalPrice;
	double finalPrice;
	public Book() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter title,author,isbn,original price");
		bookTitle=scanner.nextLine();
		author=scanner.nextLine();
		isbnCode=scanner.next();
		originalPrice=scanner.nextDouble();
	
	}
	
	Book(String title,String author)
	{
		this.bookTitle=title;
		this.author=author;
	}

	public Book(String bookTitle, String author, String isbnCode,
			double originalPrice) {
		super();
		this.bookTitle = bookTitle;
		this.author = author;
		this.isbnCode = isbnCode;
		this.originalPrice = originalPrice;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbnCode() {
		return isbnCode;
	}

	public void setIsbnCode(String isbnCode) {
		this.isbnCode = isbnCode;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public double getFinalPrice() {
		
		
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	
	public double getDiscountedPrice(String ninumber)
	{
		double discount=originalPrice*.1;
		finalPrice=originalPrice-discount;
		setFinalPrice(finalPrice);
		System.out.println("***"+finalPrice+","+discount);
		return originalPrice-discount;
	}
	public double getDiscountedPrice(int empid)
	{
		double discount=originalPrice*(.2);
		finalPrice=originalPrice-discount;
		setFinalPrice(finalPrice);
		System.out.println("+++"+finalPrice+","+discount);
		return originalPrice-discount;
	}
	
	public void display()
	{
		System.out.println("Title"+bookTitle);
		System.out.println("ISBN:"+isbnCode);
		System.out.println("OriginalPrice"+originalPrice);
		System.out.println("Final Price"+finalPrice);
	}

	public static void main(String[] args) {
		Book b1=new Book();
		b1.getDiscountedPrice(78);
		b1.display();
		
		Book b2=new Book("Complete Reference","Patrick Norton");
		b2.setOriginalPrice(10.5);
		b2.setIsbnCode("A123");
		b2.getDiscountedPrice("SDSD2343");
		b2.display();
		
		
	}
}
