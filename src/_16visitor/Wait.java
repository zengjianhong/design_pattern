package _16visitor;

/**
 * @author jehon
 */
public class Wait extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println(" 男性给的评价，该歌手待定！");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(" 女性给的评价，该歌手待定！");
    }
}
