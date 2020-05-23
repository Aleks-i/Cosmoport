package com.space.service;

import com.space.controller.ShipOrder;
import com.space.model.Ship;
import com.space.model.ShipType;

import java.util.Date;
import java.util.List;

public interface ShipService {
    boolean isShipValid(Ship ship);

    double computeRating(double speed, boolean used, Date prodDate);

    Ship saveShip(Ship ship);

    List<Ship> getPage(List<Ship> sortedShips, Integer pageNumber, Integer pageSize);

    List<Ship> getShips(String name, String planet, ShipType shipType, Long after, Long before, Boolean isUsed, Double minSpeed, Double maxSpeed, Integer minCrewSize, Integer maxCrewSize, Double minRating, Double maxRating);


    List<Ship> sortShips(List<Ship> ships, ShipOrder order);

    Ship getShip(Long id);

    Ship updateShip(Ship savedShip, Ship ship);

    void deleteShip(Ship savedShip);

}
