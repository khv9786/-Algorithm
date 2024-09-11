import java.io.*;
import java.util.*;

public class Main { // 이진 검색 트리
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node root = new Node(Integer.parseInt(br.readLine()));

        String input;
        while ((input = br.readLine()) != null) {
            int next = Integer.parseInt(input);
            root.insert(next);
        }
        postOrder(root);
    }

    static void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left); //왼쪽 순회
        postOrder(node.right); //오른쪽 순회
        System.out.println(node.num);
    }
}

class Node {
    int num;
    Node left, right;

    Node(int num) {
        this.num = num;
    }

    void insert(int n) {
        if (n < this.num) {
            if (this.left == null) {
                this.left = new Node(n);
            } else {
                this.left.insert(n);
            }
        } else {
            if (this.right == null) {
                this.right = new Node(n);
            } else {
                this.right.insert(n);
            }
        }
    }

}
