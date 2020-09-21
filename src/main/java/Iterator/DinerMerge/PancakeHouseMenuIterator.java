package Iterator.DinerMerge;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{
    ArrayList items;
    int position = 0;
    public PancakeHouseMenuIterator(ArrayList menuItems){
        items = menuItems;
    }

    @Override
    public boolean hasNext() {
        return items.size() > position;
    }

    @Override
    public Object next() {
        return items.get(position++);
    }
}
