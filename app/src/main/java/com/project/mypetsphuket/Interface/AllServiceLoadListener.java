package com.project.mypetsphuket.Interface;

import java.util.List;

public interface AllServiceLoadListener {
    void onAllServiceLoadSuccess(List<String> areaNameList);
    void onAllServiceLoadFailed(String message);
}
