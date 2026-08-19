public class KnowledgeCheck7 {
    int i;
    static int s;

    public static void main(String[] args) {
        KnowledgeCheck7 f1 = new KnowledgeCheck7();
        System.out.println("f1.i is " + f1.i + "f1.s is " + f1.s);
        KnowledgeCheck7 f2 = new KnowledgeCheck7();
        System.out.println("f2.i is " + f2.i + "f2.s is " + f2.s);
        KnowledgeCheck7 f3 = new KnowledgeCheck7();
        System.out.println("f3.i is " + f3.i + "f3.s is " + f3.s);


    }

    public KnowledgeCheck7() {
        i++;
        s++;
    }
}

