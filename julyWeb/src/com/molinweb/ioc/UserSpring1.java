package com.molinweb.ioc;

public class UserSpring1 {
	
	    private String username;
			public UserSpring1() {
				
		}

			public UserSpring1(String username) {
			super();
			this.username = username;
		}

			public void add(){
				System.out.println("С���ǵĵ�һ������add");
			}
	
			
			
			
			
	public static void main(String[] args){
		UserSpring1 user=new UserSpring1(null);
		 user.add();
	}
	
	
	
	
	
}
