package main.guildwars;

public class ItemLookup {
     private int id;
     private int count;
     private String binding;
     private String bound_to;

    public ItemLookup(int id, int count, String binding, String bound_to) {
        this.id = id;
        this.count = count;
        this.binding = binding;
        this.bound_to = bound_to;
    }

    public ItemLookup(int id, int count) {
        this.id = id;
        this.count = count;
    }

    public ItemLookup(int id, int count, String binding) {
        this.id = id;
        this.count = count;
        this.binding = binding;
    }

    public ItemLookup() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getBound_to() {
        return bound_to;
    }

    public void setBound_to(String bound_to) {
        this.bound_to = bound_to;
    }
}
