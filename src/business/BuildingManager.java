package business;

import dataAccess.*;
import model.*;
import java.util.ArrayList;

public class BuildingManager {
    private BuildingDataAccess dao;

    public BuildingManager() {
        this.dao = new BuildingDBAccess();
    }

    public ArrayList<Building> getAllBuildings() throws AllBuildingsException {
        return dao.getAllBuildings();
    }
}
