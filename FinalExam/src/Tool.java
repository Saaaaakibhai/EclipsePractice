
public class Tool {
    private int length;

    public Tool(int length) {
        this.length = length;
    }

    public Tool() {
        this.length = 0;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String display() {
        return "Tool{" +
                "length=" + length +
                '}';
    }
}