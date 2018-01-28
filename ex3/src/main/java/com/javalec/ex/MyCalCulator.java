package com.javalec.ex;

public class MyCalCulator {

	public MyCalCulator() {
		// TODO Auto-generated constructor stub
	}
	
	private Calculator cal;
	private int firstNum;
	private int secondNum;
	
	
	public Calculator getCal() {
		return cal;
	}
	public void setCal(Calculator cal) {
		this.cal = cal;
	}
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	
	public void add(){
		cal.addition(firstNum, secondNum);
	}
	
	public void sub(){
		cal.subtraction(firstNum, secondNum);
	}
	
	public void mul(){
		cal.multiplication(firstNum, secondNum);
	}
	
	public void div(){
		cal.division(firstNum, secondNum);
	}
	

}
