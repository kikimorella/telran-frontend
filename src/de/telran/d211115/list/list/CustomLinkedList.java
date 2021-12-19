package de.telran.d211115.list.list;

import java.util.Iterator;

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
        node.value = value;
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
/*
        Node<T> node = new Node<T>(value, null, first);

        while (node != null) {// проверяем до последнего
            if (node.value.equals(value)) {
                return true;
            }
            node = node.next;
        }
        return false;
 */
        Node<T> node = findNodeByValue(value);
        return node != null;
    }

    @Override
    public T removeById(int index) {
        // В отличие от удаления в ArrayList здесь нет никаких сдвигов элементов массива. Мы просто переопределяем
        // ссылки у элементов. Теперь они указывают друг на друга, а объект между “выпал” из этой цепочки ссылок,
        // и больше не является частью списка.
        Node<T> nodeToRemove = getNodeByIndex(index);
        T res = nodeToRemove.value;
        removeNode(nodeToRemove);
        return res;
    }

    @Override
    public boolean removeByValue(T value) {
        Node<T> nodeToRemove = findNodeByValue(value);
        if (nodeToRemove == null)
            return false;

        removeNode(nodeToRemove);
        return true;
    }

    private void removeNode(Node<T> nodeToRemove) { // не забыть про метод findNodeByValue
        Node<T> left = nodeToRemove.prev;
        Node<T> right = nodeToRemove.next;

        if (first == last) {//Checks whether the list contains only one Node
            first = null;
            last = null;
        }

        if (left == null) { //Checks if node is first (first == nodeToRemove)
            first = right;
        } else {
            left.next = right;
        }

        if (right == null) { //Checks if node is last (last == nodeToRemove)
            last = left;
        } else {
            right.prev = left;
        }

        nodeToRemove.prev = null;
        nodeToRemove.next = null;
        nodeToRemove.value = null;

        size--;
    }

    /**
     * @param value if exits
     * @return the first node with value or null if there is no such a node
     */
    // {10, 7, 10, 15} если ищем 15, то вернуть узел с этим значением
    private Node<T> findNodeByValue(T value) {
        Node<T> currentNode = first;
        for (int i = 0; i < size; i++) {
            if (currentNode.value.equals(value)) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }

        return null;
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
        Node<T> right;
        Node<T> left;

        if (size == index) {
            left = last;
            right = null;
        } else {
            right = getNodeByIndex(index);
            left = right.prev;
        }

        Node<T> node = new Node<>(value, right, left);

        if (left != null)
            left.next = node;
        else
            first = node;

        if (right != null)
            right.prev = node;
        else
            last = node;

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
        while (true) {
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

    @Override // чтоб перебрать Лист нужна только ссылка на первый узел!
    public Iterator<T> getIterator() {
        return new ListIterator<>(first);
    }

    private static class ListIterator<E> implements Iterator<E> {
        // Статические классы работают как обычные классы, но поля не зависят от класса, в который вложен.
        // Без статик все Объекты будут зависеть от объектов классов, в которые вложены(видео 16.12.21 последние 12 мин)

        Node<E> current;

        public ListIterator(Node<E> first) {
            this.current = first;
        }

        @Override
        public boolean hasNext() { // так мы определяем что Лист не пуст
            return current != null;
        }

        @Override
        public E next() {
            current = current.next;

            return current.value;
        }
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
T value;                                T value;                               T value;                                   T value;
Node next; - ссылка на след.узел       <-Node next; - ссылка на след.узел    <-Node next; - указ.на null                  null
Node prev; - указ.на null              ->Node prev; - ссылка на пред.узел    ->Node prev; - ссылка на пред.узел           prev == last
*/