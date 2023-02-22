import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class Supermarket {

    private Queue<String> queue1;
    private Queue<String> queue2;

    Random r;
    int num;

    public Supermarket() {
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();

        r = new Random();
    }

    public void addToQueue1(String... names) {       // varargs
        for (String name : names) {                 // foreach цикл
            queue1.add(name);
        }
    }

    public void addToQueue2(String... names) {
        for (String name : names) {
            queue2.add(name);
        }
    }


    public void add(String name) {
        if (queue1.size() < 5 || queue2.size() < 5){                  // если размер очереди меньше или равно пяти условие выполняется

            if (queue1.size() <= queue2.size()) {
                queue1.add(name);
            } else {
                queue2.add(name);
            }
        } else {
            System.out.println("Вызываем Галю");
        }
    }

    public Queue<String> getQueue1() {
        return queue1;
    }

    public Queue<String> getQueue2() {
        return queue2;
    }

    public void removePerson() {
        num = r.nextInt(2);
        if (num == 0) {
            queue1.poll();
        } else {
            queue2.poll();
        }
    }


}


