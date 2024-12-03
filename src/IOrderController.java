public interface IOrderController {

	/**
	 * 
	 * @param clientId
	 * @param orderDetails
	 */
	void initializeOrder(Long clientId, OrderDetails orderDetails);

	Notification createOrder();

	Order getPendingOrder();

	/**
	 * 
	 * @param driverId
	 * @param vehicleId
	 * @param routeDescription
	 */
	void modifyAutomaticalyAssignedProperties(Long driverId, Long vehicleId, Long routeDescription);

	/**
	 * 
	 * @param orderId
	 */
	void cancelOrder(Long orderId);

	/**
	 * 
	 * @param driverId
	 */
	Order getAssignedOrder(Long driverId);

	Notification reportProgress();

}