package visitor;

import java.util.ArrayList;

public class ShoppingCart {
    //normal shopping cart stuff
    private ArrayList<Visitable> items;
    public double calculatePostage() {
        //create a visitor
        PostageVisitor visitor = new PostageVisitor();
        //iterate through all items
        for(Visitable item: items) {
            item.accept(visitor);
        }
        double postage = visitor.getTotalPostage();
        return postage;
    }
}
