package de.htwg.seapal.controller;

import java.util.List;
import java.util.UUID;

import de.htwg.seapal.model.IBoat;
import de.htwg.seapal.model.IRoute;
import de.htwg.seapal.utils.observer.IObservable;

public interface IRouteController extends IObservable {
	
	String getName(UUID id);

	void setName(UUID id, String name);

	String getDate(UUID id);

	void setDate(UUID id, long date);

	List<UUID> getMarks(UUID id);

	void addMark(UUID id, UUID mark);

	UUID getRouteEntryPoint(UUID id);

	void setRouteEntryPoint(UUID id, UUID mark);

	double getDistance(UUID id);

	void setDistance(UUID id, double distance);
	
	void deleteRoute(UUID id);

	void closeDB();

	List<UUID> getRoutes();
	
	UUID newRoute();

	String getString(UUID id);
	
	/**
	 * Gets a route by the given route ID.
	 * @param routeId The route ID.
	 * @return The route or NULL, if no route was found.
	 */
	IRoute getRoute(UUID routeId);
	
	/**
	 * Gets all routes.
	 * @return All routes.
	 */
	List<IRoute> getAllRoutes();
	
	/**
	 * Saves the route.
	 * @param route The route to save.
	 * @return Returns TRUE, if the route was newly created
	 * 	       and FALSE when the route was updated.
	 */
	boolean saveRoute(IRoute route);
}
