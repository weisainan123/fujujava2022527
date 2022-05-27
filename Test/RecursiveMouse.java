package Test;

//递归--老鼠出迷宫
public class RecursiveMouse {
    public static void main(String[] args){
        //1、先创建一个迷宫，用二维数组表示 int[][] map = new int[8][7];
        //2、规定map 数组的元素值 0 表示可以走   1 表示障碍物
        int[][] map = new int[8][7];
        //3、障碍物
        for(int j=0;j<7;j++){//上面-下面墙壁
            map[0][j] = 1;
            map[7][j] = 1;
        }
        for(int i=0;i<8;i++){//左-右面墙壁
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;//中间障碍物
        map[3][2] = 1;
        map[2][2] = 1;

        //输出当前地图
        System.out.println("--------当前地图展示--------");
            for(int i = 0;i<map.length;i++){
                for(int j = 0;j<map[i].length;j++){
                    System.out.print(map[i][j]+" ");
                }
                System.out.println();
            }

        //使用findway方法找路
        Mou m = new Mou();
        m.findWay(map,1,1);//起始位置
        System.out.println("找路的情况如下：");
        //输出找路后地图
        System.out.println("======当前地图展示======");
        for(int i = 0;i<map.length;i++){
            for(int j = 0;j<map[i].length;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }

    }
}

//迷宫 8行7列  最外一圈为墙壁
/*
        1、方法的返回类型  boolean
        2、方法的名字  mouse
        3、方法的形参  int map[][], int i,  int j
        4、方法体   递归回溯

        1、findWay 方法就是专门来找出迷宫的路径
        2、如果找到 就返回true 反之false
        3、map 就是二维数组，即表示迷宫
        4、i ，j 表示老鼠的位置，初始化的位置（1，1）
        5、因为是递归找路，规定map数组各个值得含义
         0 表示可以走（走之前）   1 表示障碍物   2 表示可以走通（走过并且可以走通之）   3表示走过，但是走不通是死路
        6、当map[6][5] =2 说明找到通路，否则继续找
        7、找路的策略 下-右-上-左
 */

class Mou{
    public boolean findWay(int[][] map,int i,int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {//当前位置0，说明可以走
                map[i][j] = 2;//假定可以走通
                //使用找路策略，来确定该位置是否可以真的走通
                if (findWay(map, i + 1, j)) {//先走下
                    return true;
                } else if (findWay(map, i, j + 1)) {//右
                    return true;
                } else if (findWay(map, i - 1, j)) {//上
                    return true;
                } else if (findWay(map, i, j - 1)) {//左
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {//map[][] = 1,2,3
                return false;
            }
        }

    }
}


