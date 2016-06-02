package core.homework9;

public class File implements Comparable<File>{
    String name;
    String type;
    double size;
    public File(String name, String type, double size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s.%s %.3f MB", name, type, size);
    }

    @Override
    public int compareTo(File o) {
        return this.getName().compareTo(o.getName());
    }
}
