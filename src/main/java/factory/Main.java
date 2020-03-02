package factory;

import factory.units.Unit;
import factory.units.UnitFactory;

import static factory.units.UnitType.RIFLEMAN;
import static factory.units.UnitType.TANK;

public class Main {
    public static void main(String[] args) {
        UnitFactory unitFactory = new UnitFactory();

        Unit tank = unitFactory.createUnit(TANK);
        Unit riffleman = unitFactory.createUnit(RIFLEMAN);
    }
}
