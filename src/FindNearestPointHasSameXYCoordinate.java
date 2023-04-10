public class FindNearestPointHasSameXYCoordinate {
    public static void main(String[] args) {
    FindNearestPointHasSameXYCoordinate fnphsc = new FindNearestPointHasSameXYCoordinate();
    System.out.println(fnphsc.nearestValidPoint(3,4,new int[][] {{1,2},{3,1},{2,4},{2,3},{4,4}}));
    //System.out.println(fnphsc.nearestValidPoint(3,4,new int[][] {{3,4}}));
    }

    public int nearestValidPoint(int x, int y, int[][] points) {
        int min=Integer.MAX_VALUE, index=-1, i;
        for ( i=0;i<points.length;i++){
            if (x==points[i][0] ||  y==points[i][1]){
                int d = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (d<min){
                    min=d;
                    index=i;
                }
            }
        }
        return  index;
    }
}
