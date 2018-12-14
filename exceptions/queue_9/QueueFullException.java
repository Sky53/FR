package exceptions.queue_9;

class QueueFullException extends Exception {
    int size;

    QueueFullException(int s){
        size = s;
    }

    @Override
    public String toString() {
        return "\nОчередь заполнена. Максимальный размер очереди: " + size;
    }
}

class QueueEmptyException extends Exception{
    @Override
    public String toString() {
        return "\nОчередь пуста";
    }
}
