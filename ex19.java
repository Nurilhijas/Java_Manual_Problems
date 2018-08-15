	class Student{  
	    int id;  
	    String name;  
	      
	    Student10(int id,String name){  
	    id = id;  
	    name = name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	  
	    public static void main(String args[]){  
	    Student10 s1 = new Student10(111,"nuril");  
	    Student10 s2 = new Student10(321,"hijas");  
	    s1.display();  
	    s2.display();  
	    }  
	}  
