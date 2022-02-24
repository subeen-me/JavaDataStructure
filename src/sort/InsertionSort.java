package sort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 1. for(int index=0; index<dataList.size()-1; index++) 로 반복
 * 2. 반복문 안에서, for(int index2=index+1; index2>0; index2--)으로 반복
 *    내부 반복문 안에서 if(dataList.get(index2)<dataList.get(index2-1))이면, 스왑
 */

public class InsertionSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        for(int index=0; index<dataList.size()-1; index++) {
            for(int index2=index+1; index2>0; index2--) {
                if(dataList.get(index2)<dataList.get(index2-1)) {
                    Collections.swap(dataList, index2, index2-1);
                } else {
                    break;
                }
            }
        }
        return dataList;
    }
}
