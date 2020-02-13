package reply.codechalange.data;

import java.util.List;


public class Route
{
	List<Point> coordinateRoute;

	String route;


	public Route(final List<Point> coordinateRoute, final String route)
	{
		this.coordinateRoute = coordinateRoute;
		this.route = route;
	}
}
