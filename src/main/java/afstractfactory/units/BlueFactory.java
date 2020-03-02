package afstractfactory.units;

public class BlueFactory extends Factory {
    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {
        switch (type) {
            case RIFLEMAN :
                return new Rifleman(25,0,5);
            default :
                throw new UnsupportedOperationException("unsupported object type");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type) {
            case TANK :
                return new Tank(100,0,25);
            default :
                throw new UnsupportedOperationException("unsupported object type");
        }
    }
}
