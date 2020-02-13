package reply.codechalange.data;

public class Customer
{
	int customerId;
	Point point;
	int reward;

	public Customer(final int customerId, final Point point, final int reward)
	{
		this.customerId = customerId;
		this.point = point;
		this.reward = reward;
	}
}
