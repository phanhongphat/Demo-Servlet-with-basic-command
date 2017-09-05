package Mypack;

import java.util.*;

public class ExportUsers 
{
	public static List<Users> Exportusers()
	{
		List<Users> list = new ArrayList<Users>();
		list.add(new Users("Phan Hồng Phát","Sinh Viên"));
		list.add(new Users("KHTN","TPHCM"));
	
		return list;
	}
}
