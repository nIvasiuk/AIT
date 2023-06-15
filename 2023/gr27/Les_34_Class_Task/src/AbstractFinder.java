public abstract class AbstractFinder {
    protected int [] elements;
    public AbstractFinder(int [] elements){
    this.elements = elements;
    }

    public abstract boolean find(int element);
}



