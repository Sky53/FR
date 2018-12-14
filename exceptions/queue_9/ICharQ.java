package exceptions.queue_9;

public interface ICharQ { // Интерфейс для очереди символов.
    void put(char ch) throws QueueFullException; // Помесить символы в очередь
    char get() throws QueueEmptyException; // Извлечь символы из очереди
}
