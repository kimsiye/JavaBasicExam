package Test.post;

import Test.Comment;

import java.util.ArrayList;

public class PostView {


    public void printPostsList(ArrayList<Post> selArr) {
        for (Post post : selArr) {
            System.out.println("==================");
            System.out.printf("번호 : %d\n", post.getId());
            System.out.printf("제목 : %s\n", post.getTitle());
            //System.out.printf("내용 : %s\n", post.getContent());
        }
        System.out.println("==================");
    }

    public void printPostsDetail(Post post) {
        System.out.println("==================");
        System.out.printf("번호 : %d\n", post.getId());
        System.out.printf("제목 : %s\n", post.getTitle());
        System.out.printf("내용 : %s\n", post.getContent());
        System.out.printf("등록날짜  : %s\n", post.getNowDateTime());
        System.out.printf("조회수  : %s\n", post.getView());
        System.out.println("==================");
        post.setView(1);

    }

    public void printPostsDetailAndComment(Post post) {
        System.out.println("==================");
        System.out.printf("번호 : %d\n", post.getId());
        System.out.printf("제목 : %s\n", post.getTitle());
        System.out.printf("내용 : %s\n", post.getContent());
        System.out.printf("등록날짜  : %s\n", post.getNowDateTime());
        System.out.printf("조회수  : %s\n", post.getView());
        System.out.println("==================");
        post.setView(1);



    }

}
