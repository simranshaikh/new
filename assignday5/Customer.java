package assignday5;

public class Customer {

	private String custNo;
	private String custName;
	private String category;
	public String getCustNo()
	{
		return custNo;
	}
	public String getCustName()
	{
		return custName;
	}
	public String getCategory()
	{
		return category;
	}
	public Customer(String custNo, String custName, String category) throws InvalidInputException {
		super();
		if(custNo.startsWith("C"))
		{
			this.custNo = custNo;
			if(custName.length()==4)
			{
				this.custName = custName;
				if(category.equals("Platinum")||category.equals("Gold")||category.equals("Silver"))
				{
					this.category = category;
				}
				else
					throw new InvalidInputException("Invalid category");	
			}
			else
				throw new InvalidInputException("Invalid Customer name");
		}
		else
			throw new InvalidInputException("Invalid Customer no");
		
		
	}
	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName
				+ ", category=" + category + "]";
	}

}
