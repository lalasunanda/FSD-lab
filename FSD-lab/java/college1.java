import java.util.Scanner;
public class College1 {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//sc.nextLine();
		College c[]=new College[n];
		for(int i=0;i<n;i++)
		{
			College obj=new College();
			int id=sc.nextInt();
			String name=sc.next();
			int contactNo=sc.nextInt();
			String address=sc.next();
			int pincode=sc.nextInt();
			obj.setId(id);
			obj.setName(name);
			obj.setContactNo(contactNo);
			obj.setAddress(address);
			obj.setPincode(pincode);
			c[i]=obj;
		}
		String search=sc.next();
		College method1=findCollegeWithMaximumPincode(c);
		College method2=searchCollegeByAddress(c,search);
		System.out.println("id-"+method1.getId()+"\n"+"name-"+method1.getName()+"\n"+"contacNo-"+method1.getContactNo()+"\n"+"address-"+method1.getAddress()+"\n"+"pincode-"+method1.getPincode());
		
		if(method2==null)
		{
			System.out.println("No college found with mentioned attribute");
		}
		else
		{
			System.out.println("id-"+method2.getId()+"\n"+"name-"+method2.getName()+"\n"+"contacNo-"+method2.getContactNo()+"\n"+"address-"+method2.getAddress()+"\n"+"pincode-"+method2.getPincode());
		}
		sc.close();
	}
	
	public static College findCollegeWithMaximumPincode(College c[])
	{
		if(c.length==0)
		{
			return null;
		}
		College max=c[0];
		for(int i=0;i<c.length;i++)
		{
			if(max.getPincode()<c[i].getPincode())
			{
				max=c[i];
			}
		}
		return max;
	}
	public static College searchCollegeByAddress(College c[],String search)
	{
		College found=null;
		for(int i=0;i<c.length;i++)
		{
			if(c[i].getAddress().equalsIgnoreCase(search))
			{
				found=c[i];
				break;
			}
		}
		if(found!=null)
		{
			return found;
		}
		return null;
	}
}

public class College {
int id;
String name;
int contactNo;
String address;
int pincode;
public void setId(int id)
{
	this.id=id;
}
public int getId()
{
	return id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getContactNo() {
	return contactNo;
}
public void setContactNo(int contactNo) {
	this.contactNo = contactNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
}