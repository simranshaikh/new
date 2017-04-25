package InterfaceDemo;

public class Demo1 {

	public static void main(String[] args) {
	//boxing
		int val=10;
		Integer i=new Integer(val);
	//Unboxing 	
	i.intValue();
String s1="tom";
System.out.println(s1.hashCode());
s1=s1.concat("jerry");
System.out.println(s1.hashCode());
StringBuffer sb1=new StringBuffer("shashank");
System.out.println(sb1.hashCode());
sb1.append("Gadge");
System.out.println(sb1.hashCode());
StringBuilder sb2=new StringBuilder("tom");
System.out.println(sb2.hashCode());
sb2.append("jerry");
System.out.println(sb2.hashCode());
}
	}


