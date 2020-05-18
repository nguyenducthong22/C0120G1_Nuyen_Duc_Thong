package MyLinkedList;


public class MyLinkedList <E> {
    private  static  class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;    //Node dau tien cua danh sach lien ket //
    private int numNode;  //So luong node trong da nh sach //

    public MyLinkedList() {
    }

    public void addFirst(E element) {
        Node temp = head;
        //Khai bao 1 bien tro den vi tri dau tien heap //
        head = new Node(element);
        //Bien heap se thanh 1 node moi //
        head.next = temp;
        // heap.next tro den bien teamp //
        numNode++;
    }

    public void addLast(E element) {
        Node temp = head;
        // Khai bao bien teamp tro den head //
        while (temp.next != null) {
            temp = temp.next;
        }
        // Cho con tro chay den cuoi danh sach //
        temp.next = new Node(element);
        //Cho gia tri node cuoi bang gia tri nhap vao //
        numNode++;
    }

    public void add(int index, E element) {
        Node temp = head;
        //Khai bao bien temp tro den heap //
        Node holder;
        // Khai bao 1 bien holder //
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        // Cho con tro chay den vi ti index -1 //

        holder = temp.next;
        // Cho holder tham chieu den node index-1 //
        temp.next = new Node(element);
        //Node tai index-1 se tro den node moi (nhap vao) //
        temp.next.next = holder;
        //Node moi tro den holder //
        numNode++;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
            // Cho con tro chay den index //
        }
        return temp.data;
    }

    public int size() {
        return this.numNode;
    }

    public E remove(int index) {
        if (index < 0 || index > numNode) {
            throw new IllegalArgumentException("Error : " + index);
        }

        Node temp = head;
        Object data;

        if (index == 0) {
            data = temp.data;
            head = head.next;
            // Neu index bang 0 thi data can xoa bang data hien tai va cho cai noi noi den cai tiep theo //
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            // Cho con tro chay den index -1 , index khac vi tri cuoi cung //
            data = temp.next.data;
            // data cua vi tri index bi xoa (con tro dung o index -1 nen temp.next de den vi tri index) //
            temp.next = temp.next.next;
            // Noi tu index-1 den index+1 bo qua index //
            numNode--;
        }
        return (E) data;
    }

    public boolean remove(E element) {
        if (head.data.equals(element)) {
            remove(0);
            return true;
            //Neu gia tri xoa la gia tri dau tien thi sd remove o index 0 //
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.equals(element)) {
                    temp.next = temp.next.next;
                    numNode--;
                    return true;
                    // Neu co gia tri muon xoa trong mang thi nut se noi den vi tri ke tiep //
                }
            }
        }
        return false;
    }

    public MyLinkedList<E> clone(){
        if (numNode==0){
            throw new NullPointerException("Linkedlist null");
        }
        MyLinkedList<E>returnLinkedList =new MyLinkedList<E>();
        // Khai bao linkedList tra ve //

        Node temp=head;
        returnLinkedList.addFirst((E)temp.data);
        //add temp vao danh sach tra ve de no lam heap //
        temp=temp.next;
        while (temp!=null){
            returnLinkedList.addFirst((E) temp.data);
            temp=temp.next;
        }
        return returnLinkedList;
    }

    public boolean constrains(E element){
        Node temp =head;
        while (temp.next!=null){
            if (temp.data.equals(element)){
                return  true;
            }
            temp=temp.next;
        }
        return false;
    }
}
