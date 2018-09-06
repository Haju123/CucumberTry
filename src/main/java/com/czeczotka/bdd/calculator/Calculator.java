package com.czeczotka.bdd.calculator;

public class Calculator {

    private int result;

  /*  public void add(int arg1, int arg2) {
        result = arg1 + arg2;
    }*/
    public int add()
	 {
		 return this.a+this.b;
	 }
    public int subtract() {
		// TODO Auto-generated method stub
		return this.a-this.b;
	}
    public int getResult() {
        return result;
    }
    private int a;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}
