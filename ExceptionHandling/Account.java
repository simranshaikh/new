package ExceptionHandling;

public class Account 
{
	private String Accid;//must start with ACC & accid length must be 6
	private String Acctype;
	public String getAccid()
	{
		return Accid;
	}
	public void setAccid(String accid) throws AccountException
	{
  if(accid.startsWith("ACC") && accid.length()==6)
	  		this.Accid = accid;
  else
	  throw new AccountException("Accid is not valid");
	}
	public String getAcctype()
	{
		return Acctype;
	}
	public void setAcctype(String acctype)
	{
		Acctype = acctype;
	}
	@Override
	public String toString() 
	{
		return "Account [Accid=" + Accid + ", Acctype=" + Acctype + "]";
	}
	public Account(String accid, String acctype) throws AccountException {
		super();
		 if(accid.startsWith("ACC") && accid.length()==6)
		Accid = accid;
		 else
			 throw new AccountException("invalid id");

Acctype = acctype;
	}


}
