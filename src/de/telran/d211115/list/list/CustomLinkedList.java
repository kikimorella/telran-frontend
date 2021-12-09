package de.telran.d211115.list.list;

public class CustomLinkedList<T> implements CustomList<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;

    // <E> будет становиться <T>
    private static class Node<E> { // будет использоваться только тут. Дженерик доступен внутри Node
        E value;
        Node<E> prev;
        Node<E> next;

        public Node(E value, Node<E> next, Node<E> prev) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    @Override
    public void set(int index, T value) {
        Node<T> node = getNodeByIndex(index);
        Node<T> newNode = new Node<T>(value, node.prev, node.next);

        node = newNode;
    }

    @Override
    public T get(int index) {
        Node<T> node = getNodeByIndex(index);
        return node.value;
    }

    private Node<T> getNodeByIndex(int index) {
        if (index < 0 || index >= size)
            throw new CustomOutOfBoundsException();

        Node<T> res = first; // переход от 0 к следующему
        for (int i = 0; i < index; i++) {
            res = res.next;
        }
        return res;
    }

    @Override
    public int size() {
        return size;
    } // отвечает за количество узлов = количеству элементов

    @Override
    public boolean contains(T value) {
        Node<T> node = new Node<T>(value, null, first);

        while (node != null) {// проверяем до последнего
            if (node.value.equals(value)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    @Override
    public void removeById(int index) {
        // В отличие от удаления в ArrayList здесь нет никаких сдвигов элементов массива. Мы просто переопределяем
        // ссылки у элементов. Теперь они указывают друг на друга, а объект между “выпал” из этой цепочки ссылок,
        // и больше не является частью списка.
        Node<T> node2 = getNodeByIndex(index);

        Node<T> node1 = node2.prev;
        Node<T> node3 = node2.next;

        node2.next = null;
        node2.prev = null;
        node1.next = node3;
        node3.prev = node1;

        size--;
    }

    @Override
    public void add(T value) { // ?почему не addLast()
        Node<T> node = new Node<>(value, null, last);

        if (size == 0) { // ?почему не addFirst()
            first = node;
        } else {
            last.next = node;
        }
        last = node;
        size++;
    }

    @Override
    public void insert(int index, T value) {
        Node<T> node2 = getNodeByIndex(index);

        if (size == 0) {
            first = node2;
        } else if (index >= size) {
            last.next = node2;
            last = node2;
        }

        Node<T> node1 = node2.prev;
        Node<T> node3 = node2.next;

        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;

        size++;
    }

    @Override
    public void println() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        if (first == null) {
            return "";
        }

        Node<T> node = first;

        StringBuilder sb = new StringBuilder();
/*
        while (node.next != null) { // но! не заходит последнее значение
            sb.append(node.value);
            node = node.next;
        }
*/
        while (true) { // но! не заходит последнее значение
            sb.append(node.value);
            sb.append(" "); // магия
            node = node.next;
            if (node.equals(last)) {
                sb.append(node.value);
                break;
            }
        }

        return sb.toString();
    }
}

/*
В LinkedList элементы фактически представляют собой звенья одной цепи. У каждого элемента помимо тех данных, которые он
хранит, имеется ссылка на предыдущий и следующий элемент. По этим ссылкам можно переходить от одного элемента к другому.
Элементы LinkedList являются единым списком благодаря цепочке ссылок. Внутри LinkedList нет массива, как в ArrayList.

Вставка и удаление в середину LinkedList устроены гораздо проще, чем в ArrayList.
Мы просто переопределяем ссылки соседних элементов, а ненужный элемент “выпадает” из цепочки ссылок.
В то время как в ArrayList мы:
проверяем, хватает ли места (при вставке)
если не хватает — создаем новый массив и копируем туда данные (при вставке)
удаляем/вставляем элемент, и сдвигаем все остальные элементы вправо/влево (в зависимости от типа операции).
Причем сложность этого процесса сильно зависит от размера списка (миллионом элементов).
То есть, если в программе чаще происходят операции вставки/удаления с серединой списка, LinkedList должен быть быстрее.

first и last до вложений null
Node first                    нужно пройти по цепочке                          Node last                                   new
    |                                                                              |
T value;                                T value;                               T value;                                     T value;
Node next; - ссылка на след.узел       <-Node next; -> ссылка на след.узел    <-Node next; -> если послед., указ.на null    null
Node prev; - если 1 , то указ.на null  ->Node prev; -> ссылка на пред.узел    ->Node prev; -> ссылка на пред.узел           prev == last
*/