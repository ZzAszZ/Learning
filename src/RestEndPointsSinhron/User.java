package RestEndPointsSinhron;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class User {
    private String name;
    private int like;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLike() {
        return like;
    }

    public void  setLike(int like) {
        this.like = like;
    }

    public static void main(String[] args) {


    }
}
