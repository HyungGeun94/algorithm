class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int xMax = board[0] / 2;
        int yMax = board[1] / 2;
        int x = 0;
        int y = 0;

        for (String key : keyinput) {
            if (key.equals("left")  && x - 1 >= -xMax) x--;
            if (key.equals("right") && x + 1 <=  xMax) x++;
            if (key.equals("up")    && y + 1 <=  yMax) y++;
            if (key.equals("down")  && y - 1 >= -yMax) y--;
        }

        return new int[]{x, y};
    }
}