class DynamicArray {
    private int [] arr;
    private int capacity;
    private int length;

    public DynamicArray(int capacity) {
        arr = new int [capacity];
        this.capacity = capacity;
        this.length = 0;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (length == capacity) {
            resize();
        }
        arr[length] = n;
        length++;
    }

    public int popback() {
        length--;
        return arr[length];
    }

    private void resize() {
        this.capacity = 2 * this.capacity;
        int [] newarr = new int[this.capacity];
        for(int i = 0; i < length; i++) {
            newarr[i] = this.arr[i];
        }
        this.arr = newarr;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
