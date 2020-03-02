package abstractfactory.units;

public class RedFactory extends Factory {
    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {
        switch (type) {
            case RIFLEMAN :
                return new Rifleman(20,0,10);
            default :
                throw new UnsupportedOperationException("unsupported object type");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type) {
            case TANK :
                return new Tank(75,0,35);
            default :
                throw new UnsupportedOperationException("unsupported object type");
        }
    }
}
