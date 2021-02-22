package com.example.demo.question;

public class Question {
    private Long id;
    private String title;
    private Integer type;
    private String body;
    private Integer score;
    private String option;
    private String answer;

    public Question(){

    }

    public Question(Long id,
    String title,
    Integer type,
    String body,
    Integer score,
    String option,
    String answer
    ){
        this.id = id;
        this.title = title;
        this.type = type;
        this.body = body;
        this.score = score;
        this.option = option;
        this.answer = answer;
    }

    public Question(
    String title,
    Integer type,
    String body,
    Integer score,
    String option,
    String answer
    ){
        this.title = title;
        this.type = type;
        this.body = body;
        this.score = score;
        this.option = option;
        this.answer = answer;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public Integer getType(){
        return type;
    }

    public void setType(Integer type){
        this.type = type;
    }

    public String getBody(){
        return body;
    }

    public void setBody(String body){
        this.body = body;
    }

    public Integer getScore(){
        return score;
    }

    public void setScore(Integer score){
        this.score = score;
    }

    public String getOption(){
        return option;
    }

    public void setOption(String option){
        this.option = option;
    }

    public String getAnswer(){
        return answer;
    }

    public void setAnswer(String answer){
        this.answer= body;
    }

    @Override
    public String toString() {
        return "Question{" +
        "id=" +id +
        ", title=" + title + '\'' +
        ", typw=" + type + '\'' +
        ", body=" + body + '\'' +
        ", score=" + score + '\'' +
        ", opton=" + option + '\'' +
        ", answer=" + answer +
        '}';
    }

}
