package strategy;

import strategy.chef.Chef;
import strategy.chef.egg_cooker.HardBoiledEggCooker;
import strategy.chef.egg_cooker.SoftBoiledEggCooker;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon Ramsey");
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();
    }
}
