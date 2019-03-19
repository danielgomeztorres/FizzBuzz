package com.codeoftheweb.FizzBuzz;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class FizzBuzz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private Long id;
    private Integer num;
    private String msj;
    private Date dateGame;



    //CONSTRUCTOR
    public FizzBuzz (Integer num,String msj) {
        this.num = num;
        this.msj = msj;
        this.dateGame = new Date ();

    }




    //GET AND SET
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }

    public Date getDateGame() {
        return dateGame;
    }

    public void setDateGame(Date dateGame) {
        this.dateGame = dateGame;
    }
}