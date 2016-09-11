package com.java.lessons;

class SuperKeyword {

	class superTest0{
		int apple=0;
		public void smile(){
			System.out.println("smile please!");
		}
		
	}
	class superTest1 extends superTest0 {
		public void dance(){
			System.out.println("dance please!");
			super.smile();
			System.out.println(super.apple);// it it's private then you need to use getter
		}
	}
	
	public  class superTest{
		
		public void main(String[] args) {
			superTest1 sp = new superTest1();
			sp.dance();
		}

	}

}
