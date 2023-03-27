class MyCircularDeque {
    int maxSize, head = 0, tail = -1;
    int[] data;
    public MyCircularDeque(int k) {
        data = new int[k];
        maxSize = k;
    }

    public boolean insertFront(int value) {
        if(isFull()) return false;
        head = --head < 0 ? maxSize-1 : head % maxSize;
        data[head] = value;
        if(tail == -1) tail = head;
        return true;
    }

    public boolean insertLast(int value) {
        if(isFull()) return false;
        tail = ++tail % maxSize;
        data[tail] = value;
        return true;
    }

    public boolean deleteFront() {
        if(isEmpty()) return false;
        if(head == tail){
            head = 0;
            tail = -1;
        }
        else head = ++head % maxSize;
        return true;
    }

    public boolean deleteLast() {
        if(isEmpty()) return false;
        if(head == tail){
            head = 0;
            tail = -1;
        }
        else tail = --tail < 0 ? maxSize-1 : tail % maxSize;
        return true;
    }

    public int getFront() {
        return isEmpty() ? -1 : data[head];
    }

    public int getRear() {
        return isEmpty() ? -1 : data[tail];
    }

    public boolean isEmpty() {
        return tail == -1 && head == 0;
    }

    public boolean isFull() {
        return !isEmpty() && (tail + 1) % maxSize == head;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */