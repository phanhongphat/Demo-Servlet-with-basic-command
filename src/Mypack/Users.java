package Mypack;

public class Users 
{ 
	// String name1,name2 : 2 cột cần xuất ra
		private String name1; 
		private String name2;
		
		public Users (String name1, String name2)                    //Tạo constructor truyền dữ liệu vào
		{
			this.name1 = name1;
			this.name2 = name2;
		}
		
		public String getName1() 
		{
			return name1;
		}
		public void setName1(String name1)              //gọi get set : phương thức đóng gói
														//	String name1 = "phanhongphat"
														//  method :set 
														//  setName1("phanhongphat")
														//  getName1
		{
			this.name1 = name1;
		}
		public String getName2() 
		{
			return name2;
		}
		public void setName2(String name2)
		{
			this.name2 = name2;
		}
	
}
