package abstractfactory;

import abstractfactory.units.*;

import static abstractfactory.units.UnitType.TANK;
import static abstractfactory.units.UnitType.RIFLEMAN;

public class Main {
    public static void main(String[] args) {

        Factory blueFactory = new BlueFactory();

        Factory redFactory = new RedFactory();

        MechanizedUnit redTank = redFactory.createMechanizedUnit(TANK);
        InfantryUnit redRiffleman = redFactory.createInfantryUnit(RIFLEMAN);

        MechanizedUnit blueTank = blueFactory.createMechanizedUnit(TANK);
        InfantryUnit blueRiffleman = blueFactory.createInfantryUnit(RIFLEMAN);
    }
}
