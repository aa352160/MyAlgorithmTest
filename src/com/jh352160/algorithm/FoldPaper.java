package com.jh352160.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jh352160 on 2016/9/8.
 *
 * 请把纸条竖着放在桌⼦上，然后从纸条的下边向上⽅对折，压出折痕后再展 开。此时有1条折痕，
 * 突起的⽅向指向纸条的背⾯，这条折痕叫做“下”折痕 ；突起的⽅向指向纸条正⾯的折痕叫做“上”折痕。
 * 如果每次都从下边向上⽅ 对折，对折N次。请从上到下计算出所有折痕的⽅向。
 * 给定折的次数n,请返回从上到下的折痕的数组，若为下折痕则对应元素为"down",若为上折痕则为"up".
 * 测试样例：
 * 输入：1
 * 返回：["down"]
 */
public class FoldPaper {
    public String[] foldPaper(int n) {
        List<String> list=new ArrayList<>();
        list.add("down");
        for (int i = 0; i < n - 1; i++) {
            fold(list);
        }
        return list.toArray(new String[list.size()]);
    }

    public List<String> fold(List<String> list){
        int size=list.size();
        for (int i=0;i<=size;i++){
            list.add(i*2,(i&1)==1?"up":"down");
        }
        return list;
    }
}
