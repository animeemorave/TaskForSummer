class Solution {
    fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
        var res : Int = 0
        for( i in 1..points.size-1)
        {
            res+= max(abs(points[i][0]-points[i-1][0]), abs(points[i][1]-points[i-1][1]))
        }
        return res
    }
}