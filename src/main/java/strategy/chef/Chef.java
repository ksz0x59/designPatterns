package strategy.chef;

import strategy.chef.egg_cooker.EggCooker;

public class Chef {

    private String name;
    private EggCooker eggCooker;

    public void setEggCooker(EggCooker eggCooker) {
        this.eggCooker = eggCooker;
    }

    public EggCooker getEggCooker() {
        return eggCooker;
    }

    public Chef(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void cook () {
        eggCooker.cookEgg();
    }
}
