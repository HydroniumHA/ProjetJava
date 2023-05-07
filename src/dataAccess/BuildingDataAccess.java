package dataAccess;

import model.*;
import java.util.ArrayList;

public interface BuildingDataAccess {
    ArrayList<Building> getAllBuildings() throws AllBuildingsException;
}
