package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {
    ArticleView articleView = new ArticleView();
    ArrayList<Article> articleList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int latestId = 1;

    public void run() {


        while (true) {
            System.out.print("명령어 : ");
            String cmd = sc.nextLine();
            if (cmd.equals("exit")) {
                System.out.println("프로그램을 종료하겠습니다. ");
                break;
            } else if (cmd.equals("add")) {
                add();


            } else if (cmd.equals("list")) {
                list();

            } else if (cmd.equals("update")) {
                update();

            } else if (cmd.equals("delete")) {
                delete();

            } else if (cmd.equals("detail")) {
                detail();

            }else if (cmd.equals("search")){
                search();

            }


        }


    }
    public void search(){
        System.out.print("제목에서 검색 키워드를 입력하세요 : ");
        String keyword = sc.nextLine();
        for(int i = 0; i < articleList.size(); i++){

        }
    }





    public Article findById(int inputId) {
        for (int i = 0; i < articleList.size(); i++) {
            Article article = articleList.get(i);
            if (inputId == article.getId()) {
                return article;
            }
        }
        return null;

    }


    public void detail() {
        System.out.print("상세보기 할 게시물의 번호를 입력해주세요.");
        int inputId = Integer.parseInt(sc.nextLine());
        Article article = findById(inputId);
        articleView.printDetail(article);


    }


    public void delete() {
        System.out.print("삭제할 게시물의 번호를 입력해주세요.");
        int inputId = Integer.parseInt(sc.nextLine());
        Article article = findById(inputId);
        articleList.remove(article);


        System.out.println("게시물이 삭제되었습니다.");

    }

    public void update() {
        System.out.print("수정할 게시물의 번호를 입력해주세요. : ");
        int inputId = Integer.parseInt(sc.nextLine());
        Article article = findById(inputId);
        System.out.print("새로운 제목을 입력하세요. : ");
        String newTitle = sc.nextLine();
        System.out.print("새로운 내용을 입력하세요. : ");
        String newBody = sc.nextLine();

        article.setTitle(newTitle);
        article.setBody(newBody);

        System.out.println("게시물이 수정되었습니다. ");
    }


    public void list() {

            articleView.printArticleList(articleList);


        }




    public void add() {
        System.out.print("제목을 입력해주세요. : ");
        String title = sc.nextLine();
        System.out.print("내용을 입력해주세요. : ");
        String body = sc.nextLine();

        Article article = new Article(latestId, title, body, 0, "2024-03-06 17:00:00");
        articleList.add(article);
        latestId++;


    }

}
